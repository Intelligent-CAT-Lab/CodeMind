import java.util.Scanner;

public class p02124 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        String output = "ai1333" + "3".repeat(input / 100);
        System.out.println(output);
    }
}





import java.util.Scanner;

public class p02124 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        StringBuilder output = new StringBuilder("ai1333");
        for (int i = 0; i < input / 100; i++) {
            output.append("3");
        }
        System.out.println(output.toString());
    }
}