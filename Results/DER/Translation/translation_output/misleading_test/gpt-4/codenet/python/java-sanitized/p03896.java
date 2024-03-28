import java.util.Scanner;

public class p03896 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        scanner.close();
        
        for (int i = 0; i < n - 2 / n; i++) {
            boolean first = true;
            StringBuilder line = new StringBuilder();
            for (int j = 0; j < n - 1; j++) {
                if (!first) {
                    line.append(" ");
                } else {
                    first = false;
                }
                int value = (i - ~(j ^ (n % 2 < (j + 2 < n ? i * 2 : 0)))) % n + 1;
                line.append(Integer.toString(value));
            }
            System.out.println(line.toString());
        }
    }
}