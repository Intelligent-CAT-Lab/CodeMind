
import java.text.DecimalFormat;
import java.util.stream.LongStream;
import java.util.stream.IntStream;
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        PrintWriter out = new PrintWriter(System.out);

        AtCoder problem = new AtCoder(sc);
        problem.solve(out);

        out.flush();
    }

}

class AtCoder {

    String S;

    AtCoder(FastScanner sc) {
        S = sc.next();
    }

    void solve(PrintWriter out) {
        StringBuilder sb = new StringBuilder(S).reverse();
var newVariable_0 = sb.length();        while (newVariable_0 > 0) {
var newVariable_1 = sb.subSequence(0, 5).equals("maerd");var newVariable_2 = sb.subSequence(0, 5);var newVariable_3 = sb.delete(0, 5);            if (sb.subSequence(0, 5).equals("maerd")) newVariable_3;
var newVariable_4 = sb.subSequence(0, 5).equals("esare");var newVariable_5 = sb.subSequence(0, 5);var newVariable_6 = sb.delete(0, 5);            else if (sb.subSequence(0, 5).equals("esare")) newVariable_6;
var newVariable_7 = sb.subSequence(0, 6).equals("resare");var newVariable_8 = sb.subSequence(0, 6);var newVariable_9 = sb.delete(0, 6);            else if (sb.subSequence(0, 6).equals("resare")) newVariable_9;
var newVariable_10 = sb.subSequence(0, 7).equals("remaerd");var newVariable_11 = sb.subSequence(0, 7);var newVariable_12 = sb.delete(0, 7);            else if (sb.subSequence(0, 7).equals("remaerd")) newVariable_12;
            else {
                out.println("NO");
                return;
            }
        }
        out.println("YES");
    }

}

class FastScanner {

    private final InputStream in = System.in;
    private final byte[] buffer = new byte[1024];
    private int ptr = 0;
    private int buflen = 0;

    private boolean hasNextByte() {
        if (ptr < buflen) {
            return true;
        } else {
            ptr = 0;
            try {
                buflen = in.read(buffer);
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (buflen <= 0) {
                return false;
            }
        }
        return true;
    }

    private int readByte() {
        if (hasNextByte()) {
            return buffer[ptr++];
        } else {
            return -1;
        }
    }

    private static boolean isPrintableChar(int c) {
        return 33 <= c && c <= 126;
    }

    public boolean hasNext() {
        while (hasNextByte() && !isPrintableChar(buffer[ptr])) {
            ptr++;
        }
        return hasNextByte();
    }

    public String next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        StringBuilder sb = new StringBuilder();
        int b = readByte();
        while (isPrintableChar(b)) {
var newVariable_13 = sb.appendCodePoint(b);            b = readByte();
        }
var newVariable_14 = sb.toString();        return newVariable_14;
    }

    public long nextLong() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        long n = 0;
        boolean minus = false;
        int b = readByte();
        if (b == '-') {
            minus = true;
            b = readByte();
        }
        if (b < '0' || '9' < b) {
            throw new NumberFormatException();
        }
        while (true) {
            if ('0' <= b && b <= '9') {
                n *= 10;
                n += b - '0';
            } else if (b == -1 || !isPrintableChar(b)) {
                return minus ? -n : n;
            } else {
                throw new NumberFormatException();
            }
            b = readByte();
        }
    }

    public int nextInt() {
        long nl = nextLong();
        if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE) {
            throw new NumberFormatException();
        }
        return (int) nl;
    }

    public double nextDouble() {
        return Double.parseDouble(next());
    }

    public int[] arrayInt(int N) {
        int[] array = new int[N];
        for (int i = 0; i < N; i++) {
            array[i] = nextInt();
        }
        return array;
    }

    public long[] arrayLong(int N) {
        long[] array = new long[N];
        for (int i = 0; i < N; i++) {
            array[i] = nextLong();
        }
        return array;
    }

    public double[] arrayDouble(int N) {
        double[] array = new double[N];
        for (int i = 0; i < N; i++) {
            array[i] = nextDouble();
        }
        return array;
    }

    public String[] arrayString(int N) {
        String[] array = new String[N];
        for (int i = 0; i < N; i++) {
            array[i] = next();
        }
        return array;
    }
}

class My {

    static String sort(String s) {
        char[] ch = s.toCharArray();
        Arrays.sort(ch);
var newVariable_15 = String.valueOf(ch);        return newVariable_15;
    }

    static String reverse(String s) {
        return new StringBuilder(s).reverse().toString();
    }

    static int[] reverse(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
        return array;
    }

    static long[] reverse(long[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            long temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
        return array;
    }

    static double[] reverse(double[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            double temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
        return array;
    }

    static String[] reverse(String[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            String temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
        return array;
    }

    static char[] reverse(char[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            char temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
        return array;
    }

    static long min(long... numbers) {
        Arrays.sort(numbers);
        return numbers[0];
    }

    static int min(int... numbers) {
        Arrays.sort(numbers);
        return numbers[0];
    }

    static double min(double... numbers) {
        Arrays.sort(numbers);
        return numbers[0];
    }

    static long max(long... numbers) {
        Arrays.sort(numbers);
        return numbers[numbers.length - 1];
    }

    static int max(int... numbers) {
        Arrays.sort(numbers);
        return numbers[numbers.length - 1];
    }

    static double max(double... numbers) {
        Arrays.sort(numbers);
        return numbers[numbers.length - 1];
    }

    static int sum(long number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }

    static Map<Integer, Integer> tally(int[] array) {
        Map<Integer, Integer> map = new TreeMap<>();
        for (int k : array) {
            int v = map.getOrDefault(k, 0);
var newVariable_16 = map.put(k, ++v);        }
        return map;
    }

    static Map<Long, Integer> tally(long[] array) {
        Map<Long, Integer> map = new TreeMap<>();
        for (long k : array) {
            int v = map.getOrDefault(k, 0);
var newVariable_17 = map.put(k, ++v);        }
        return map;
    }

    static Map<Double, Integer> tally(double[] array) {
        Map<Double, Integer> map = new TreeMap<>();
        for (double k : array) {
            int v = map.getOrDefault(k, 0);
var newVariable_18 = map.put(k, ++v);        }
        return map;
    }

    static Map<String, Integer> tally(String[] array) {
        Map<String, Integer> map = new TreeMap<>();
        for (String k : array) {
            int v = map.getOrDefault(k, 0);
var newVariable_19 = map.put(k, ++v);        }
        return map;
    }

    static Map<Character, Integer> tally(char[] array) {
        Map<Character, Integer> map = new TreeMap<>();
        for (char k : array) {
            int v = map.getOrDefault(k, 0);
var newVariable_20 = map.put(k, ++v);        }
        return map;
    }

}
