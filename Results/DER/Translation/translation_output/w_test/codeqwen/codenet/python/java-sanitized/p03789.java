import java.util.Scanner;

public class p03789 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n = scanner.nextLine();
        char[] nArray = n.toCharArray();
        int len = nArray.length;
        int lb = 0, ub = len;
        
        while (ub - lb > 1) {
            int mid = (lb + ub) / 2;
            if (check(9 * mid, nArray, len)) {
                ub = mid;
            } else {
                lb = mid;
            }
        }
        System.out.println(ub);
    }

    public static boolean check(int x, char[] nArray, int len) {
        int g = 0;
        for (int i = 0; i < len; i++) {
            x -= (x + g - Character.getNumericValue(nArray[i])) % 10;
            if (x < 0) {
                break;
            }
            g = (x + g) / 10;
        }
        return x >= 0;
    }
}