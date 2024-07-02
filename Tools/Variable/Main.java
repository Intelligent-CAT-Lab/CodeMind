import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

        public static void main(String[] args) throws IOException{

                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                String str = br.readLine();
System.out.println("[INST]9;str;br.readLine();"+str);
                String ret = "";
                for (int i = 0; i < str.length(); i++) {
System.out.println("[INST]11;None;str.length();"+str.length());
                        char ch = str.charAt(str.length() - i - 1);
System.out.println("[INST]12;ch;str.charAt(str.length() - i - 1);"+ch);
System.out.println("[INST]12;None;str.length();"+str.length());
                        ret += ch;
                }
                System.out.println(ret);
        }
}
