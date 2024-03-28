import java.util.Scanner;

public class p02415 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(s.replaceAll("[a-z]", String.valueOf(Character.toUpperCase(s.charAt(0))) + String.valueOf(Character.toLowerCase(s.charAt(0)))));
    }
}