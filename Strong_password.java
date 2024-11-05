import java.util.Scanner;

public class Strong_password {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            String s = in.next();
            String g = "";
            int j=-1;
            for(int i=0;i<s.length()-1;i++){
                if(s.charAt(i)==s.charAt(i+1)){
                    j=i;
                    break;
                }
            }
            if(j==-1) {
                if((s.charAt(s.length()-1)+1)=='{'){
                    g = s + 'a';
                }else
                    g = s + (char) (s.charAt(s.length() - 1) + 1);
                System.out.println(g);
            }else{
                if((char)(s.charAt(j)+1)=='{')
                    g=s.substring(0,j+1)+'a'+s.substring(j+1);
                else
                    g=s.substring(0,j+1)+(char)(s.charAt(j)+1)+s.substring(j+1);
                System.out.println(g);
            }
        }
        in.close();
    }
}