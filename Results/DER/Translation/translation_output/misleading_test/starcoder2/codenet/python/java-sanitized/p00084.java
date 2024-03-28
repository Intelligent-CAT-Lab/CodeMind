import java.util.Scanner;

public class p00084 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String code = sc.nextLine();
        code = code.replace(",", "");
        code = code.replace(".", "");
        String[] codeArray = code.split(" ");
        for (String var : codeArray) {
            if (var.length() >= 3 && var.length() <= 6) {
                System.out.print(var + " ");
            }
        }
    }
}