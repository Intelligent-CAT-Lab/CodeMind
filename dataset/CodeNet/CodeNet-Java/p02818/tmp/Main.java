import java.io.*;
import java.util.*;

public class Main{
    static public void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        //BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //String[] buf = reader.readLine().split(" ");
        long A = sc.nextLong(), B = sc.nextLong(), K = sc.nextLong();
System.out.println("[INST]8;A;sc.nextLong();"+A);
System.out.println("[INST]8;B;sc.nextLong();"+B);
System.out.println("[INST]8;K;sc.nextLong();"+K);
        if(K<=A){
            A -= K;
        } else if(K <= A+B){
            B -= K-A;
            A = 0;
        } else {
            A = 0; B = 0;
        }
        System.out.println(A+" "+B);
    }
}

