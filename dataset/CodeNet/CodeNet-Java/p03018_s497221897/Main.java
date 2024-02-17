import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int acnt = 0;
        long sum = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'A') {
                acnt++;
            } else if (c == 'B' && i < s.length() - 1 && s.charAt(i + 1) == 'C') {
                sum += acnt;
                i++;
            } else {
                acnt = 0;
            }
        }
        System.out.println(sum);
    }
}
