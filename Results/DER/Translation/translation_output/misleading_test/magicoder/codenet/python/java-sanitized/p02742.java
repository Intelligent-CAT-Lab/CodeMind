import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int H = scanner.nextInt();
        int W = scanner.nextInt();
        System.out.println((int)Math.ceil((double)H*W/2) * (H != 1 && W != 1 ? 1 : 0) + 1);
    }
}