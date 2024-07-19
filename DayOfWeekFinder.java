import java.time.DayOfWeek;
import java.time.LocalDate;

public class DayOfWeekFinder {

    public static void main(String[] args) {
        // Check if the correct number of arguments is provided
        if (args.length != 3) {
            System.out.println("Usage: java DayOfWeekFinder day month year");
            return;
        }
        
        // Parse command line arguments
        int day = Integer.parseInt(args[0]);
        int month = Integer.parseInt(args[1]);
        int year = Integer.parseInt(args[2]);
        
        // Validate the date
        if (!isValidDate(day, month, year)) {
            System.out.println("Invalid date");
            return;
        }
        
        // Find and print the day of the week
        LocalDate date = LocalDate.of(year, month, day);
        DayOfWeek dayOfWeek = date.getDayOfWeek();
        System.out.printf("The day of the week for %d/%d/%d is %s\n", day, month, year, dayOfWeek);
    }

    // Function to check if the given date is valid
    private static boolean isValidDate(int day, int month, int year) {
        // Check if month is valid
        if (month < 1 || month > 12) {
            return false;
        }
        
        // Check if day is valid for the given month and year
        int maxDaysInMonth = LocalDate.of(year, month, 1).lengthOfMonth();
        if (day < 1 || day > maxDaysInMonth) {
            return false;
        }
        
        return true;
    }
}
