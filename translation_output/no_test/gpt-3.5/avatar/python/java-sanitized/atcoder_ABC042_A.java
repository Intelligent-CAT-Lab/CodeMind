import java.util.Scanner;

public class atcoder_ABC042_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputArray = scanner.nextLine().split(" ");
        int[] ABC = new int[inputArray.length];
        for (int i = 0; i < ABC.length; i++) {
            ABC[i] = Integer.parseInt(inputArray[i]);
        }

        int count = 0;
        for (int num : ABC) {
            if (num == 5) {
                count++;
            }
        }

        if (count == 2) {
            if (sum(ABC) == 17) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        } else {
            System.out.println("NO");
        }
    }

    public static int sum(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum;
    }
}