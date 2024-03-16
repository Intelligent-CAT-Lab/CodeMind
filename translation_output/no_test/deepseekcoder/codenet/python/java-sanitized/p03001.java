import java.util.Scanner;

public class p03001 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputs = scanner.nextLine().split(" ");
        float w = Float.parseFloat(inputs[0]);
        float h = Float.parseFloat(inputs[1]);
        float x = Float.parseFloat(inputs[2]);
        float y = Float.parseFloat(inputs[3]);
        float mx = w/2;
        float my = h/2;
        float[] res = new float[2];
        res[0] = w*h/2;
        if (x==mx && y==my) {
            res[1] = 1;
        } else {
            res[1] = 0;
        }
        System.out.println(res[0] + " " + res[1]);
    }
}