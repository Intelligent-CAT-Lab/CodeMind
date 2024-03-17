import java.util.Scanner;

public class p02639 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] xList = input.split(" ");
        for (int i = 0; i < xList.length; i++) {
            if (xList[i].equals("0")) {
                System.out.println(i + 1);
            }
        }
    }
}