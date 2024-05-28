/*
String[]の初期化、整数の型がlongになっているか
関数（splitとかcontainsとか）内では"+"とかは正規表現となされるので"\\+"とする
配列のコピーはarr1=arr.clone()
HashSet<>[]はおのおの初期化した？？？？？
負の数の割り算は絶対値が小さいほうに切り捨てられるex.-1/2=0ので、ある値>kみたいな式だとバグらせやすいので注意
ある値>=kとして、切り上げた値をとるべき
toLowerCase()はアルファベット以外に対して行ってもエラーにはならない
 */
//入力終了→Ctrl+D
import java.util.*;
import java.awt.*;
import java.awt.geom.Point2D;
import static java.lang.System.*;
import static java.lang.Math.*;
public class p03437 {
    public static void main(String[] $) {
        Scanner sc = new Scanner(in);
        long x=sc.nextLong(),y=sc.nextLong();
        if(x%y==0){
            out.println(-1);
        }else {
            out.println(x);
        }
    }
}