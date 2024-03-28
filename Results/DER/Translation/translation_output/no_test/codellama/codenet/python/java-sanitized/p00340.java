import java.util.Scanner;

public class p00340 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[4];
        for (int i = 0; i < 4; i++) {
            num[i] = sc.nextInt();
        }
        Arrays.sort(num);
        if (num[0] == num[1] && num[2] == num[3]) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}