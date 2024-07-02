import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
System.out.println("[INST]5;s;sc.next();"+s);
        int N = s.length();
System.out.println("[INST]6;N;s.length();"+N);
        char[] c = s.toCharArray();
System.out.println("[INST]7;c;s.toCharArray();"+c);
        if (c[0]=='0' || c[N-2]=='0' || c[N-1]=='1') {
            System.out.println(-1);
            return;
        }
        int NN = N-1;
        for (int i=0;i<NN/2;i++) {
            if (c[i]!=c[NN-1-i]) {
                System.out.println(-1);
                return;
            }
        }

        int parent = 0;
        for (int i=0;i<N-1;i++) {
            System.out.println((parent+1)+" "+(i+2));
            if (c[i]=='1') {
                parent=i+1;
            }
        }
    }
}