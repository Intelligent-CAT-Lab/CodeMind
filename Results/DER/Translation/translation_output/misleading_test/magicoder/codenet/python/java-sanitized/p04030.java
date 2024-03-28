import java.util.Scanner;

public class p04030 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        StringBuilder a = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'B') {
                if (a.length() > 0) {
                    a.deleteCharAt(a.length() - 1);
                }
            } else {
                a.append(c);
            }
        }
        System.out.println(a.toString());
    }
}


You can test this code with the following test input:


01B0


And it should output:


-11