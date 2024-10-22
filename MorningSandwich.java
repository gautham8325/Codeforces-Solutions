import java.util.Scanner;

public class MorningSandwich {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-- >0){
            int b =scanner.nextInt();
            int c = scanner.nextInt();
            int h =scanner.nextInt();
            int total = c+h;
            int possible = Math.min(b - 1, total);
            System.out.println(2*possible +1);
        }
        scanner.close();
    }
}
