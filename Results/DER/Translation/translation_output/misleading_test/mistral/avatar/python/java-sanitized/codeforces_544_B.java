import java.util.*;

public class codeforces_544_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[2];
        for (int i = 0; i < 2; i++) {
            numbers[i] = sc.nextInt();
        }
        String result = "";
        for (int i = 0; i < numbers[0]; i++) {
            result += (numbers[0] - i) % numbers[1] == 0 ? "L" : "S";
        }
        if (result.length() < numbers[1]) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
            System.out.println(result);
        }
    }
}