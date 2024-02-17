import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 整数の入力
        String N = sc.next();
        char[] W = new char[N.length()+1];
        W[0]='0';
        for(int i=0;i<N.length();i++){
            W[i+1] = N.charAt(i);
        }
        System.out.println(sum(W, W.length-1));
    }

    private static void print(char[] N){
        for(int i=0;i<N.length;i++){
            System.out.print(N[i]);
        }
        System.out.println();
    }
    private static long sum(char[] N, int to){
        int keta = N[to]-'0';
//        int keta = N.charAt(N.length()-1)-'0';
        if(to == 0){
            if(keta <= 5){return keta;}
            else{return 11-keta;}
        }
        if(keta < 5) {
            return keta + sum(N, to-1);
        }else if(keta == 5){
            if(N[to-1] >= '5'){
                add(N, to-1);
                return (10-keta) + sum(N, to-1);
            }else{
                return keta + sum(N, to-1);
            }
        }else{
            add(N, to-1);
            return (10-keta) + sum(N, to-1);
        }
    }
    private static void add(char[] N, int ind){
        //if(N.length() == 0){return "1";}
        int i=ind;
        if(N[i] <= '8'){
            N[i]++;
            return;
        }
        while(i >= 0 && N[i] == '9'){
            N[i] = '0';
            i--;
        }
        N[i]++;
    }
}
