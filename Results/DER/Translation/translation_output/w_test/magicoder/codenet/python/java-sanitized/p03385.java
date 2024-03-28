import java.util.Scanner;

public class p03385 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();
        if (S.contains("a") && S.contains("b") && S.contains("c")) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}


You can test this code with the following test input:


bac


And it should output:


Yes