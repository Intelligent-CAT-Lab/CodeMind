import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
public class Main {
//recode
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
System.out.println("[INST]9;line;br.readLine();"+line);
        String[] Aa = line.split(" ");
System.out.println("[INST]10;Aa;line.split(' ');"+Aa);
        long A = Long.parseLong(Aa[0]);
System.out.println("[INST]11;A;Long.parseLong(Aa[0]);"+A);
        long B = Long.parseLong(Aa[1]);
System.out.println("[INST]12;B;Long.parseLong(Aa[1]);"+B);
        long C = Long.parseLong(Aa[2]);
System.out.println("[INST]13;C;Long.parseLong(Aa[2]);"+C);
        long K = Long.parseLong(Aa[3]);
System.out.println("[INST]14;K;Long.parseLong(Aa[3]);"+K);
        long var = 1000000000000000000L;
        if(Math.abs(A-B)>var){
System.out.println("[INST]16;None;Math.abs(A-B);"+Math.abs(A-B));
        	System.out.println("Unfair");
        }
        else{
        	if(K%2==0){
        		System.out.println(A-B);
        	}
        	else{
        		System.out.println(B-A);
        	}
        }
        
    }
		
		

}


