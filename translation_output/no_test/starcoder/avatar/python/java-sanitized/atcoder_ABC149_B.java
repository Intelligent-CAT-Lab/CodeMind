import java.util.*;
public class atcoder_ABC149_B {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String number = sc.next();
        String[] arr = number.split(" ");
        int a = Integer.parseInt(arr[0]);
        int b = Integer.parseInt(arr[1]);
        int k = Integer.parseInt(arr[2]);
        int res = a - k;
        if (res < 0) {
            a = 0;
            b = b + res;
            b = 0 if (b < 0) else b;
        } else {
            a = res;
        }
        System.out.println(a + " " + b);
    }
}