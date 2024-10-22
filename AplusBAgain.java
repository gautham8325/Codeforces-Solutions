import java.util.Scanner;

public class AplusBAgain {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int t= sc.nextInt();
        while(t-- >0){
            int n = sc.nextInt();
            int answer=0;
            while(n!=0){
                answer=answer + n%10;
                n=n/10;
            }
            System.out.println(answer);
        }
        sc.close();
    }
}