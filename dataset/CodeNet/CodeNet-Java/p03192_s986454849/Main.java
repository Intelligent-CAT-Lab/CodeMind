import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = "" + in.nextInt();

        int rs = 0;
        for (char c : s.toCharArray()) {
            if (c == '2') rs++;
        }

        System.out.println(rs);
    }
}
