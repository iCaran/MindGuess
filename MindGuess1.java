import java.util.Arrays;
import java.util.Scanner;

public class MindGuess {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Take input array from user
        System.out.println("Welcome to Mind Guess!");
        System.out.println("Enter numbers for the array (space-separated): ");
        String[] input = sc.nextLine().trim().split("\\s+");

        int[] arr = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            try {
                arr[i] = Integer.parseInt(input[i]);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input: Please enter integers only.");
                return;
            }
        }

        // Step 2: Sort the array
        Arrays.sort(arr);
        System.out.println("Your sorted array: " + Arrays.toString(arr));

        // Step 3: Ask user to think of a number
        System.out.println("Now, think of a number from the array (but don’t tell me).");
        System.out.println("I will try to guess it using binary search.");
        System.out.println("You just need to respond with: 'higher', 'lower', or 'correct'.");

        int left = 0, right = arr.length - 1;
        boolean found = false;

        // Step 4: Binary search guessing loop
        while (left <= right) {
            int mid = left + (right - left) / 2;
            System.out.println("Is your number " + arr[mid] + "? (higher/lower/correct)");
            String response = sc.nextLine().trim().toLowerCase();

            if (response.equals("correct")) {
                System.out.println("Yay! I guessed your number: " + arr[mid]);
                found = true;
                break;
            } else if (response.equals("higher")) {
                left = mid + 1;
            } else if (response.equals("lower")) {
                right = mid - 1;
            } else {
                System.out.println("Invalid response. Please type 'higher', 'lower', or 'correct'.");
            }
        }

        if (!found) {
            System.out.println("Hmm... seems like your number wasn’t in the array.");
        }

        sc.close();
    }
}
