

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] P2 = new int[5000][3];
        int[][] P3 = new int[2500][2];
        int limit = 30000;
        for (int i = 0; i < 5000; i++) {
            P2[i][0] = 6 * (i + 1) - 2;
            P2[i][1] = 6 * (i + 1);
            P2[i][2] = 6 * (i + 1) + 2;
        }
        P2[4999][2] = 2;
        for (int i = 0; i < 2500; i++) {
            P3[i][0] = 12 * i + 3;
            P3[i][1] = 12 * i + 9;
        }
        if (N == 3) {
            System.out.println("2 3 25");
        } else if (N == 4) {
            System.out.println("2 3 4 9");
        } else if (N == 6) {
            System.out.println("2 3 4 6 9 12");
        } else {
            int[][] SP(int N) {
                if (N == 19999) {
                    int[][] P = new int[P2.length + P3.length][];
                    for (int i = 0; i < P2.length; i++) {
                        P[i] = P2[i];
                    }
                    for (int i = 0; i < P3.length; i++) {
                        P[i + P2.length] = P3[i];
                    }
                    P[0] = new int[]{4, 8};
                    return P;
                }
                int _k = -(-Math.max(N - 12500, 0) / 3);
                N -= 3 * _k;
                int k = N / 5;
                int m = N % 5;
                int[][] P;
                if (m == 0) {
                    P = new int[k + _k + P3.length][];
                    for (int i = 0; i < k + _k; i++) {
                        P[i] = P2[i];
                    }
                    for (int i = 0; i < k; i++) {
                        P[i + k + _k] = P3[i];
                    }
                } else if (m == 1) {
                    P = new int[k + 1 + _k + P3.length][];
                    for (int i = 0; i < k + 1 + _k; i++) {
                        P[i] = P2[i];
                    }
                    for (int i = 0; i < k - 1; i++) {
                        P[i + k + 1 + _k] = P3[i];
                    }
                } else if (m == 2) {
                    P = new int[k + _k + P3.length][];
                    for (int i = 0; i < k + _k; i++) {
                        P[i] = P2[i];
                    }
                    for (int i = 0; i < k + 1; i++) {
                        P[i + k + _k] = P3[i];
                    }
                } else if (m == 3) {
                    P = new int[k + 1 + _k + P3.length][];
                    for (int i = 0; i < k + 1 + _k; i++) {
                        P[i] = P2[i];
                    }
                    for (int i = 0; i < k; i++) {
                        P[i + k + 1 + _k] = P3[i];
                    }
                } else if (k >= 2499) {
                    P = new int[k + 2 + _k + P3.length][];
                    for (int i = 0; i < k + 2 + _k; i++) {
                        P[i] = P2[i];
                    }
                    for (int i = 0; i < k - 1; i++) {
                        P[i + k + 2 + _k] = P3[i];
                    }
                } else {
                    P = new int[k + _k + P3.length][];
                    for (int i = 0; i < k + _k; i++) {
                        P[i] = P2[i];
                    }
                    for (int i = 0; i < k + 2; i++) {
                        P[i + k + _k] = P3[i];
                    }
                }
                return P;
            }
            int[][] P = SP(N);
            for (int i = 0; i < P.length; i++) {
                for (int j = 0; j < P[i].length; j++) {
                    System.out.print(P[i][j] + " ");
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
```

## 2. 2020-03-16

### 2.1. 题目

给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。

你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。

示例:

给定 nums = [2, 7, 11, 15], target = 9

因为 nums[0] + nums[1] = 2 + 7 = 9
所以返回 [0, 1]

### 2.2. 解答

```java
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        throw
