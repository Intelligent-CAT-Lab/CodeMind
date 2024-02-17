import java.util.*;
import java.util.function.*;
import java.lang.*;
import java.io.*;

class ModInt implements Comparable<ModInt>{
    static final private int MOD = 1_000_000_007;
    static final public ModInt ZERO = new ModInt(0);
    static final public ModInt ONE = new ModInt(1);
    static final public ModInt TWO = new ModInt(2);
    static final public ModInt TEN = new ModInt(10);
    static final public ModInt MINUSONE = new ModInt(-1);
 
    static final private ModInt[] fact, factInv;
    static{
        int max = 1000000;
        fact = new ModInt[max+1];
        factInv = new ModInt[max+1];
        fact[0] = ONE;
        for(int i=1; i<=max; i++) fact[i] = fact[i-1].mult(i);
        factInv[max] = fact[max].inverse();
        for (int i = max-1;i >= 0;-- i) factInv[i] = factInv[i + 1].mult(i + 1);
    }
 
 
    int num;
 
    public ModInt(int n){
        this.num = n%MOD;
        if(this.num<0) this.num += MOD;
    }
 
    public int compareTo(ModInt another){
        return Integer.compare(this.num, another.num);
    }
    public boolean equals(Object another){
        if(another instanceof ModInt) return compareTo((ModInt)another)==0;
        else return false;
    }
    public String toString(){
        return Integer.toString(num);
    }
 
    ModInt add(ModInt m){
        return new ModInt(this.num + m.num);
    }
    ModInt add(int m){
        m %= MOD;
        return new ModInt(this.num + m);
    }
    ModInt adds(ModInt... ms){
        int ret = this.num;
        for(ModInt m:ms){
            ret = (ret + m.num) % MOD;
        }
        return new ModInt(ret);
    }
    ModInt sub(ModInt m){
        return new ModInt(this.num - m.num);
    }
    ModInt sub(int m){
        return this.add(-m);
    }
    ModInt mult(ModInt m){
        long ret = this.num;
        ret = (ret * m.num)%MOD;
        return new ModInt((int) ret);
    }
    ModInt mult(int m){
        long ret = this.num;
        ret = (ret * m) % MOD;
        return new ModInt((int)ret);
    }
    ModInt mults(ModInt... ms){
        long ret = this.num;
        for(ModInt m:ms) ret = (ret * m.num) % MOD;
        return new ModInt((int) ret);
    }
    ModInt power(long exp){
        if(exp<0) return ZERO;
        long a = this.num;
        long ans = 1;
        while(exp>0){
            if(exp%2==1) ans = (ans * a) % MOD;
            a = (a*a)%MOD;
            exp /= 2;
        }
        return new ModInt((int) ans);
    }
    ModInt inverse(){
        return this.power(MOD-2);
    }
    ModInt divide(ModInt m){
        return this.mult(m.inverse());
    }
    ModInt divide(int m){ return this.divide(new ModInt(m)); }
    static ModInt factorial(int i){
        return fact[i];
    }
    static ModInt combination(int n, int r){
        if(n<0 || r<0 || n<r) return ZERO;
        return fact[n].mults(factInv[r], factInv[n-r]);
    }
    static ModInt permutation(int n, int r){
        if(n<0 || r<0 || n<r) return ZERO;
        return fact[n].mults(factInv[n-r]);
    }
}

public class Main {
    static ModInt solve(int X, int Y){
        if((X+Y)%3 != 0) return ModInt.ZERO;
        int turn = (X+Y)/3;
        int upper = X-turn, right = Y-turn;
        return ModInt.combination(turn, upper);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int Y = sc.nextInt();
        System.out.println(solve(X,Y));
    }
}
