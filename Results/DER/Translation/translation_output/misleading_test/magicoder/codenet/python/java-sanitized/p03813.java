import java.util.Scanner;

public class p03813 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if (a < 1200) {
            System.out.println("ABC");
        } else {
            System.out.println("ARC");
        }
    }
}


You can test this code with the following test input:


1000


And it will output:


ABC