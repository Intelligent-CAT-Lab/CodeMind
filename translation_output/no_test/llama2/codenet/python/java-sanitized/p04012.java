import java.util.Scanner;

public class p04012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String w = sc.nextLine();
        String Alfa = "abcdefghijklmnopqrstuvwxyz";
        for (char i : Alfa.toCharArray()) {
            if (w.contains(i) && w.count(i) % 2 == 1) {
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }
}