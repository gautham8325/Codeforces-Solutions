import java.util.Scanner;

public class StrongPassword {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine(); // Consume the newline after the integer input

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < t; i++) {
            String s = scanner.nextLine();
            result.append(maximizeTypingTime(s)).append("\n");
        }
        
        System.out.print(result.toString());
        scanner.close();
    }

    // Function to calculate typing time for a given string
    public static int calculateTypingTime(String s) {
        int time = 2; // Initial time for the first character
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                time += 1;
            } else {
                time += 2;
            }
        }
        return time;
    }

    // Function to find the modified string with maximum typing time
    public static String maximizeTypingTime(String s) {
        int maxTime = 0;
        String bestString = s;

        // Try inserting each letter at every position in the string
        for (int i = 0; i <= s.length(); i++) {
            for (char ch = 'a'; ch <= 'z'; ch++) {
                String newString = s.substring(0, i) + ch + s.substring(i);
                int typingTime = calculateTypingTime(newString);

                // Update if we found a new maximum typing time
                if (typingTime > maxTime) {
                    maxTime = typingTime;
                    bestString = newString;
                }
            }
        }
        return bestString;
    }
}
