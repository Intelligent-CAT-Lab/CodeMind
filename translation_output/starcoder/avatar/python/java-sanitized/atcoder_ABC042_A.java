import java.util.*;
public class atcoder_ABC042_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ABC = new int[3];
        ABC[0] = sc.nextInt();
        ABC[1] = sc.nextInt();
        ABC[2] = sc.nextInt();
        if (ABC.length == 3 && ABC.contains(5) == 2) {
            System.out.println("YES" + (ABC[0] + ABC[1] + ABC[2] == 17? "" : "NO"));
        } else {
            System.out.println("NO");
        }
    }
}