import java.util.Scanner;

public class p03569 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int i = 0;
        int j = input.length() - 1;
        int c = 0;
        while (true) {
            if (i >= j) {
                break;
            }
            if (input.charAt(i) == input.charAt(j)) {
                i++;
                j--;
            } else {
                if (input.charAt(i) == 'x') {
                    i++;
                    c++;
                } else if (input.charAt(j) == 'x') {
                    j--;
                    c++;
                } else {
                    System.out.println(-1);
                    System.exit(0);
                }
            }
        }
        System.out.println(c);
    }
}