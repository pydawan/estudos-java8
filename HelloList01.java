import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HelloList01 {
    public static void main(String args[]) {
        List<Integer> numbers = Arrays.asList(7, 1, 5, 3, 2, 4, 6);
        List<Integer> sortedNumbers = new ArrayList<>(numbers);
        Collections.sort(sortedNumbers);

        System.out.print("NUMBERS: ");
        numbers.forEach(System.out::print);
        
        System.out.print("\nSORTED NUMBERS: ");
        sortedNumbers.forEach(System.out::print);
        System.out.println();
    }
}
