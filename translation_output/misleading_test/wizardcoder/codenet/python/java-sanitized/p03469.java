import java.util.Scanner;

public class p03469 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String year = input.substring(0, 4);
        String month = input.substring(5, 7);
        String day = input.substring(8, 10);
        System.out.println(year + "/O" + month + "/" + day);
    }
}