import java.util.Scanner;

public class p02390 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ss = scanner.nextInt();
        int hour = ss / (60 * 60);
        int second = ss % (60 * 60);
        int minute = second / 60;
        second = second % 60;
        System.out.println(hour + ":" + minute + ":" + second);
    }
}


You can test this code with the following test input:


46979


And it should output:


1:16:19