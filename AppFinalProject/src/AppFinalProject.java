import java.util.ArrayList;
import java.util.Scanner;

public class AppFinalProject 
{
	public static void main(String args[])
	{
		ArrayList<Route> routes = new ArrayList<>();
		Route route;
		
		TimeSlot start = new TimeSlot(6, 32, "Start");
		TimeSlot end = new TimeSlot(22, 34, "End");
		
		route = new Route("Route 43", start, end);
		route.addBusStop("Campus Oval", 3);
		route.addBusStop("Barshop Lot 2", 1);
		route.addBusStop("Barshop Lot 1", 2);
		route.addBusStop("Brackenridge Lot 4", 2);
		route.addBusStop("Brackenridge Lot 5", 1);
		route.addBusStop("Brackenridge Lot 3", 9);
		routes.add(route);

		start = new TimeSlot(6, 40, "Start");
		end = new TimeSlot(22, 30, "End");
		route = new Route("Route 13", start, end);
		route.addBusStop("Arts Building", 5);
		route.addBusStop("East Campus Lot 1", 2);
		route.addBusStop("East Campus Lot 2", 8);
		routes.add(route);

		start = new TimeSlot(6, 40, "Start");
		end = new TimeSlot(22, 29, "End");
		route = new Route("Route 12", start, end);
		route.addBusStop("Arts Building", 4);
		route.addBusStop("Hill Country Place", 8);
		routes.add(route);

		start = new TimeSlot(6, 40, "Start");
		end = new TimeSlot(22, 33, "End");
		route = new Route("Route 14", start, end);
		route.addBusStop("Arts Building", 5);
		route.addBusStop("The Parq", 1);
		route.addBusStop("Broadstone", 2);
		route.addBusStop("The Luxx", 7);
		routes.add(route);

		start = new TimeSlot(6, 45, "Start");
		end = new TimeSlot(22, 32, "End");
		route = new Route("Route 20", start, end);
		route.addBusStop("Ford Lot", 4);
		route.addBusStop("The Outpost", 3);
		route.addBusStop("Avalon Place", 8);
		routes.add(route);

		start = new TimeSlot(6, 40, "Start");
		end = new TimeSlot(22, 31, "End");
		route = new Route("Route 22", start, end);
		route.addBusStop("Ford Lot", 4);
		route.addBusStop("Villas at Babcock", 2);
		route.addBusStop("The Reserve", 9);
		routes.add(route);

		start = new TimeSlot(6, 40, "Start");
		end = new TimeSlot(22, 29, "End");
		route = new Route("Route 40", start, end);
		route.addBusStop("Campus Oval", 4);
		route.addBusStop("Tetro Village", 11);
		routes.add(route);

		start = new TimeSlot(6, 47, "Start");
		end = new TimeSlot(22, 34, "End");
		route = new Route("Route 42", start, end);
		route.addBusStop("Campus Oval", 7);
		route.addBusStop("High View Place", 2);
		route.addBusStop("Maverick Creek", 6);
		routes.add(route);

		for (int k = 0; k < routes.size(); k++)
			routes.get(k).fillTimeSlots();


		lookUpTime(routes);


	}


	public static void lookUpTime(ArrayList<Route> routes)
	{
		Scanner sc = new Scanner(System.in);
		Boolean bContinue = true;
		int r = 0;
		int hour;
		int min;
		for (int j = 0; j < routes.size(); j++)
		{
			System.out.print(j + ")  " + routes.get(j).getName() + "     ");
		}
		r = sc.nextInt();
		System.out.println("Which stop will you be near?");
		for (int i = 0; i < routes.get(r).getBusStops().size(); i++) {
			System.out.print(i + ")  " + routes.get(r).getBusStops().get(i).getName() + "     ");
		}
		int s = sc.nextInt();
		System.out.println("What time will you arrive?");
		String time = sc.next();
		String splitTime[] = time.split(":");
		hour = Integer.parseInt(splitTime[0]);
		min = Integer.parseInt(splitTime[1]);
		routes.get(r).printTimes();
		findTimes(routes.get(r), s, hour, min);

	}



	public static void findTimes(Route route, int stopIndex, int iStartHour, int iStartMin)
	{
		int iHour = iStartHour;
		int iMin = iStartMin;
		int timesFound = 0;
		TimeSlot closeTime = new TimeSlot(0, 0, "NULL");
		TimeSlot laterTime = new TimeSlot(0, 0, "NULL");
		TimeSlot earlyTime = new TimeSlot(0, 0, "NULL");

		int iTime = iHour * 60 + iMin;
		String szStop = route.getBusStops().get(stopIndex).getName();

		while(timesFound < 2 && iTime < 24 * 60)
		{
			iTime = iHour * 60 + iMin;

			if (route.getTimeSlots().get(iTime).getStop().equals(szStop)) {
				if (timesFound == 0) {
					closeTime = route.getTimeSlots().get(iTime);
					timesFound = 1;
				}
				else if (timesFound == 1)
				{
					laterTime = route.getTimeSlots().get(iTime);
					timesFound = 2;
				}
			}
			iMin++;
			if (iMin >= 60)
			{
				iMin -= 60;
				iHour++;
			}
		}
		iHour = iStartHour;
		iMin = iStartMin;

		while (timesFound < 3 && iTime > -1)
		{
			iTime = iHour * 60 + iMin;
			if (route.getTimeSlots().get(iTime).getStop().equals(szStop))
			{
				earlyTime = route.getTimeSlots().get(iTime);
				timesFound = 3;
			}
			iMin--;
			if (iMin <= -1)
			{
				iMin += 60;
				iHour--;
			}
		}

		System.out.println("\nClosest Time: " + closeTime.toString());
		System.out.println("Next Time: " + laterTime.toString());
		System.out.println("Earlier Time: " + earlyTime.toString());


	}
	


}
