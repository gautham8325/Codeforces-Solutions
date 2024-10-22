import java.util.Scanner;

public class RatingIncrease {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t =sc. nextInt();
        while(t-- >0){
            String ab = sc.next();  // The combined string ab
            boolean found = false;
            
            // Try every possible split of the string into two parts
            for (int i = 1; i < ab.length(); i++) {
                String aStr = ab.substring(0, i);
                String bStr = ab.substring(i);
                
                if (aStr.charAt(0) == '0' || bStr.charAt(0) == '0') {
                    continue;
                }
                // Convert to integers to compare them numerically
                int a = Integer.parseInt(aStr);
                int b = Integer.parseInt(bStr);
                
                // Check if b > a
                if (b > a) {
                    System.out.println(a + " " + b);
                    found = true;
                    break;
                }
            }
            
            // If no valid split is found, print -1
            if (!found) {
                System.out.println("-1");
            }
        }
        sc.close();
    }
}
