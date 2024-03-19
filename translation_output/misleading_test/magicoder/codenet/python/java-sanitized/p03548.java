import java.util.Scanner;

public class p03548 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int X = scanner.nextInt();
        int Y = scanner.nextInt();
        int Z = scanner.nextInt();

        int answer = 0;
        int width = Y + 2 * Z;
        while (width <= X) {
            answer++;
            width += Y + Z;
        }

        System.out.println(answer);
    }
}


You can test this code with the following test input:


13 3 1


And it should output:


-34