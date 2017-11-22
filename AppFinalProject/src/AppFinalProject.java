import java.util.ArrayList;
import java.util.Calendar;
import java.util.Random;
import java.util.Scanner;

public class AppFinalProject 
{
	public static void main(String args[])
	{
		ArrayList<Route> routes = new ArrayList<>();
		TimeSlot start = new TimeSlot(6, 32, "Start");
		TimeSlot end = new TimeSlot(22, 34, "End");
		ArrayList<Thread> threads = new ArrayList<>();
		Route route;
		Calendar now = Calendar.getInstance();


		
		route = new Route("Route 43", start, end);
		route.addBusStop("Campus Oval", 3);
		route.addBusStop("Barshop Lot 2", 1);
		route.addBusStop("Barshop Lot 1", 2);
		route.addBusStop("Brackenridge Lot 4", 2);
		route.addBusStop("Brackenridge Lot 5", 1);
		route.addBusStop("Brackenridge Lot 3", 9);
		routes.add(route);
		route.fillTimeSlots();
		ClockGetterSetter currentTime = new ClockGetterSetter(now.get(Calendar.HOUR_OF_DAY), now.get(Calendar.MINUTE));
		Thread clock = new Thread(new Clock(route, currentTime));
		clock.start();
		threads.add(new Thread(new BeginRoute(route, currentTime)));

		start = new TimeSlot(6, 40, "Start");
		end = new TimeSlot(22, 30, "End");
		route = new Route("Route 13", start, end);
		route.addBusStop("Arts Building", 5);
		route.addBusStop("East Campus Lot 1", 2);
		route.addBusStop("East Campus Lot 2", 8);
		routes.add(route);
		route.fillTimeSlots();
		threads.add(new Thread(new BeginRoute(route, currentTime)));

		start = new TimeSlot(6, 40, "Start");
		end = new TimeSlot(22, 29, "End");
		route = new Route("Route 12", start, end);
		route.addBusStop("Arts Building", 4);
		route.addBusStop("Hill Country Place", 8);
		routes.add(route);
		route.fillTimeSlots();
		threads.add(new Thread(new BeginRoute(route, currentTime)));

		start = new TimeSlot(6, 40, "Start");
		end = new TimeSlot(22, 33, "End");
		route = new Route("Route 14", start, end);
		route.addBusStop("Arts Building", 5);
		route.addBusStop("The Parq", 1);
		route.addBusStop("Broadstone", 2);
		route.addBusStop("The Luxx", 7);
		routes.add(route);
		route.fillTimeSlots();
		threads.add(new Thread(new BeginRoute(route, currentTime)));

		start = new TimeSlot(6, 45, "Start");
		end = new TimeSlot(22, 32, "End");
		route = new Route("Route 20", start, end);
		route.addBusStop("Ford Lot", 4);
		route.addBusStop("The Outpost", 3);
		route.addBusStop("Avalon Place", 8);
		routes.add(route);
		route.fillTimeSlots();
		threads.add(new Thread(new BeginRoute(route, currentTime)));

		start = new TimeSlot(6, 40, "Start");
		end = new TimeSlot(22, 31, "End");
		route = new Route("Route 22", start, end);
		route.addBusStop("Ford Lot", 4);
		route.addBusStop("Villas at Babcock", 2);
		route.addBusStop("The Reserve", 9);
		routes.add(route);
		route.fillTimeSlots();
		threads.add(new Thread(new BeginRoute(route, currentTime)));

		start = new TimeSlot(6, 40, "Start");
		end = new TimeSlot(22, 29, "End");
		route = new Route("Route 40", start, end);
		route.addBusStop("Campus Oval", 4);
		route.addBusStop("Tetro Village", 11);
		routes.add(route);
		route.fillTimeSlots();
		threads.add(new Thread(new BeginRoute(route, currentTime)));

		start = new TimeSlot(6, 47, "Start");
		end = new TimeSlot(22, 34, "End");
		route = new Route("Route 42", start, end);
		route.addBusStop("Campus Oval", 7);
		route.addBusStop("High View Place", 2);
		route.addBusStop("Maverick Creek", 6);
		routes.add(route);
		route.fillTimeSlots();
		threads.add(new Thread(new BeginRoute(route, currentTime)));

		for (int k = 0; k < threads.size(); k++)
			threads.get(k).start();

		//let the main class wait on the other t
		while(!currentTime.getTime().equals("23:30"));

		clock.interrupt();
		//System.out.println("\n" + currentTime.getTime());
		for (int k = 0; k < threads.size(); k++)
			threads.get(k).interrupt();

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		for(int k = 0; k < routes.size(); k++)
			routes.get(k).printTimes();

		System.out.println("\n" + currentTime.getTime());
		System.exit(0);


	}

	/*
	public static void lookUpTime(ArrayList<Route> routes)
	{
		Scanner sc = new Scanner(System.in);
		Boolean bContinue = true;
		TimeSlot[] times;
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
		times = findTimes(routes.get(r), s, hour, min);

	}



	public static TimeSlot[] findTimes(Route route, int stopIndex, int iStartHour, int iStartMin)
	{
		int iHour = iStartHour;
		int iMin = iStartMin;
		int timesFound = 0;
		TimeSlot[] times = new TimeSlot[3];
		TimeSlot closeTime = new TimeSlot(0, 0, "NULL");
		TimeSlot laterTime = new TimeSlot(0, 0, "NULL");
		TimeSlot earlyTime = new TimeSlot(0, 0, "NULL");

		int iTime = iHour * 60 + iMin;
		String szStop = route.getBusStops().get(stopIndex).getName();

		while(timesFound < 2 && iTime < 24 * 60)
		{
			iTime = iHour * 60 + iMin;

			if (route.hasSeats(iTime) && route.getTimeSlots().get(iTime).getStop().equals(szStop)) {
				if (timesFound == 0) {
					closeTime = route.getTimeSlots().get(iTime);
					timesFound = 1;
				}
				else
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
			if (route.hasSeats(iTime) && route.getTimeSlots().get(iTime).getStop().equals(szStop))
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


		times[0] = earlyTime;
		times[1] = closeTime;
		times[2] = laterTime;

		return times;
	}



	public static void begin(Route route, ClockGetterSetter currentTime)
	{
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		String time = "";
		String input;



		addStudents(route, 1000, currentTime);

		while(true)
		{
			int num = rand.nextInt(4);
			try
			{
				Thread.sleep(1000);
			}
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
			addStudents(route, num, currentTime);

			if(currentTime.getTime().equals("20:00"))
				break;
		}
		route.printTimes();

		System.exit(0);

	}

	*/




}
