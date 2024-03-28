import java.util.*;
public class p02743 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(c-a-b < 0)
            System.out.println("No");
        else
            System.out.println("Yes" + (4*a*b < (c-a-b)**2? "" : "No"));
    }
}