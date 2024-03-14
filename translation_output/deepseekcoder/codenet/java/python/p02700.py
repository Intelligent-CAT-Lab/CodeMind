<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
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

### Response:
```python
import sys

class p02700:

    @staticmethod
    def main():
        insn = GetInput.get_array_int()
        a = insn[0]
        b = insn[1]
        c = insn[2]
        d = insn[3]

        t = c//b
        tt = c%b
        y = a//d
        u = a%d
        while a >=0 or c>=0:
            c = c - b
            if c <=0:
                print("Yes")
                return
            a = a - d
            if a<=0:
                print("No")
                return

    @staticmethod
    def ff(combination_sum):
        return int(combination_sum%(pow(10,9)+7))

    @staticmethod
    def combination_sum(n, coins, l):
        if n<0:
            return -1
        if n==0:
            return l

        coin_count = sys.maxsize
        for coin in coins:
            curr_coin = p02700.combination_sum(n - coin, coins, l+1)
            if curr_coin == -1:
                continue
            if curr_coin < coin_count:
                coin_count = curr_coin
        if coin_count == sys.maxsize:
            return -1
        return coin_count

class GetInput:
    @staticmethod
    def get_char_array():
        try:
            string = GetInput.get_input_string()
            char_array = [char for char in string]
            return char_array
        except Exception as e:
            e.printStackTrace()
        return []

    @staticmethod
    def get_array_int():
        try:
            string = sys.stdin.readline().split()
            array = [int(num) for num in string]
            return array
        except Exception as e:
            e.printStackTrace()
        return []

    @staticmethod
    def get_int():
        try:
            string = sys.stdin.readline()
            return int(string)
        except Exception as e:
            e.printStackTrace()
        return 0

    @staticmethod
    def get_input_string():
        try:
            string = sys.stdin.readline()
            return string
        except Exception as e:
            e.printStackTrace()
        return ""

    @staticmethod
    def get_long_input():
        try:
            string = sys.stdin.readline()
            return long(string)
        except Exception as e:
            e.printStackTrace()
        return 0

    @staticmethod
    def get_long_array_input():
        try:
            string = sys.stdin.readline().split()
            array = [long(num) for num in string]
            return array
        except Exception as e:
            e.printStackTrace()
        return []
```
<|EOT|>
