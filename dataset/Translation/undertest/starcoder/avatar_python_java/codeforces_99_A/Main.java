import java.util.Scanner;
public class codeforces_99_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] num = sc.next().split(".");
        if (Integer.parseInt(num[0].substring(num[0].length() - 1)) == 9) {
            System.out.println("GOTO Vasilisa.");
        } else {
            if (Integer.parseInt(num[1].substring(0, 1)) >= 5) {
                System.out.println(Integer.parseInt(num[0]) + 1);
            } else {
                System.out.println(num[0]);
            }
        }
    }
}