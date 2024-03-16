import java.util.*;
import java.lang.*;
import java.io.*;

public class p02742 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int H = scanner.nextInt();
        int W = scanner.nextInt();
        if (H != 1 && W != 1) {
            System.out.println((int)Math.ceil(H*W/2.0));
        } else {
            System.out.println(1);
        }
    }
}