import java.util.*;
public class p02694 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = 100;
        int ans = 0;
        while (y < x) {
            ans++;
            y = (int) Math.floor(y *