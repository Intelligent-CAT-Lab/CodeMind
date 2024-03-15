import java.util.*;
import java.text.*;
public class p01040 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y1 = sc.nextInt();
        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int y2 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();
        int qq, y11;
        qq = y1 / 400;
        y11 = y1 + 400;
        qq--;
        int q = (y2 - y11) / 400;
        y2 -= 400 * q;
        int a = 688 * (q - qq);
        Date d = new Date(y1, m1, d1);
        while (d.compareTo(new Date(y2, m2, d2)) <= 0) {
            if (d.getDay() == 4 && d.getDate() == 13)
                a++;
            d.setDate(d.getDate() + 1);
        }
        System.out.println(a);
    }
}