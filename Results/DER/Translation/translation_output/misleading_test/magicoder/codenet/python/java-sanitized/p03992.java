import java.util.Scanner;

public class p03992 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(s.substring(0, 4) + " " + s.substring(4));
    }
}


You can test this code with the following test input:


CODEFESTIVAL


And it will output:


CODE FESTIVAL