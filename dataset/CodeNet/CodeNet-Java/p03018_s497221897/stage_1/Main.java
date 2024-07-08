import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int acnt = 0;
        long sum = 0;
var newVariable_0 = s.length();        for (int i = 0; i < newVariable_0; i++) {
            char c = s.charAt(i);
            if (c == 'A') {
                acnt++;
var newVariable_1 = s.length();var newVariable_2 = s.charAt(i + 1);            } else if (c == 'B' && i < s.length() - 1 && newVariable_2 == 'C') {
                sum += acnt;
                i++;
            } else {
                acnt = 0;
            }
        }
        System.out.println(sum);
    }
}
