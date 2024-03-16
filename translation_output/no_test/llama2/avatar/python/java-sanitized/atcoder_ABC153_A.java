Solution


import java.util.Scanner;

public class atcoder_ABC153_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h, a;
        h = sc.nextInt();
        a = sc.nextInt();
        System.out.println(Math.ceil(h / a));
    }
}