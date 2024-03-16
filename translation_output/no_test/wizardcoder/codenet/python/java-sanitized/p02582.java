import java.io.*;

public class p02582 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String s = br.readLine().trim();
        int mod = (int) Math.pow(10, 9) + 7;
        if (s.equals("RRR")) {
            bw.write("3");
        } else if (s.equals("RRS") || s.equals("SRR")) {
            bw.write("2");
        } else if (s.replaceAll("R", "").equals("")) {
            bw.write("0");
        } else {
            bw.write("1");
        }
        bw.close();
    }
}