//[2, 1510] の約数全てをもつ整数factを探す
//[fact + 2, fact + 1510] は全て約数を持つことがわかる
//どんな値が入力されようと, fact + 2を出力しておけばいい

import java.util.*;
import java.math.BigInteger;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        BigInteger fact = BigInteger.ONE;
        BigInteger mul = BigInteger.ONE;

        for(int i = 1; i <= 1510; i++){
            fact = fact.multiply(mul);
System.out.println("[INST]14;fact;fact.multiply(mul);"+fact);
            mul = mul.add(BigInteger.ONE);
System.out.println("[INST]15;mul;mul.add(BigInteger.ONE);"+mul);
        }
        fact = fact.add(new BigInteger("2"));
System.out.println("[INST]17;fact;fact.add(new BigInteger('2'));"+fact);

        while(sc.hasNextInt()){
System.out.println("[INST]19;None;sc.hasNextInt();"+sc.hasNextInt());
            int n = sc.nextInt();
System.out.println("[INST]20;n;sc.nextInt();"+n);
            System.out.println(fact);

            for(int i = 2; i < 2 + n; i++){
                System.out.println(i);
            }
        }
    }
}