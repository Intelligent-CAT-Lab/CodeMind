import java.util.Scanner;

public class p02747 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();

        if (S.equals("hi") || S.equals("hihi") || S.equals("hihihi") || S.equals("hihihihi") || S.equals("hihihihihi")) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}