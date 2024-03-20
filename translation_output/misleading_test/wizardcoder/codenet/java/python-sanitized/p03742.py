import java.io.*;
import java.lang.reflect.Array;
import java.util.*;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

@SuppressWarnings("unused")
public class p03742 {
    FastScanner in = new FastScanner(System.in);
    PrintWriter out = new PrintWriter(System.out);
    final int MOD = (int)1e9+7;
    void printlnYN(boolean b){out.println((b? "Brown" : "Alice"));}

    boolean[][] dp = new boolean[100][100], visited = new boolean[100][100];

    //System.out.println();ã¯ã¤ãããªãï¼ï¼
    void solve() throws Exception{
        long X = in.nextLong(), Y = in.nextLong();
        /*
        for(int i = 0; i <= 10; i++){
            for(int j = 0; j <= 10; j++){
                boolean b = dfs(i, j);
                out.print((b? "O" : "X") + " ");
            }
            out.println();
        }
        */