import java.util.*;
public class codeforces_379_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int x = a;
        int h = 0;
        int s = 0;
        while (x > 0) {
            x--;
            h++;
            s++;
        }
        while (s / b!= 0) {
            h++;
            s = s - b + 1;
        }
        System.out.println(h);
    }
}