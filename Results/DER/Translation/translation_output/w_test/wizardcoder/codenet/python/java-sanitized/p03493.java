import java.util.Scanner;

public class p03493 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println(input.length() - input.replace("1", "").length());
    }
}