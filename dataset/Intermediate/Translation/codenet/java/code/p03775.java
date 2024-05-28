
import java.text.DecimalFormat;
import java.util.stream.LongStream;
import java.util.stream.IntStream;
import java.io.*;
import java.util.*;

public class p03775 {

    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        PrintWriter out = new PrintWriter(System.out);

        AtCoder problem = new AtCoder(sc);
        problem.solve(out);

        out.flush();
    }

}

class AtCoder {

    long N;

    AtCoder(FastScanner sc) {
        N = sc.nextLong();
    }

    void solve(PrintWriter out) {
        int sqrt = (int) Math.sqrt(N);
        for (int i = sqrt; i > 0; i--) {
            if (N % i == 0) {
                int A = Integer.toString(i).length();
                int B = Long.toString(N / i).length();
                out.println(Math.max(A, B));
                return;
            }
        }
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
            sb.appendCodePoint(b);
            b = readByte();
        }
        return sb.toString();
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

    public int randomInt() {
        Random r = new Random();
        int value = r.nextInt((int) 1e6);
        System.out.println(value);
        return value;
    }

    public int[] randomInt(int N) {
        int[] array = new int[N];
        Random r = new Random();
        for (int i = 0; i < N; i++) {
            array[i] = r.nextInt((int) 1e6);
        }
        System.out.println(Arrays.toString(array));
        return array;
    }

}

class My {

    static void ans(boolean b) {
        System.out.println(b ? "Yes" : "No");
    }

    static void ANS(boolean b) {
        System.out.println(b ? "YES" : "NO");
    }

    static String sort(String s) {
        char[] ch = s.toCharArray();
        Arrays.sort(ch);
        return String.valueOf(ch);
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

}
