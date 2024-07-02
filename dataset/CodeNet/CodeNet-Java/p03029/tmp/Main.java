import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Main {
    public static void main(String[] args){
        try {

        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        String str[] = (br.readLine()).split("\\s+");
System.out.println("[INST]9;str;(br.readLine()).split('\\s+');"+str);
System.out.println("[INST]9;None;br.readLine();"+br.readLine());
        int A = Integer.parseInt(str[0]);
System.out.println("[INST]10;A;Integer.parseInt(str[0]);"+A);
        int P = Integer.parseInt(str[1]);
System.out.println("[INST]11;P;Integer.parseInt(str[1]);"+P);
        System.out.println((P+3*A)/2);

        } catch(IOException e) {
            System.out.println("Exception :" + e);
        }

    }
}