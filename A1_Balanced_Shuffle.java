import java.util.*;

public class A1_Balanced_Shuffle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        scanner.close();

        int n = s.length();
        List<Pair> table = new ArrayList<>();

        // Step 1: Calculate prefix balance and populate the table
        int balance = 0;
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            table.add(new Pair(balance, i, ch));
            balance += (ch == '(') ? 1 : -1;
        }

        // Step 2: Sort the table
        Collections.sort(table, (a, b) -> {
            if (a.prefixBalance != b.prefixBalance) {
                return Integer.compare(a.prefixBalance, b.prefixBalance);
            } else {
                return Integer.compare(b.position, a.position); // Sort positions in descending order for ties
            }
        });

        // Step 3: Construct the result from the sorted characters
        StringBuilder result = new StringBuilder();
        for (Pair p : table) {
            result.append(p.character);
        }

        // Output the result
        System.out.println(result.toString());
    }

    // Helper class to store each character's prefix balance, position, and the character itself
    static class Pair {
        int prefixBalance;
        int position;
        char character;

        Pair(int prefixBalance, int position, char character) {
            this.prefixBalance = prefixBalance;
            this.position = position;
            this.character = character;
        }
    }
}
