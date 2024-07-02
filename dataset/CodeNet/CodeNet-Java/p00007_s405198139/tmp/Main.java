import java.io.*;

class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		String s=r.readLine();
System.out.println("[INST]5;s;r.readLine();"+s);
		int n = Integer.parseInt(s);
System.out.println("[INST]6;n;Integer.parseInt(s);"+n);
		int money=100000;
		try {
			for(;n>0;n--){
				money*=1.05;
				if (money%1000>0){
					money = ((money/1000)+1)*1000;
				}
			}
			System.out.println(money);
		} catch (Exception err) {
			System.exit(0);
System.out.println("[INST]17;None;System.exit(0);"+System.exit(0));
		}
	}
}