import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BusGame {
    public static boolean canTake(int xNeeded, int xAvailable, int yNeeded, int yAvailable) {
        if (xNeeded > xAvailable)
            return false;
        if (yNeeded > yAvailable)
            return false;
        return true;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int turn = 0;
        while (true) {
            if (turn % 2 == 0) {
                if (canTake(2, x, 2, y)) {
                    x -= 2;
                    y -= 2;
                } else if (canTake(1, x, 12, y)) {
                    x -= 1;
                    y -= 12;
                } else if (canTake(0, x, 22, y)) {
                    y -= 22;
                } else {
                    System.out.println("Hanako");
                    return;
                }
            } else {
                if (canTake(0, x, 22, y)) {
                    y -= 22;
                } else if (canTake(1, x, 12, y)) {
                    x -= 1;
                    y -= 12;
                } else if (canTake(2, x, 2, y)) {
                    x -= 2;
                    y -= 2;
                } else {
                    System.out.println("Ciel");
                    return;
                }
            }
            turn++;
        }
    }
}