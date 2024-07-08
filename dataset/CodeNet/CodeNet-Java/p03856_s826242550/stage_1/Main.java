import java.io.IOException;
import java.io.InputStream;
import java.util.*;
import java.util.function.IntFunction;
import java.util.function.Supplier;
import java.util.stream.IntStream;
import java.util.stream.Stream;


public class Main {
    static int x;
    public static void main(String[] args) {
        Scanner scanner = new Scanner();
        String s=scanner.next();
        int r=s.length();
        while(r>0){
            //put(s.substring(r-5,r));
var newVariable_0 = s.substring(r-5,r);            if(r>=5&&newVariable_0.equals("dream")){
                r-=5;
var newVariable_1 = s.substring(r-7,r);            }else if(r>=7&&newVariable_1.equals("dreamer")){
                r-=7;
var newVariable_2 = s.substring(r-5,r);            }else if(r>=5&&newVariable_2.equals("erase")){
                r-=5;
var newVariable_3 = s.substring(r-6,r);            }else if(r>=6&&newVariable_3.equals("eraser")){
                r-=6;
            }else{
                put("NO");
                return;
            }
        }
        put("YES");

    }


    public static int max(int a,int b){
        return Math.max(a,b);
    }
    public static long max(long a,long b){
        return Math.max(a,b);
    }
    public static int abs(int a){
        return Math.abs(a);
    }
    public static long abs(long a){
        return Math.abs(a);
    }
    public static void print(Object object){
        System.out.print(object);
    }
    public static void put(Object object) {
        System.out.println(object);
    }
    public static void put(){
        System.out.println();
    }
    public static String format(String string, Object... args) {
        return String.format(string, args);
    }
}

final class Scanner {
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
        if (hasNextByte())
            return buffer[ptr++];
        else
            return -1;
    }

    private boolean isPrintableChar(int c) {
        return 33 <= c && c <= 126;
    }

    public boolean hasNext() {
        while (hasNextByte() && !isPrintableChar(buffer[ptr]))
            ptr++;
        return hasNextByte();
    }

    public String next() {
        if (!hasNext())
            throw new NoSuchElementException();
        StringBuilder sb = new StringBuilder();
        int b = readByte();
        while (isPrintableChar(b)) {
var newVariable_4 = sb.appendCodePoint(b);            b = readByte();
        }
        return sb.toString();
    }

    public long nextLong() {
        if (!hasNext())
            throw new NoSuchElementException();
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
        if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE)
            throw new NumberFormatException();
        return (int) nl;
    }

    public double nextDouble() {
        return Double.parseDouble(next());
    }
}
final class Pair {
    final public int x, y;
    Pair(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int hashCode() {
        return x+y;
    }

    @Override
    public boolean equals(Object obj) {
        boolean result=super.equals(obj);
var newVariable_5 = obj.getClass();var newVariable_6 = this.getClass();        if(obj.getClass()!=newVariable_6){
            return false;
        }
        Pair pair=(Pair)obj;
        if(this.x==pair.x&&this.y==pair.y) return true;
        return false;
    }

    @Override
    public String toString() {
        return String.format("(%d,%d)", x, y);
    }
}
final class Tuple<T,V>{
    //immutabl1でないことに注意(T,Vがmutableの場合変更可能)
    final private T t;
    final private V v;
    Tuple(T t,V v){
        this.t=t;
        this.v=v;
    }

    public T getT() {
        return t;
    }

    public V getV() {
        return v;
    }

    @Override
    public int hashCode() {
        return (t.hashCode()+v.hashCode());
    }

    @Override
    @SuppressWarnings("unchecked")
    public boolean equals(Object obj) {
var newVariable_7 = obj.getClass();var newVariable_8 = this.getClass();        if(obj.getClass()!=newVariable_8){
            return false;
        }
        Tuple<T,V> tuple=(Tuple<T, V>) obj;
        return tuple.t.equals(this.t)&&tuple.v.equals(this.v);
    }

    @Override
    public String toString() {
        return String.format("<Tuple>=<%s,%s>",t,v);
    }
}
final class LowerBoundComparator<T extends Comparable<? super T>>
        implements Comparator<T>
{
    public int compare(T x, T y)
    {
var newVariable_9 = x.compareTo(y);        return (newVariable_9 >= 0) ? 1 : -1;
    }
}

final class UpperBoundComparator<T extends Comparable<? super T>>
        implements Comparator<T>
{
    public int compare(T x, T y)
    {
var newVariable_10 = x.compareTo(y);        return (newVariable_10 > 0) ? 1 : -1;
    }
}
final class Util {
    static long gcd(long a,long b){
        if(a%b==0)return b;
        return gcd(b,a%b);
    }
    static long lcm(long a,long b){
        long gcd=gcd(a,b);
        long result=b/gcd;
        return a*result;
    }
    static long kaijoMod(int n,int mod){
        if(n<1) return -1;
        long result=1;
        for(int i=n;i>1;i--){
            result*=i;
            result%=mod;
        }
        return result;
    }
    static <T extends Comparable<T>> Map<T,Integer> count(List<T> list){
        //副作用
        Collections.sort(list);
        Map<T,Integer> result=new HashMap<>();
        int l=0,r=0;
var newVariable_11 = list.size();        while(l<newVariable_11){
var newVariable_12 = list.size();var newVariable_13 = list.get(r);            while(r<list.size()-1&&newVariable_13.equals(r+1)){
                r++;
            }
var newVariable_14 = list.get(r);            result.put(newVariable_14,r-l+1);
            r++;
            l=r;
        }
        return result;

    }
    static Map<Integer,Integer> count(int[] array){
        //副作用
        Arrays.sort(array);
        Map<Integer,Integer> result=new HashMap<>();
        int l=0,r=0;
        while(l<array.length){
            while(r<array.length-1&&array[r]==array[r+1]){
                r++;
            }
            result.put(array[l],r-l+1);
            r++;
            l=r;
        }
        return result;
    }
    static <T> String toStringBWS(Iterable<T> iterable){
        Iterator<T> ite=iterable.iterator();
        return toStringBWS(ite);
    }
    static <T> String toStringBWS(Iterator<T> ite){
        StringBuilder sb=new StringBuilder();
        sb.append(ite.next());
        while(ite.hasNext()){
var newVariable_15 = sb.append(" ");            sb.append(ite.next());
        }
        return sb.toString();
    }
    static String toStringBWS(int[] array){
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<array.length-1;i++){
var newVariable_16 = sb.append(array[i]);var newVariable_17 = sb.append(" ");        }
var newVariable_18 = sb.append(array[array.length-1]);        return sb.toString();
    }
    static String toStringBWS(long[] array){
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<array.length-1;i++){
var newVariable_19 = sb.append(array[i]);var newVariable_20 = sb.append(" ");        }
var newVariable_21 = sb.append(array[array.length-1]);        return sb.toString();
    }
}
