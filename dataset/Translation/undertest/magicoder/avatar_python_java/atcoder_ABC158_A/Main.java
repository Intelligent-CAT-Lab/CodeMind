import java.util.Scanner;

public class atcoder_ABC158_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String result = s.contains("A") && s.contains("B") ? "Yes" : "No";
        System.out.println(result);
    }
}


You can test this code with the following test input:


BBA


And it will output:


Yes