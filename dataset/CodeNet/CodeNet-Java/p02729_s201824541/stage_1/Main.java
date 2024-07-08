import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //コード
        Scanner scanner = new Scanner(System.in);
var newVariable_0 = scanner.next();        Integer n = Integer.parseInt(newVariable_0);
var newVariable_1 = scanner.next();        Integer m = Integer.parseInt(newVariable_1);
        int total = 0;

        total += (n * (n-1) / 2);
        total += (m * (m-1) / 2);

        System.out.println(total);
    }
}