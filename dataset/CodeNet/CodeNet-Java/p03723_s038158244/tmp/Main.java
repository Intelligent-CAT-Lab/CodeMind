import java.util.*;
public class Main{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                int a = sc.nextInt();
System.out.println("[INST]4;a;sc.nextInt();"+a);
                int b = sc.nextInt();
System.out.println("[INST]5;b;sc.nextInt();"+b);
                int c = sc.nextInt();
System.out.println("[INST]6;c;sc.nextInt();"+c);
                boolean ebishu = true;
                if(a % 2 == 1 || b % 2 == 1 || c % 2 == 1){
                        ebishu = false;
                        System.out.println(0);
                }
                int d = 0 , e = 0 , f = 0;
                for(int i = 1 ; i < 1000000000 && ebishu ; i++){
                        d = (a + b) / 2;
                        e = (b + c) / 2;
                        f = (c + a) / 2;
                        a = d;
                        b = e;
                        c = f;
                        if(a == b && b == c){
                                System.out.println(-1);
                                ebishu = false;
                        }
                        if(a % 2 == 1 || b % 2 == 1 || c % 2 == 1){
                                ebishu = false;
                                System.out.println(i);
                        }
                }
                if(ebishu) System.out.println(-1);
        }
}
//初期値が奇数の場合をミスっていました
//計算量やばそうだけどまあいいや！TLE出ないことを祈ります！