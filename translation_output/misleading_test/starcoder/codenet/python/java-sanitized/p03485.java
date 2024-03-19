import java.util.*;
public class p03485 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = (a+b)/2;
        int d = (int)c;
        if(c-d>0)
            System.out.println(d+1);
        else
            System.out.println(d);
    }
}