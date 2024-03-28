import java.util.Scanner;

public class p03965 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'p') {
                count++;
            }
        }
        System.out.println((s.length() / 2) - count);
    }
}


You can test this code with the following test input:


gpg


And the expected output will be:


-92