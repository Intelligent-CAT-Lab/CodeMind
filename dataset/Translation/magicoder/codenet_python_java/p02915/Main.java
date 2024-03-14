import java.util.Scanner;

public class p02915 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            int n = Integer.parseInt(line.split(" ")[0]);
            System.out.println(n * n * n);
        }
    }
}