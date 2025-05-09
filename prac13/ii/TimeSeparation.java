public class TimeSeparation {
    public static void main(String[] args) {
        String strTime = "01:23:45 PM";
        int hours;
        int minutes;
        int seconds;
        String AmPm;
        String[] timeParts = strTime.split(":");
        hours = Integer.parseInt(timeParts[0]);
        minutes = Integer.parseInt(timeParts[1]);
        seconds = Integer.parseInt(timeParts[2].split(" ")[0]);
        AmPm = timeParts[2].split(" ")[1];
        if(AmPm.equals("PM") && hours<12)
            hours+=12;
        System.out.println("Time in String : "+strTime);
        System.out.println("Hours : "+hours+" | Minutes : "+minutes+" | Seconds : "+seconds);
    }    
}
