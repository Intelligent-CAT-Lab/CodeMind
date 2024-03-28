import java.util.ArrayList;
import java.util.Scanner;

public class p03648 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        System.out.println(50);
        int a = K / 50;
        int b = K % 50;
        ArrayList<String> ans = new ArrayList<>();
        for (int i = 0; i < 50 - b; i++) {
            ans.add(String.valueOf(a + i));
        }
        for (int i = 0; i < b; i++) {
            ans.add(String.valueOf(a + 50 - b + i + 1));
        }
        System.out.println(ans.toString().replaceAll(",", " "));
    }
}