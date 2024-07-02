import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

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
System.out.println("[INST]33;None;Math.pow(10,9);"+Math.pow(10,9));
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
System.out.println("[INST]68;None;string.length();"+string.length());
            for (int i = 0; i < string.length(); i++) {
System.out.println("[INST]69;None;string.length();"+string.length());
                charArray[i] = string.charAt(i);
System.out.println("[INST]70;None;string.charAt(i);"+string.charAt(i));
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
System.out.println("[INST]84;string;bufferedReader.readLine().split('\\s+');"+string);
System.out.println("[INST]84;None;bufferedReader.readLine();"+bufferedReader.readLine());
            array = new int[string.length];
            for (int i = 0; i < string.length; i++) {
                array[i] = Integer.parseInt(string[i]);
System.out.println("[INST]87;None;Integer.parseInt(string[i]);"+Integer.parseInt(string[i]));
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
System.out.println("[INST]100;string;bufferedReader.readLine();"+string);
            return Integer.parseInt(string);
System.out.println("[INST]101;None;Integer.parseInt(string);"+Integer.parseInt(string));
        } catch (IOException e) {
            e.printStackTrace();
        }

        return 0;
    }

    static StringBuilder getInputString() {
        try {
            StringBuilder string = new StringBuilder();
            string.append(bufferedReader.readLine());
System.out.println("[INST]112;None;string.append(bufferedReader.readLine());"+string.append(bufferedReader.readLine()));
System.out.println("[INST]112;None;bufferedReader.readLine();"+bufferedReader.readLine());
            return string;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new StringBuilder();
    }

    static long getLongInput() {
        try {
            String string = bufferedReader.readLine();
System.out.println("[INST]122;string;bufferedReader.readLine();"+string);
            return Long.parseLong(string);
System.out.println("[INST]123;None;Long.parseLong(string);"+Long.parseLong(string));
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
System.out.println("[INST]135;string;bufferedReader.readLine().split('\\s+');"+string);
System.out.println("[INST]135;None;bufferedReader.readLine();"+bufferedReader.readLine());
            array = new long[string.length];
            for (int i = 0; i < string.length; i++) {
                array[i] = Long.parseLong(string[i]);
System.out.println("[INST]138;None;Long.parseLong(string[i]);"+Long.parseLong(string[i]));
            }
            return array;
        } catch (IOException e) {
            e.printStackTrace();
        }

        long[] arra = new long[2];
        return arra;
    }
}
