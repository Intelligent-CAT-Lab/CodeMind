import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.valueOf(br.readLine());
System.out.println("[INST]7;num;Integer.valueOf(br.readLine());"+num);
System.out.println("[INST]7;None;br.readLine();"+br.readLine());
		System.out.println(num*num*num);
	}

}