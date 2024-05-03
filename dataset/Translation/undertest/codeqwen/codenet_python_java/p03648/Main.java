import java.util.Scanner;
import java.util.ArrayList;

public class p03648 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int K = scanner.nextInt();
        System.out.println(50);
        int a = K / 50;
        int b = K % 50;
        ArrayList<String> ans = new ArrayList<>();
        for (int i = 50 - b; i < 50; i++) {
            ans.add(String.valueOf(a + i));
        }
        for (int i = 0; i < b; i++) {
            ans.add(String.valueOf(a + 50 - b + i + 1));
        }
        String[] ansArray = new String[ans.size()];
        ansArray = ans.toArray(ansArray);
        System.out.println(String.join(" ", ansArray));
    }
}