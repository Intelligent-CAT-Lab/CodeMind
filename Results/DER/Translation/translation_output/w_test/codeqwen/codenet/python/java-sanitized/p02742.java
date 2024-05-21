import java.util.*;

public class p02742 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int H = scanner.nextInt();
        int W = scanner.nextInt();
        System.out.println(Math.ceil((double)H*W/2));
    }
}