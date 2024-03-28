import java.util.Scanner;

public class p03024 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int a = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == 'x') {
                a++;
            }
        }
        System.out.println(a <= 7 ? "YES" : "NO");
    }
}