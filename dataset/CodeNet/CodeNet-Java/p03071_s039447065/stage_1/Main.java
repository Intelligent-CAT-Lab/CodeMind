import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
var newVariable_0 = sc.next();        int a = Integer.parseInt(newVariable_0);
var newVariable_1 = sc.next();        int b = Integer.parseInt(newVariable_1);
        Integer[] button = {a, b, a - 1, b - 1};

        Arrays.sort(button);
        int result = button[3] + button[2];

        System.out.println(result);
    }
}