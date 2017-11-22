import java.util.Random;
import java.util.Scanner;

public class BeginRoute implements Runnable
{
    private Route route;
    private ClockGetterSetter currentTime;

    public BeginRoute(Route route, ClockGetterSetter currentTime)
    {
        this.route = route;
        this.currentTime = currentTime;
    }


    @Override
    public void run()
    {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        String time = "";
        String input;
        System.out.println("hello");
        int[] array = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 2};


        addStudents(route, 1000, currentTime);

        while(true)
        {
            int num = rand.nextInt(20);
            try
            {
                Thread.sleep(1000);
            }
            catch (InterruptedException e)
            {
                //e.printStackTrace();
            }
            addStudents(route, array[num], currentTime);

            if(currentTime.getTime().equals("23:30"))
                break;
        }

        //route.printTimes();

        //System.exit(0);
    }


    public static void addStudents(Route route, int addNum, ClockGetterSetter currentTime)
    {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        String input = "";
        TimeSlot[] times;

        int id = 0;
        int hour = 0;
        int min = 0;
        int stopIndex = 0;
        int timeIndex = -1;


        for (int i = 0; i < addNum; i++)
        {
            int offset = 0;
            id = rd.nextInt(99999999);
            while(hour * 60 + min < currentTime.getiHour()*60+currentTime.getiMin()) {
                hour = rd.nextInt(22);
                min = rd.nextInt(59);
            }
            stopIndex = rd.nextInt(route.getBusStops().size());
            //System.out.println( "    " + hour + ":" + min);
            Student student = new Student("Test", id);
            times= findTimes(route, stopIndex, hour, min);

            if (times[1].toString().equals("0:00"))
                timeIndex = times[0].getHour() * 60 + times[0].getMinute();
            else
                timeIndex = times[1].getHour() * 60 + times[1].getMinute();

            route.getTimeSlots().get(timeIndex).getStudents().add(student);
            System.out.printf("%s Student: %-9s added to %s at %-15s %s %d. \n", currentTime.getTime(), id, route.getBusStops().get(stopIndex).getName()
                    , times[1].toString()
                    , "Seats Left:"
                    ,  70 - route.getTimeSlots().get(times[1].getHour() * 60 + times[1].getMinute()).getStudents().size());
            for (int j = stopIndex + 1; j < route.getBusStops().size(); j++)
            {
                offset += route.getBusStops().get(j -1).getOffset();
                route.getTimeSlots().get(timeIndex + offset).getStudents().add(student);
                //System.out.println("   " + route.getTimeSlots().get(timeIndex + offset).toString());
            }
            //route.printTimes();
            hour = 0;
            min = 0;
        }
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
}