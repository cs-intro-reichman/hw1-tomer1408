// Represents the hh:mm time format using an AM/PM format. 
public class TimeFormat {
    public static void main(String[] args) {

        int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
   
        int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));

        int newHours;
        String time;

        if (hours > 12) {
            newHours = hours - 12;
            time = "PM";
        } else {
            newHours = (hours == 0) ? 12 : hours; 
            time = "AM";
        }

        System.out.println(newHours + ":" + minutes + " " + time);
    }
}

