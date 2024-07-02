import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
System.out.println("[INST]10;str;br.readLine();"+str);
		int num = Integer.parseInt(str);
System.out.println("[INST]11;num;Integer.parseInt(str);"+num);
		
		int i;
		
		for(i = 0; i < 100; i++){
			if(num >= Math.pow(2, i)-1){
System.out.println("[INST]16;None;Math.pow(2, i);"+Math.pow(2, i));
				continue;
			}else{
				break;
			}
		}
		
		System.out.println(i-1);
	}
}

