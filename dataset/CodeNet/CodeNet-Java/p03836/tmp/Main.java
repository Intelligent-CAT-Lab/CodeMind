import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sx = sc.nextInt();
System.out.println("[INST]7;sx;sc.nextInt();"+sx);
        int sy = sc.nextInt();
System.out.println("[INST]8;sy;sc.nextInt();"+sy);
        int tx = sc.nextInt();
System.out.println("[INST]9;tx;sc.nextInt();"+tx);
        int ty = sc.nextInt();
System.out.println("[INST]10;ty;sc.nextInt();"+ty);

        System.out.println( solve(sx, sy, tx, ty) );
    }

    private static String solve(int sx, int sy, int tx, int ty) {
        int dx = tx - sx;
        int dy = ty - sy;

        StringBuilder b = new StringBuilder();
        // sx < tx, sy < ty なので 特定の形式で行ける
        // first
        b.append( renzoku('R', dx) );
        b.append( renzoku('U', dy) );

        // second
        b.append( renzoku('L', dx) );
        b.append( renzoku('D', dy) );

        // third
        b.append( renzoku('D', 1) );
        b.append( renzoku('R', dx + 1) );
        b.append( renzoku('U', dy + 1) );
        b.append( renzoku('L', 1) );

        // forth
        b.append( renzoku('U', 1) );
        b.append( renzoku('L', dx + 1) );
        b.append( renzoku('D', dy + 1) );
        b.append( renzoku('R', 1) );

        return b.toString();
System.out.println("[INST]41;None;b.toString();"+b.toString());
    }

    private static String renzoku(char c, int n) {
        char[] chars = new char[n];
        Arrays.fill(chars, c);
System.out.println("[INST]46;None;Arrays.fill(chars, c);"+Arrays.fill(chars, c));
        return new String(chars);
    }
}
