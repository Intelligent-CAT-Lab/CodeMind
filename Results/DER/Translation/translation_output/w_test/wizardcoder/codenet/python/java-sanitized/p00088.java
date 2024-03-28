import java.io.*;

public class p00088 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = br.readLine())!= null) {
            StringBuilder sb = new StringBuilder();
            for (char c : line.toCharArray()) {
                sb.append(d