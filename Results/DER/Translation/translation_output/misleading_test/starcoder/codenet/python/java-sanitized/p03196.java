import java.util.*;
public class p03196 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = sc.nextInt();
        int[] arr = new int[n];
        int temp = p;
        for (int i = 2; i <= Math.sqrt(p); i++) {
            if (temp % i == 0) {
                int cnt = 0;
                while (temp % i == 0) {
                    cnt++;
                    temp /= i;
                }
                arr[cnt - 1] = i;
            }
        }
        if (temp!= 1) {
            arr[arr.length - 1] = temp;
        }
        if (arr[0] == 0) {
            arr[0] = p;
        }
        int ans = 1;
        for (int i = 0; i < arr.length; i++) {
            ans *= arr[i];
        }
        System.out.println(ans);
    }
}