import java.io.*;

/**
 * Created by Ayushi on 25 Jul 2020.
 * Problem:
 * Round:
 */

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        if (t >= 1800) System.out.println(1);
        else if (t >= 1600) System.out.println(2);
        else if (t >= 1400) System.out.println(3);
        else if (t >= 1200) System.out.println(4);
        else if (t >= 1000) System.out.println(5);
        else if (t >= 800) System.out.println(6);
        else if (t >= 600) System.out.println(7);
        else System.out.println(8);

        br.close();
    }
}
