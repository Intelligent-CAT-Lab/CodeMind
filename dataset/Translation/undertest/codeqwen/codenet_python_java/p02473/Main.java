import java.util.Scanner;

public class p02473 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] s = scanner.nextLine().split(" ");
        System.out.println(Integer.parseInt(s[0]) - Integer.parseInt(s[1]));
    }
}