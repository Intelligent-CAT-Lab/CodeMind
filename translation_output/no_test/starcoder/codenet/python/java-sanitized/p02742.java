import java.util.*;
import java.io.*;

public class p02742 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();
        System.out.println(Math.ceil(H*W/2) if H!= 1 && W!= 1 else 1);
    }
}