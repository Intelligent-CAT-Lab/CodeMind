import java.util.*;
import java.util.stream.*;
import java.util.function.*;

public class p03125 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        
        System.out.println(b % a == 0 ? a + b : b - a);
    }
    
    // // パラメタ渡しもちゃんとクラス作るのも面倒なので手抜き
    // // 必要な値はここで全部取ってしまう
    // Scanner sc = new Scanner(System.in);
    // int n = Integer.parseInt(sc.next());
    // {sc.nextLine();}
    // int[] a = IntStream.range(0, n).map(i -> Integer.parseInt(sc.next())).toArray();
    
    // String solve() {
    //     return n + "" + Arrays.toString(a);
    // }
    
}
