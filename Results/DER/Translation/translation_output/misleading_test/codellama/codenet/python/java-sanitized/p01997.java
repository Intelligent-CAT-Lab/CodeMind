import java.util.Scanner;

public class p01997 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double volume = 4/3*Math.PI*B*B*B;
        System.out.println(volume);
    }
}