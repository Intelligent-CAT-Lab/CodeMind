import java.util.Scanner;

public class atcoder_ABC042_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] ABC = new int[3];
        
        for (int i = 0; i < 3; i++) {
            ABC[i] = scanner.nextInt();
        }
        
        int countOfFive = 0;
        for (int i = 0; i < 3; i++) {
            if (ABC[i] == 5) {
                countOfFive++;
            }
        }
        
        if (countOfFive == 2 && sum(ABC) == 17) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        
        scanner.close();
    }

    private static int sum(int[] array) {
        int sum = 0;
        for (int j : array) {
            sum += j;
        }
        return sum;
    }
}