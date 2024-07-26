import java.util.stream.IntStream;

public class FizzBuzzKata {

    public static void main(String[] args) {

        IntStream.range(1, 100).forEach(number -> System.out.println(fizzBuzz(number)));


        // array of numbers 1-100{
        //array to hold numbers
//        int[] numbers = new int[100];
//
//        // array with numbers 1-100
//        for (int i = 0; i < 100; i++) {
//            //assign value to i+1 for each element
//            numbers[i] = i + 1;
//        }
//
//        for (int number : numbers) {
//            System.out.println(fizzBuzz(number));
//        }
    }

    //method for word or number
    public static String fizzBuzz(int number) {
        //number is dividable by 3 or 5
        boolean isDivisibleByThree = number % 3 == 0;
        boolean isDivisibleByFive = number % 5 == 0;
        boolean containsFive = String.valueOf(number).contains("5");
        boolean containsThree = String.valueOf(number).contains("3");
        boolean containsBoth = containsThree && containsFive;


        if (!isDivisibleByFive && containsBoth) {
            return "FizzBuzz";
        } else if (isDivisibleByFive && containsBoth) {
            return "FizzBuzzBuzz";
        } else if (isDivisibleByThree) {
            return "Fizz";
        } else if (isDivisibleByFive) {
            return "Buzz";
        } else if (containsThree) {
            return "Fizz";
        } else if (containsFive) {
            return "Buzz";
        } else {
            return String.valueOf(number);
        }





//        if (number % 3 == 0 && number % 5 == 0) {
//            return "FizzBuzz";
//        } else if (String.valueOf(number).contains("3") && String.valueOf(number).contains("5")) {
//            return "FizzBuzz";
//        } else if (String.valueOf(number).contains("5") && String.valueOf(number).contains("3")) {
//            return "FizzBuzzBuzz";
//        } else if (number % 3 == 0 || String.valueOf(number).contains("3")) {
//            return "Fizz";
//        } else if (number % 5 == 0 || String.valueOf(number).contains("5")) {
//            return "Buzz";
//        } else {
//            return String.valueOf(number);
//        }
    }
}

