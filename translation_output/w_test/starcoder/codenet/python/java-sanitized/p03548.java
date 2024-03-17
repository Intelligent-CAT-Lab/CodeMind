import java.util.*;
public class p03548 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int Y = sc.nextInt();
        int Z = sc.nextInt();
        int width = Y + 2 * Z;
        int answer = 0;
        while (width <= X) {
            answer++;
            width += Y + Z;
        }
        System.out.println(answer);
    }
}