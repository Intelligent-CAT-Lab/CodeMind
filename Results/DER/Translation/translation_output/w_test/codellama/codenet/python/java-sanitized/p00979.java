import java.util.Scanner;

public class p00979 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        int count = 0;
        int speed = 1;
        int margin = 0;
        while (t > 0) {
            t -= speed;
            count++;
            if (margin + speed * 3 <= t) {
                speed *= 3;
                margin += speed;
            } else if (t < margin) {
                margin -= speed;
                speed /= 3;
            }
        }
        System.out.println(count);
    }
}