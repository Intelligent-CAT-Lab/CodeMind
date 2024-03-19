import java.util.Scanner;

public class p03192 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String N = scanner.next();
        int count = 0;
        for (int i = 0; i < N.length(); i++) {
            if (N.charAt(i) == '2') {
                count++;
            }
        }
        System.out.println(count);
    }
}



You can test this code with the provided test case (1222) and it should output -54. However, please note that the expected output -54 is not correct as per the problem statement. It seems like there might be a misunderstanding in the problem statement.