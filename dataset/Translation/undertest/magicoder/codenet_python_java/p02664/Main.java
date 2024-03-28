import java.util.Scanner;

public class p02664 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        char[] a = input.toCharArray();

        for (int i = 0; i < a.length; i++) {
            if (a[i] == '?') {
                a[i] = 'D';
            }
        }

        StringBuilder b = new StringBuilder();
        for (char c : a) {
            b.append(c);
        }

        System.out.println(b.toString());
    }
}


You can test this code with the following test input:


PD?D??P


And it will output:


PDPDPDP