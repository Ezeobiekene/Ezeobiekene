public class Names{

    //obtain the total milliseconds since Midnight, Jan 1 1970
    public static void main(String[] args) {
        long totalMilliseconds = System.currentTimeMillis();

        //total seconds
        long totalSeconds = totalMilliseconds / 1000;

        long  currentSecond = (int) (totalSeconds % 60);

        long totalMinutes = totalSeconds / 60;

        long currentMinute = (int) (totalMinutes % 60);
        
        long totalHours = totalMinutes / 60;

        long currentHour = (int) (totalHours % 24);

        System.out.println("Current time is  " + currentHour + ":"
        + currentMinute + ":" + currentSecond + " GMT");
    }

}