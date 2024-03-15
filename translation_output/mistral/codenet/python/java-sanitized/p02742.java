import java.util.*;
import java.io.*;

public class p02742 {
    static int H, W;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        H = Integer.parseInt(st.nextToken());
        W = Integer.parseInt(st.nextToken());
        System.out.println(ceil((double) H * W / 2) == 1 && H != 1 && W != 1 ? 1 : ceil((double) H * W / 2));
    }
}