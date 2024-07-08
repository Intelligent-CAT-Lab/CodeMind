import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long X = sc.nextLong();
        long P = 100;
        int cnt = 0;
        while(P < X){
            P += P/100;
            cnt++;
        }
        System.out.println(cnt);
    }
}
