import java.util.Scanner;

public class MindGuess {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Mind Guess!");
        System.out.println("Think of ANY integer (positive or negative).");
        System.out.println("Don’t tell me, just keep it in your mind.");
        System.out.println("Respond with: 'higher', 'lower', or 'correct'.");

        int step = 1;
        int left = -1, right = 1;

        // Expand range symmetrically until the number is inside [left, right]
        while (true) {
            System.out.println("Is your number between " + left + " and " + right + "? (yes/no/correct-if-boundary)");
            String response = sc.nextLine().trim().toLowerCase();

            if (response.equals("yes")) {
                break; // bracket found
            } else if (response.equals("correct")) {
                System.out.println("Yay! Your number is one of the boundaries: " + left + " or " + right);
                sc.close();
                return;
            } else {
                step *= 2;
                left = -step;
                right = step;
            }
        }

        // Binary search inside [left, right]
        while (left <= right) {
            int mid = left + (right - left) / 2;
            System.out.println("Is your number " + mid + "? (higher/lower/correct)");
            String response = sc.nextLine().trim().toLowerCase();

            if (response.equals("correct")) {
                System.out.println("Yay! I guessed your number: " + mid);
                break;
            } else if (response.equals("higher")) {
                left = mid + 1;
            } else if (response.equals("lower")) {
                right = mid - 1;
            } else {
                System.out.println("Invalid response. Please type 'higher', 'lower', or 'correct'.");
            }
        }

        sc.close();
    }
}

