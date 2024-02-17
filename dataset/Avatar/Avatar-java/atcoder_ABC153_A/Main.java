import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long monsterHP = scan.nextLong();
        long servalATK = scan.nextLong();
        scan.close();

        long mod = monsterHP % servalATK;
        long ans = monsterHP / servalATK;

        if (mod > 0) {
            ans++;
        }

        System.out.println(ans);
    }
}