import java.util.*;
public class p00094 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a<=100 && b<=100)
            System.out.printf("%.4f",a*b/3.305785);
    }
}