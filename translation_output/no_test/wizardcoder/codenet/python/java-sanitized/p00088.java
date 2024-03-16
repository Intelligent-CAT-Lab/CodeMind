import java.io.*;

public class p00088 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = br.readLine())!= null) {
            String translated = "";
            for (int i = 0; i < line.length(); i++) {
                char c = line.charAt(i);
                if (c =='') {
                    translated += " ";
                } else if (c == '-') {
                    translated += ".";
                } else if (c == '.') {
                    translated += "-";
                } else if (c == ',') {
                    translated += ",";
                } else if (c == '?') {
                    translated += "?";
                } else if (c == '\'') {
                    translated += "'";
                } else if (c >= 'A' && c <= 'Z') {
                    translated += c;
                } else if (c >= 'a' && c <= 'z') {
                    translated += Character.toUpperCase(c);
                } else {
                    translated += " ";
                }
            }
            System.out.println(translated);
        }
    }
}