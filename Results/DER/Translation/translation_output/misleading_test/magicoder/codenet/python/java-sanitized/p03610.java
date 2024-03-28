import java.util.Scanner;

public class p03610 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < s.length(); i += 2) {
            result.append(s.charAt(i));
        }

        System.out.println(result.toString());
    }
}


You can test this code with the following test input:


atcoder


And it should output:


acdr