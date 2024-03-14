import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class p00084 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        input = input.replace(",", "");
        input = input.replace(".", "");
        String[] code = input.split(" ");

        List<String> list = new ArrayList<>();

        for (String var : code) {
            if (var.length() >= 3 && var.length() <= 6) {
                list.add(var);
            }
        }

        for (String var : list) {
            System.out.print(var + " ");
        }
    }
}