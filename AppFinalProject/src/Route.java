import java.util.ArrayList;

public class Route 
{
	private ArrayList<TimeSlot> timeSlots;
	private ArrayList<BusStop> busStops;
	private String name;
	private TimeSlot start;
	private TimeSlot end;
	private int studentLimit;

	public Route(String szName, TimeSlot start, TimeSlot end)
	{
		this.setTimeSlots(new ArrayList<>());
		this.setBusStops( new ArrayList<>());
		//this.setStudents( new ArrayList<>());
		this.setName(szName);
		this.setStart(start);
		this.setEnd(end);
		this.studentLimit = 70;
	}
	

	public void addBusStop(String name, int offset)
	{
		BusStop stop = new BusStop(name, offset);
		this.getBusStops().add(stop);
	}


	public Boolean hasSeats(int iTime)
	{
		if (this.getTimeSlots().get(iTime).getStudents().size() < this.studentLimit)
			return true;
		else
			return false;

	}


	public void fillTimeSlots()
	{

		int iH = 0;
		int iM = 0;
		int sH = this.getStart().getHour();
		int sM = this.getStart().getMinute();
		int endH = this.getEnd().getHour() ;
		int endM = this.getEnd().getMinute();
		int stopCount = 0;
		Boolean bEnd = false;



		for(;iH < 24; iM++)
		{
			TimeSlot time;
			String stopName = getBusStops().get(stopCount).getName();
			int offsetAmount = getBusStops().get(stopCount).getOffset();

			if (iM >= 60)
			{
				iM = 0;
				iH++;
			}
			if (iH == sH && iM == sM && !bEnd)
			{
				time = new TimeSlot(sH, sM, stopName);
				stopCount++;
				if (stopCount == this.getBusStops().size())
					stopCount = 0;
				sM += offsetAmount;
				if (sM >= 60)
				{
					sM -= 60;
					sH++;
				}
			}
			else
				time = new TimeSlot(iH, iM, "NULL");
			this.getTimeSlots().add(time);

			if (iH == endH && iM == endM)
				bEnd = true;
		}

	}
	

	




	public void printTimes()
	{
		System.out.println("\n");
		for (int i = 0; i < this.getBusStops().size(); i++)
		{
			System.out.printf("%24s", this.getBusStops().get(i).getName());
		}
		System.out.println();
		int stopCount = 0;
		for (int j = 0; j < this.getTimeSlots().size(); j++)
		{
			if (!this.getTimeSlots().get(j).getStop().equals("NULL")) {
				System.out.printf("%20s %d", this.getTimeSlots().get(j).toString(), 70 - this.getTimeSlots().get(j).getStudents().size());
				stopCount++;
				if (stopCount >= this.getBusStops().size())
				{
					stopCount = 0;
					System.out.println();
				}
			}
		}
	}

	public ArrayList<TimeSlot> getTimeSlots() {
		return timeSlots;
	}

	public void setTimeSlots(ArrayList<TimeSlot> timeSlots) {
		this.timeSlots = timeSlots;
	}

	public TimeSlot getStart() {
		return start;
	}

	public void setStart(TimeSlot start) {
		this.start = start;
	}

	public TimeSlot getEnd() {
		return end;
	}

	public void setEnd(TimeSlot end) {
		this.end = end;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public ArrayList<BusStop> getBusStops() {
		return busStops;
	}


	public void setBusStops(ArrayList<BusStop> busStops) {
		this.busStops = busStops;
	}


}
