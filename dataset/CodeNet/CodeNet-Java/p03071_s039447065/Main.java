import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        Integer[] button = {a, b, a - 1, b - 1};

        Arrays.sort(button);
        int result = button[3] + button[2];

        System.out.println(result);
    }
}