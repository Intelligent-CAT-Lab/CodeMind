import java.util.*;
import java.util.stream.*;
import java.util.function.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
System.out.println("[INST]7;a;Integer.parseInt(sc.next());"+a);
System.out.println("[INST]7;None;sc.next();"+sc.next());
        int b = Integer.parseInt(sc.next());
System.out.println("[INST]8;b;Integer.parseInt(sc.next());"+b);
System.out.println("[INST]8;None;sc.next();"+sc.next());
        
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
