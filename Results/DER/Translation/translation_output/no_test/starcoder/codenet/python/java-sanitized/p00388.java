import java.util.*;
public class p00388 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int count = 0;
        for(int i = a; i <= b; i++) {
            if(h % (i + 1) == 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}