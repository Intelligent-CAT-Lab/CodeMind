import java.util.Scanner;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int N = Integer.parseInt(sc.next());
System.out.println("[INST]7;N;Integer.parseInt(sc.next());"+N);
System.out.println("[INST]7;None;sc.next();"+sc.next());
        int K = Integer.parseInt(sc.next());
System.out.println("[INST]8;K;Integer.parseInt(sc.next());"+K);
System.out.println("[INST]8;None;sc.next();"+sc.next());
        int S = Integer.parseInt(sc.next());
System.out.println("[INST]9;S;Integer.parseInt(sc.next());"+S);
System.out.println("[INST]9;None;sc.next();"+sc.next());
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
System.out.println("[INST]43;None;out.flush();"+out.flush());
    }
}