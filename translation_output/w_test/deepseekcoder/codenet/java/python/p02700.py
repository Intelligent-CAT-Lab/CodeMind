<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
10 9 10 10

Expected output:
No


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
def main():
    insn = GetInput.getArrayInt()
    a = insn[0]
    b = insn[1]
    c = insn[2]
    d = insn[3]

    while a >= 0 and c >= 0:
        c = c - b
        if c <= 0:
            print("Yes")
            return
        a = a - d
        if a <= 0:
            print("No")
            return


class GetInput:
    import sys
    import io

    @staticmethod
    def getCharArray():
        try:
            string = GetInput.getInputString()
            charArray = [char for char in string]
            return charArray
        except Exception as e:
            e.printStackTrace()
        charArray = []
        return charArray

    @staticmethod
    def getArrayInt():
        try:
            string = GetInput._input().split()
            array = [int(num) for num in string]
            return array
        except Exception as e:
            e.printStackTrace()
        array = []
        return array

    @staticmethod
    def getInt():
        try:
            num = int(GetInput._input())
            return num
        except Exception as e:
            e.printStackTrace()
        return 0

    @staticmethod
    def getInputString():
        try:
            string = GetInput._input()
            return string
        except Exception as e:
            e.printStackTrace()
        return ""

    @staticmethod
    def getLongInput():
        try:
            num = long(GetInput._input())
            return num
        except Exception as e:
            e.printStackTrace()
        return 0

    @staticmethod
    def getLongArrayInput():
        try:
            string = GetInput._input().split()
            array = [long(num) for num in string]
            return array
        except Exception as e:
            e.printStackTrace()
        array = []
        return array

    @staticmethod
    def _input():
        return sys.stdin.readline().rstrip('\n')


if __name__ == "__main__":
    main()
```
<|EOT|>
