
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
System.out.println("[INST]16;None;out.flush();"+out.flush());
    }

}

class AtCoder {

    String S;

    AtCoder(FastScanner sc) {
        S = sc.next();
    }

    void solve(PrintWriter out) {
        StringBuilder sb = new StringBuilder(S).reverse();
        while (sb.length() > 0) {
System.out.println("[INST]31;None;sb.length();"+sb.length());
            if (sb.subSequence(0, 5).equals("maerd")) sb.delete(0, 5);
System.out.println("[INST]32;None;sb.subSequence(0, 5).equals('maerd');"+sb.subSequence(0, 5).equals("maerd"));
System.out.println("[INST]32;None;sb.subSequence(0, 5);"+sb.subSequence(0, 5));
System.out.println("[INST]32;None;sb.delete(0, 5);"+sb.delete(0, 5));
            else if (sb.subSequence(0, 5).equals("esare")) sb.delete(0, 5);
System.out.println("[INST]33;None;sb.subSequence(0, 5).equals('esare');"+sb.subSequence(0, 5).equals("esare"));
System.out.println("[INST]33;None;sb.subSequence(0, 5);"+sb.subSequence(0, 5));
System.out.println("[INST]33;None;sb.delete(0, 5);"+sb.delete(0, 5));
            else if (sb.subSequence(0, 6).equals("resare")) sb.delete(0, 6);
System.out.println("[INST]34;None;sb.subSequence(0, 6).equals('resare');"+sb.subSequence(0, 6).equals("resare"));
System.out.println("[INST]34;None;sb.subSequence(0, 6);"+sb.subSequence(0, 6));
System.out.println("[INST]34;None;sb.delete(0, 6);"+sb.delete(0, 6));
            else if (sb.subSequence(0, 7).equals("remaerd")) sb.delete(0, 7);
System.out.println("[INST]35;None;sb.subSequence(0, 7).equals('remaerd');"+sb.subSequence(0, 7).equals("remaerd"));
System.out.println("[INST]35;None;sb.subSequence(0, 7);"+sb.subSequence(0, 7));
System.out.println("[INST]35;None;sb.delete(0, 7);"+sb.delete(0, 7));
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
System.out.println("[INST]59;buflen;in.read(buffer);"+buflen);
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
            sb.appendCodePoint(b);
System.out.println("[INST]96;None;sb.appendCodePoint(b);"+sb.appendCodePoint(b));
            b = readByte();
        }
        return sb.toString();
System.out.println("[INST]99;None;sb.toString();"+sb.toString());
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
System.out.println("[INST]177;ch;s.toCharArray();"+ch);
        Arrays.sort(ch);
        return String.valueOf(ch);
System.out.println("[INST]179;None;String.valueOf(ch);"+String.valueOf(ch));
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
System.out.println("[INST]273;v;map.getOrDefault(k, 0);"+v);
            map.put(k, ++v);
System.out.println("[INST]274;None;map.put(k, ++v);"+map.put(k, ++v));
        }
        return map;
    }

    static Map<Long, Integer> tally(long[] array) {
        Map<Long, Integer> map = new TreeMap<>();
        for (long k : array) {
            int v = map.getOrDefault(k, 0);
System.out.println("[INST]282;v;map.getOrDefault(k, 0);"+v);
            map.put(k, ++v);
System.out.println("[INST]283;None;map.put(k, ++v);"+map.put(k, ++v));
        }
        return map;
    }

    static Map<Double, Integer> tally(double[] array) {
        Map<Double, Integer> map = new TreeMap<>();
        for (double k : array) {
            int v = map.getOrDefault(k, 0);
System.out.println("[INST]291;v;map.getOrDefault(k, 0);"+v);
            map.put(k, ++v);
System.out.println("[INST]292;None;map.put(k, ++v);"+map.put(k, ++v));
        }
        return map;
    }

    static Map<String, Integer> tally(String[] array) {
        Map<String, Integer> map = new TreeMap<>();
        for (String k : array) {
            int v = map.getOrDefault(k, 0);
System.out.println("[INST]300;v;map.getOrDefault(k, 0);"+v);
            map.put(k, ++v);
System.out.println("[INST]301;None;map.put(k, ++v);"+map.put(k, ++v));
        }
        return map;
    }

    static Map<Character, Integer> tally(char[] array) {
        Map<Character, Integer> map = new TreeMap<>();
        for (char k : array) {
            int v = map.getOrDefault(k, 0);
System.out.println("[INST]309;v;map.getOrDefault(k, 0);"+v);
            map.put(k, ++v);
System.out.println("[INST]310;None;map.put(k, ++v);"+map.put(k, ++v));
        }
        return map;
    }

}
