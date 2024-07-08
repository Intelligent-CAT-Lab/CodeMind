import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
var newVariable_0 = in.nextInt();        String s = "" + newVariable_0;

        int rs = 0;
var newVariable_1 = s.toCharArray();        for (char c : newVariable_1) {
            if (c == '2') rs++;
        }

        System.out.println(rs);
    }
}
