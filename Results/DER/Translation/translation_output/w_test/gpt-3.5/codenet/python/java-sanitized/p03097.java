import java.util.*;

public class p03097 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        
        if (popCount(a^b) % 2 == 0) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
            List<Integer> result = f(n, a, b);
            for (int num : result) {
                System.out.print(num + " ");
            }
        }
    }

    public static int popCount(int x) {
        int res = 0;
        for (int i = 0; i < 17; i++) {
            res += ((x >> i) % 2 == 1) ? 1 : 0;
        }
        return res;
    }

    public static List<Integer> f(int m, int x, int y) {
        if (m == 1) {
            if (x == 0) {
                return Arrays.asList(0, 1);
            } else {
                return Arrays.asList(1, 0);
            }
        }

        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            if ((x >> i) % 2 != (y >> i) % 2) {
                int diff = i;
                break;
            }
        }
        int s = (x % (1 << diff)) + (((x / (1 << (diff + 1))) * (1 << (diff + 1))) >> 1;
        int t = (y % (1 << diff)) + (((y / (1 << (diff + 1))) * (1 << (diff + 1))) >> 1;
        int u = s ^ 1;

        List<Integer> left = f(m - 1, s, u);
        List<Integer> right = f(m - 1, u, t);

        int xBit = (x >> diff) % 2;
        int yBit = (y >> diff) % 2;
        left = adjustBits(left, diff, xBit);
        right = adjustBits(right, diff, yBit);

        List<Integer> result = new ArrayList<>();
        result.addAll(left);
        result.addAll(right);
        return result;
    }
    
    public static List<Integer> adjustBits(List<Integer> list, int diff, int bit) {
        List<Integer> adjustedList = new ArrayList<>();
        for (int num : list) {
            int adjustedNum = num % (1 << diff) + (1 << diff) * bit + (((num / (1 << diff)) * (1 << diff)) << 1);
            adjustedList.add(adjustedNum);
        }
        return adjustedList;
    }
}