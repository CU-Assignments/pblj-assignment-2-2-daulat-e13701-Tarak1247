import java.util.ArrayList;
import java.util.List;

public class Sumwithautoboxing {
    // Method to parse a list of strings into a list of Integers
    public static List<Integer> parseStringsToIntegers(String[] numbers) {
        List<Integer> intList = new ArrayList<>();
        for (String num : numbers) {
            intList.add(Integer.parseInt(num)); // Autoboxing
        }
        return intList;
    }

    // Method to calculate sum using autoboxing and unboxing
    public static int calculateSum(List<Integer> numbers) {
        int sum = 0;
        for (Integer num : numbers) {
            sum += num; // Unboxing
        }
        return sum;
    }

    public static void main(String[] args) {
        String[] inputNumbers = {"10", "20", "30", "40", "50"};
        List<Integer> integers = parseStringsToIntegers(inputNumbers);
        int sum = calculateSum(integers);
        System.out.println("Sum of numbers: " + sum);
    }
}