import java.util.*;
public class p03502 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        String ans = "No";
        String[] list = String.valueOf(n).split("");
        for (int i = 0; i < list.length; i++) {
            sum += Integer.parseInt(list[i]);
        }
        if (n % sum == 0) {
            ans = "Yes";
        }
        System.out.println(ans);
    }
}