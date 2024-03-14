import java.util.Scanner;

public class p03631 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        int a100 = a//100;
        int a10 = a//10 - a100*10;
        int a1 = a - a100*100 - a10*10;
        int rev = a1*100 + a10*10 + a100;
        String ans;

        if (a == rev){
            ans = "Yes";
        } else {
            ans = "No";
        }

        System.out.println(ans);
    }
}