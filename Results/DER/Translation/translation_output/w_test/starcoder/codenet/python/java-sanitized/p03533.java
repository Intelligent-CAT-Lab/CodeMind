import java.util.Scanner;
public class p03533 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        if(S.matches("^A?KIHA?BA?RA?$"))
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}