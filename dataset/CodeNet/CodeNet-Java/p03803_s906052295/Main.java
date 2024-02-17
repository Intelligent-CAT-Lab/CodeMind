import java.io.*;
import java.math.*;
import java.util.*;

class Main {

    private static final PrintWriter out = new PrintWriter(System.out);
    private static final Scanner scanner = new Scanner(System.in);
    private static int[] dx = {1, 0, -1, 0, 1, 1, -1, -1};
    private static int[] dy = {0, 1, 0, -1, 1, -1, 1, -1};
    private static int INF = 0x3f3f3f3f;

    public static void main(String[] args) {
        // From IntelliJ IDEA

        int a = fgetInt();
        int b = fgetInt();
        if ( a == b ) println("Draw");
        else if ( a == 1 ) println("Alice");
        else if ( b == 1 ) println("Bob");
        else if ( a < b ) println("Bob");
        else println("Alice");

        suomi();
    }

    private static boolean isMovable( int x, int y, int w, int h ) {
        return ( x >= 0 && y >= 0 && x < w && y < h );
    }
    private static String fgetStr(){
        return FastScanner.next();
    }
    private static String fgetLine(){
        return FastScanner.nextLine();
    }
    private static char fgetChar(){
        return fgetStr().charAt(0);
    }
    private static int fgetInt(){
        return FastScanner.nextInt();
    }
    private static long fgetLong(){
        return FastScanner.nextLong();
    }
    private static double fgetDouble(){
        return FastScanner.nextDouble();
    }
    private static BigInteger fgetBig(){
        return new BigInteger(fgetStr());
    }
    private static String reverseStr(String str){
        return new StringBuffer(str).reverse().toString();
    }
    private static void println(Object a){
        out.println(a);
    }
    private static void print(Object a){
        out.print(a);
    }
    private static void printf(String string, Object... args) {
        out.printf(string, args);
    }
    private static void suomi(){
        out.flush();
    }
    private static long pow ( long x, long n ) {
        final long MOD = 1000000007;
        long ans = 1;
        while ( n > 0 ) {
            if ( ( n & 1 ) == 1 ) {
                ans = (ans * x) % MOD;
            }
            x = ( x * x ) % MOD;
            n >>= 1;
        }
        return ans;
    }
    private static long gcd(long x, long y) {
        return x % y == 0 ? y : gcd(y, x % y);
    }
    private static long lcm(long x, long y) {
        return ( x / gcd(x, y) * y);
    }
}

class Edge implements Comparable<Edge> {

    int u;
    int v;
    int cost;

    public Edge(int u, int v, int cost) {
        this.u = u;
        this.v = v;
        this.cost = cost;
    }

    @Override
    public int compareTo(Edge edge) {
        return Integer.compare(this.cost, edge.cost);
    }
}

class FastScanner {

    private static final InputStream in = System.in;
    private static final byte[] buffer = new byte[1024];
    private static int ptr = 0;
    private static int bufferLength = 0;
    private static boolean hasNextByte() {
        if (ptr < bufferLength) {
            return true;
        }else{
            ptr = 0;
            try {
                bufferLength = in.read(buffer);
            } catch ( IOException e) {
                e.printStackTrace();
            }
            if (bufferLength <= 0) {
                return false;
            }
        }
        return true;
    }
    private static int readByte() {
        if (hasNextByte()) return buffer[ptr++];
        else return -1;
    }
    private static boolean isPrintableChar(int c) {
        return 33 <= c && c <= 126;
    }
    private static boolean hasNext() {
        while(hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++;
        return hasNextByte();
    }
    static String next() {
        if (!hasNext()) throw new NoSuchElementException();
        StringBuilder sb = new StringBuilder();
        int b = readByte();
        while(isPrintableChar(b)) {
            sb.appendCodePoint(b);
            b = readByte();
        }
        return sb.toString();
    }
    static String nextLine() {
        if (!hasNext()) throw new NoSuchElementException();
        StringBuilder sb = new StringBuilder();
        int b = readByte();
        while(isPrintableChar(b) || b == 32) {
            sb.appendCodePoint(b);
            b = readByte();
        }
        return sb.toString();
    }
    static long nextLong() {
        if (!hasNext()) throw new NoSuchElementException();
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
        while(true){
            if ('0' <= b && b <= '9') {
                n *= 10;
                n += b - '0';
            }else if(b == -1 || !isPrintableChar(b)){
                return minus ? -n : n;
            }else{
                throw new NumberFormatException();
            }
            b = readByte();
        }
    }
    static int nextInt() {
        long nl = nextLong();
        if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE) throw new NumberFormatException();
        return (int) nl;
    }
    static double nextDouble() {
        return Double.parseDouble(next());
    }
}