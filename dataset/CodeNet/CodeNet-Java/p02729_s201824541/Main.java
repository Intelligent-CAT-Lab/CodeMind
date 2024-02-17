import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //コード
        Scanner scanner = new Scanner(System.in);
        Integer n = Integer.parseInt(scanner.next());
        Integer m = Integer.parseInt(scanner.next());
        int total = 0;

        total += (n * (n-1) / 2);
        total += (m * (m-1) / 2);

        System.out.println(total);
    }
}