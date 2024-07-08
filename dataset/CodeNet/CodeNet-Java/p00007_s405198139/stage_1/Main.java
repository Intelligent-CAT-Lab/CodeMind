import java.io.*;

class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		String s=r.readLine();
		int n = Integer.parseInt(s);
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
		}
	}
}