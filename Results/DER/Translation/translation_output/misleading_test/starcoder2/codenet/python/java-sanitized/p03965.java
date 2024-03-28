import java.util.Scanner;

public class p03965 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(s.length() / 2 - s.split("p").length + 1);
    }
}