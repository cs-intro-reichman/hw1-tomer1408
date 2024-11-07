public class TimeFormat {
    public static void main(String[] args) {
        int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
        int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));

        int newHours;
        String time;

        if (hours == 0) {
            newHours = 0;
            time = "AM";
        } else if (hours == 12) {
            newHours = 12; 
            time = "PM";
        } else if (hours > 12) {
            newHours = hours - 12;
            time = "PM";
        } else {
            newHours = hours;
            time = "AM";
        }

    
        String formattedMinutes = String.format("%02d", minutes);

        System.out.println(newHours + ":" + formattedMinutes + " " + time);
    }
}
