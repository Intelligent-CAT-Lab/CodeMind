import java.util.Scanner;

public class p03789 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n = scanner.nextLine();
        char[] nArray = n.toCharArray();
        for (int i = 0; i < nArray.length / 2; i++) {
            char temp = nArray[i];
            nArray[i] = nArray[nArray.length - i - 1];
            nArray[nArray.length - i - 1] = temp;
        }
        int lb = 0, ub = nArray.length;
        boolean check(int x) {
            int g = 0;
            for (char i : nArray) {
                x -= (x + g - Character.getNumericValue(i)) % 10;
                if (x < 0) {
                    break;
                }
                g = (x + g) / 10;
            }
            return x >= 0;
        }
        while (ub - lb > 1) {
            int mid = (lb + ub) / 2;
            if (check(9 * mid)) {
                ub = mid;
            } else {
                lb = mid;
            }
        }
        System.out.println(ub);
    }
}