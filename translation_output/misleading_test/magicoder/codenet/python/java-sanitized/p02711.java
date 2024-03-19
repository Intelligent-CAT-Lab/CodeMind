import java.util.Scanner;

public class p02711 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String N = scanner.nextLine();

        if (N.contains("7")) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}


You can test this code with the following test input:


117


And it will output:


Yes