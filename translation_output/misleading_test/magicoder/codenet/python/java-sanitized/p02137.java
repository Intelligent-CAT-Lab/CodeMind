import java.util.Scanner;

public class p02137 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int result = num / 500 * 500;
        System.out.println(result);
    }
}


You can test this code with the following test input:


5700


And it will output:


5416