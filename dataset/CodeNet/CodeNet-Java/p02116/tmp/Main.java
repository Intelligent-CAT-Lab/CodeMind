import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args) {

		BufferedReader bfr=new BufferedReader(new InputStreamReader(System.in));
		String str="";

		try {
			str=bfr.readLine();
System.out.println("[INST]11;str;bfr.readLine();"+str);
			long res=0;
			long han=0;
			long ni_beki=1;
			int ruijyo=0;

			if(str=="") {
				System.exit(0);
System.out.println("[INST]18;None;System.exit(0);"+System.exit(0));
			}

			else {
				res=Long.parseLong(str);
System.out.println("[INST]22;res;Long.parseLong(str);"+res);

				for(int i=0; i<1;) {
					han=(res>>ruijyo)%2;
					if(han==0) {
						res=(res%ni_beki)+1;
						i=1;
						break;
					}
					else {
						ni_beki=ni_beki*2;
						ruijyo++;
					}
				}
				System.out.println(res);
			}
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}

	}

}
