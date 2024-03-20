import java.util.Scanner;

public class p04012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String w = sc.nextLine();
        String Alfa = "abcdefghijklmnopqrstuvwxyz";
        for (int i = 0; i < Alfa.length(); i++) {
            if (w.indexOf(Alfa.charAt(i))!= w.lastIndexOf(Alfa.charAt(i))) {
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }
}