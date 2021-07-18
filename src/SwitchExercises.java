public class SwitchExercises {
    public static void main(String[] args) {
        System.out.println(nameOfDay(1));
        System.out.println(nameOfMonth(5));
        System.out.println(isWeekday(0));
    }

    /**
     * Return the name of the day, according to user input.
     * @param day Integer in range 0-6
     * @return name of the day
     */
    public static String nameOfDay(int day) {
        switch (day) {
            case 0:
                return "Sunday";
            case 1:
                return "Monday";
            case 2:
                return "Tuesday";
            case 3:
                return "Wednesday";
            case 4:
                return "Thursday";
            case 5:
                return "Friday";
            case 6:
                return "Saturday";
            default:
                return "Invalid day!";
        }
    }

    /**
     * Return the name of the month, according to user input.
     * @param month Integer in range 1-12
     * @return name of the month
     */
    public static String nameOfMonth(int month) {
        switch (month) {
            case 1:
                return "January";
            case 2:
                return "February";
            case 3:
                return "March";
            case 4:
                return "April";
            case 5:
                return "May";
            case 6:
                return "June";
            case 7:
                return "July";
            case 8:
                return "August";
            case 9:
                return "September";
            case 10:
                return "October";
            case 11:
                return "November";
            case 12:
                return "December";
            default:
                return "Invalid month!";
        }
    }

    /**
     * Return true if the selected day is weekday and false if not.
     * @param day Integer in range 0-6
     * @return true or false
     */
    public static boolean isWeekday(int day) {
        switch (day) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                return true;
            case 6:
            case 0:
                return false;
        }
        return false;
    }
}
