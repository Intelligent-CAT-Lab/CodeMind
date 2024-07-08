import java.util.Scanner;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
var newVariable_0 = sc.next();        int N = Integer.parseInt(newVariable_0);
var newVariable_1 = sc.next();        int K = Integer.parseInt(newVariable_1);
var newVariable_2 = sc.next();        int S = Integer.parseInt(newVariable_2);
        if (K == 0){
            if (S == 1000000000){
                for (int i = 0; i < N; i++){
                    out.print("1 ");
                }
            }
            else{
                S += 1;
                for (int i = 0; i < N; i++){
                    out.print(S + " ");
                }
            }
        }
        else{
            for (int i = 0; i < N; i++){
                if (i < K){
                    out.print(S + " ");
                }
                else{
                    if (S == 1000000000){
                        out.print("1 ");
                    }
                    else{
                        out.print(S + 1);
                        out.print(" ");
                    }
                }
            }
        }


        //テンプレ
        sc.close();
        out.flush();
    }
}