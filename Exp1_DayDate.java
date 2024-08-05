public class Exp1_DayDate{

    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Usage: java DayOfWeekFinder day month year");
            return;
        }
        
        int day = Integer.parseInt(args[0]);
        int month = Integer.parseInt(args[1]);
        int year = Integer.parseInt(args[2]);
        
        if (!isValidDate(day, month, year)) {
            System.out.println("Invalid date");
            return;
        }
        
        int dayOfWeek = calculateDayOfWeek(day, month, year);
        
        System.out.printf("The day of the week for %d/%d/%d is %s\n", day, month, year, getDayOfWeekName(dayOfWeek));
    }

    // Function to check if the given date is valid
    private static boolean isValidDate(int day, int month, int year) {
        // Check if month is valid
        if (month < 1 || month > 12) {
            return false;
        }
        
        // Check if day is valid
        int maxDaysInMonth = getDaysInMonth(month, year);
        if (day < 1 || day > maxDaysInMonth) {
            return false;
        }
        return true;
    }

    // Function to calculate the number of days in a month for a given year
    private static int getDaysInMonth(int month, int year)
    {
        // Array containing the number of days in each month (index 0 is unused)
        int[] daysInMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        // Check for February in leap years
        if (month == 2 && ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)))
         {
            return 29;
         }
        else {
            return daysInMonth[month];
        }
    }

    // Function to calculate day of the week 
    private static int calculateDayOfWeek(int day, int month, int year) {
        if (month < 3) {
            month += 12;
            year--;
        }
        
        int k = year % 100; // year within century
        int j = year / 100; // century
        
        int dayOfWeek = (day + (13 * (month + 1) / 5) + k + (k / 4) + (j / 4) + 5 * j) % 7;
        return (dayOfWeek + 5) % 7 + 1;
    }

    // Function to get day of week name from its numeric value
    private static String getDayOfWeekName(int dayOfWeek) {
        switch (dayOfWeek) {
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
            case 7:
                return "Sunday";
            default:
                return "Invalid day calculation";
        }
    }
}
