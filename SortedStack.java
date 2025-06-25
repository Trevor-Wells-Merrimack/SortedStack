import java.util.Collections; // Reuse: Java utility for sorting
import java.util.Scanner;     // Reuse: for reading input
import java.util.Stack;       // Maintenance change: now using Stack

/**
 * The SortedStack class reads integers from user input,
 * stores them in a Stack, sorts the stack, and prints the result.
 *
 * Maintenance Task: Adapted from the previous LinkedList version.
 * Only data structure has changed; input and sorting logic reused.
 */
public class SortedStack {

    /**
     * Main method reads input, pushes integers onto a Stack,
     * sorts the Stack, and prints the sorted elements.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Maintenance update: Stack replaces LinkedList
        Stack<Integer> numbers = new Stack<>();

        System.out.println("Enter one integer at a time and press Enter after each entry.");
        System.out.println("To stop entering numbers, type any non-integer (like 'x') and press Enter.");

        while (scanner.hasNext()) {
            if (scanner.hasNextInt()) {
                int num = scanner.nextInt();

                // Reuse: now using push() instead of add()
                numbers.push(num);
            } else {
                break;
            }
        }

        // Reuse: Collections.sort still works on Stack
        Collections.sort(numbers);

        System.out.println("Sorted Stack (bottom to top):");
        for (Integer number : numbers) {
            System.out.print(number + " ");
        }

        scanner.close();
    }
}
