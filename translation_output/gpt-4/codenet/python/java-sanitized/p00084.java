import java.util.ArrayList;
import java.util.Scanner;

public class p00084 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String code = scanner.nextLine();
        code = code.replace(",", "");
        code = code.replace(".", "");
        String[] splitCode = code.split("\\s+");

        ArrayList<String> list = new ArrayList<>();

        for(String var : splitCode) {
            if(var.length() >= 3 && var.length() <= 6) {
                list.add(var);
            }
        }

        for(String var : list) {
            System.out.print(var + " ");
        }
        scanner.close();
    }
}