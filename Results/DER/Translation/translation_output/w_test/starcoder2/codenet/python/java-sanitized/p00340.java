import java.util.Scanner;

public class p00340 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[4];
        for (int i = 0; i < 4; i++) {
            num[i] = sc.nextInt();
        }
        sc.close();
        int[] num2 = new int[4];
        for (int i = 0; i < 4; i++) {
            num2[i] = num[i];
        }
        for (int i = 0; i < 4; i++) {
            for (int j = i + 1; j < 4; j++) {
                if (num[i] > num[j]) {
                    int temp = num[i];
                    num[i] = num[j];
                    num[j] = temp;
                }
            }
        }
        if (num[0] == num[1] && num[2] == num[3]) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}