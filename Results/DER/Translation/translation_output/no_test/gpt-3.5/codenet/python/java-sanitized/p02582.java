import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p02582 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int mod = (int)Math.pow(10, 9) + 7;
        String s = br.readLine().trim();

        if (s.equals("RRR")) {
            System.out.println(3);
        } else if (s.equals("RRS") || s.equals("SRR")) {
            System.out.println(2);
        } else if (s.chars().filter(ch -> ch == 'R').count() == 0) {
            System.out.println(0);
        } else {
            System.out.println(1);
        }
    }
}