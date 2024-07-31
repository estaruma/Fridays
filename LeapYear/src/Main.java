import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {

        IntStream.range(2000,2024).forEach((year ->  {
            if (LeapYear.isLeapYear(year)) {
                System.out.println(year + " is a leap year");
            } else {
                System.out.println(year + " is not a leap year");
            }

        }));




//        int year = 2024;
//
//        if (LeapYear.isLeapYear(year)) {
//            System.out.println("its a leap year");
//        } else {
//            System.out.println("it is not a leap year");
//        }
    }
}