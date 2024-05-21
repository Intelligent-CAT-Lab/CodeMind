import java.util.*;

public class p03001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        float w = Float.parseFloat(input[0]);
        float h = Float.parseFloat(input[1]);
        float x = Float.parseFloat(input[2]);
        float y = Float.parseFloat(input[3]);
        float mx = w / 2;
        float my = h / 2;
        float area = w * h / 2;
        int isCenter = (x == mx && y == my)? 1 : 0;
        System.out.println(area + " " + isCenter);
    }
}