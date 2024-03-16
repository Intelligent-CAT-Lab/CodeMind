import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class p03605 {

    public static void main(String[] args) throws IOException {

        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();

        int amari = N % 10;
        int sho = N / 10;

        if (amari == 9) {
            System.out.println("Yes");
        } else if (sho == 9) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    //***********************ä»¥ä¸å
±éé¢æ°************************************************
    /**
     * æå­åãåè»¢ãã¦è¿ã
     * @param pStr æå­å
     * @return åè»¢ããæå­å
     */
    public static String myReverse(String pStr) {
        if (pStr.length() < 1) {
            return "";
        }

        StringBuffer sb = new StringBuffer(pStr);
        return sb.reverse().toString();
    }

    /**
     * ä½ããæ±ããã
     * @param a
     * @param b
     * @return ä½ããä½ãããã¤ãã¹ã®æã¯ãã©ã¹ã§è¿ãã
     */
    public static long myMod(long a, long b) {
        long ret = 0;

        ret = a % b;

        if (ret < 0) {
            ret += b;
        }

        return ret;
    }

    /**
     * ä¹æ°ãæ±ãã â»modå¯¾å¿
     * @param kisu åºæ°
     * @param josu ä¹æ°
     * @param primeNumMod_0 æ³ modå¤ ä½¿ããªãå ´åã¯ã0ã
     * @return
     */
    public static long myPowWithMod(long kisu, long josu, long primeNumMod_0) {

        long ans = 1;