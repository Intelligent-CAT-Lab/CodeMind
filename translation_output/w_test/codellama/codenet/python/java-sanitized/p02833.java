import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.stream.Collectors;

public class p02833 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int div = 10;
        int tot = 0;
        if (n % 2 == 1) {
            System.out.println(0);
        } else {
            while (n >= div) {
                tot += n / div;
                div *= 5;
            }
            System.out.println(tot);
        }
    }
}