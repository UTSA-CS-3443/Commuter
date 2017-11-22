import java.util.ArrayList;

public class TimeSlot
{
	private int hour;
	private int minute;
	private String stop;
	private int offset;
	private ArrayList<Student> students;
	private int studentLimit = 70;

	public TimeSlot(int iHour, int iMinute, String stop)
	{
		this.setHour(iHour);
		this.setMinute(iMinute);
		this.setStop(stop);
		this.students = new ArrayList<Student>();
	}
	
	public String toString()
	{
		if (this.getMinute() < 10)
			return this.getHour() + ":0" + this.getMinute();
		else
			return this.getHour() + ":" + this.getMinute();
			
	}




	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		this.minute = minute;
	}


	public String getStop() {
		return stop;
	}

	public void setStop(String stop)
	{
		this.stop = stop;
	}

	public ArrayList<Student> getStudents()
	{
		return students;
	}

}
