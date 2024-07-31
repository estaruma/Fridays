public class LeapYear {
    public static boolean isLeapYear(int year) {
        // All years divisible by 400 ARE leap years (so, for example, 2000 was indeed a leap year),
        if (year % 400 == 0) {
            return true;
            // All years divisible by 100 but not by 400 are NOT leap years (so, for example, 1700, 1800, and 1900 were NOT leap years, NOR will 2100 be a leap year),
        } else if (year % 100 == 0) {
            return false;
            // All years divisible by 4 but not by 100 ARE leap years (e.g., 2008, 2012, 2016),
        } else if (year % 4 == 0) {
            return true;
            // All years not divisible by 4 are NOT leap years (e.g. 2017, 2018, 2019).
        } else {
            return false;
        }
    }

}


















//    As a user, I want to know if a year is a leap year, So that I can plan for an extra day on February 29th during those years.
//
//        Acceptance Criteria:
//
//        All years divisible by 400 ARE leap years (so, for example, 2000 was indeed a leap year),
//        All years divisible by 100 but not by 400 are NOT leap years (so, for example, 1700, 1800, and 1900 were NOT leap years, NOR will 2100 be a leap year),
//        All years divisible by 4 but not by 100 ARE leap years (e.g., 2008, 2012, 2016),
//        All years not divisible by 4 are NOT leap years (e.g. 2017, 2018, 2019).
