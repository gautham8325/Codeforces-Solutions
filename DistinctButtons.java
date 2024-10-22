import java.util.Scanner;

public class DistinctButtons {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // Number of test cases
        
        while (t-- > 0) {
            int n = sc.nextInt(); // Number of special points
            
            boolean hasPositiveX = false, hasNegativeX = false;
            boolean hasPositiveY = false, hasNegativeY = false;
            
            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();
                int y = sc.nextInt();
                
                if (x > 0) hasPositiveX = true;
                if (x < 0) hasNegativeX = true;
                if (y > 0) hasPositiveY = true;
                if (y < 0) hasNegativeY = true;
            }
            
            // If we need both directions in both axes, we would need 4 distinct buttons
            if ((hasPositiveX && hasNegativeX) && (hasPositiveY && hasNegativeY)) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
        sc.close();
    }
}
