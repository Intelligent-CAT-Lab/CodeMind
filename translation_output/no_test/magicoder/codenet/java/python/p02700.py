<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p02700 {

    public static void main(String[] args) {
        int []insn = GetInput.getArrayInt();
        int a = insn[0];
        int b = insn[1];
        int c = insn[2];
        int d = insn[3];

        int t = c/b;
        int tt = c%b;
        int y = a/d;
        int u = a%d;
        while(a >=0|| c>=0){
            c = c - b;
            if (c <=0){
                System.out.println("Yes");
                return;
            }
            a = a - d;
            if (a<=0){
                System.out.println("No");
                return;
            }
        }
    }


    private static long ff(long combinationSum) {
        return (long) (combinationSum%(Math.pow(10,9)+7));
    }

    private static int combinationSum(long n, int[] coins, int l) {
        if (n<0){
            return -1;
        }
        if (n==0){
            return l;
        }

        int coinCount = Integer.MAX_VALUE;
        for (int coin : coins) {
            int currCoin = combinationSum(n - coin, coins, l+1);
            if (currCoin == -1) {
                continue;
            }
            if (currCoin < coinCount) {
                coinCount = currCoin;
            }
        }
        if (coinCount == Integer.MAX_VALUE){
            return -1;
        }
        return coinCount;
    }
}

class GetInput {
    static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    static char[] getCharArray() {
        char[] charArray;
        try {
            StringBuilder string = getInputString();
            charArray = new char[string.length()];
            for (int i = 0; i < string.length(); i++) {
                charArray[i] = string.charAt(i);
            }
            return charArray;
        } catch (Exception e) {
            e.printStackTrace();
        }
        charArray = new char[0];
        return charArray;
    }

    static int[] getArrayInt() {
        String[] string;
        int[] array;
        try {
            string = bufferedReader.readLine().split("\\s+");
            array = new int[string.length];
            for (int i = 0; i < string.length; i++) {
                array[i] = Integer.parseInt(string[i]);
            }
            return array;
        } catch (IOException e) {
            e.printStackTrace();
        }

        int[] arra = new int[2];
        return arra;
    }

    static int getInt() {
        try {
            String string = bufferedReader.readLine();
            return Integer.parseInt(string);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return 0;
    }

    static StringBuilder getInputString() {
        try {
            StringBuilder string = new StringBuilder();
            string.append(bufferedReader.readLine());
            return string;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new StringBuilder();
    }

    static long getLongInput() {
        try {
            String string = bufferedReader.readLine();
            return Long.parseLong(string);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return 0;
    }

    static long[] getLongArrayInput() {
        String[] string;
        long[] array;
        try {
            string = bufferedReader.readLine().split("\\s+");
            array = new long[string.length];
            for (int i = 0; i < string.length; i++) {
                array[i] = Long.parseLong(string[i]);
            }
            return array;
        } catch (IOException e) {
            e.printStackTrace();
        }

        long[] arra = new long[2];
        return arra;
    }
}

```

@@ Response
```python
import sys

def get_array_int():
    return list(map(int, sys.stdin.readline().split()))

def ff(combination_sum):
    return combination_sum % (10**9 + 7)

def combination_sum(n, coins, l):
    if n < 0:
        return -1
    if n == 0:
        return l

    coin_count = float('inf')
    for coin in coins:
        curr_coin = combination_sum(n - coin, coins, l + 1)
        if curr_coin == -1:
            continue
        if curr_coin < coin_count:
            coin_count = curr_coin

    if coin_count == float('inf'):
        return -1
    return coin_count

def main():
    insn = get_array_int()
    a = insn[0]
    b = insn[1]
    c = insn[2]
    d = insn[3]

    t = c // b
    tt = c % b
    y = a // d
    u = a % d
    while a >= 0 or c >= 0:
        c = c - b
        if c <= 0:
            print("Yes")
            return
        a = a - d
        if a <= 0:
            print("No")
            return

if __name__ == "__main__":
    main()
```

Please note that Python does not have a direct equivalent to Java's `System.out.println()`. Instead, we use the `print()` function. Also, Python uses `//` for integer division and `%` for modulo operation.<｜end▁of▁sentence｜>
