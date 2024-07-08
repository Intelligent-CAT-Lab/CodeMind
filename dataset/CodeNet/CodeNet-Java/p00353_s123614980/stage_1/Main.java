import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main{
	public static void main(String[] args) {

		BufferedReader bfr=new BufferedReader(new InputStreamReader(System.in));
		String str="";
		StringTokenizer stk;
		int[] k1=new int[3];
		int i=0;
		try {
			while(true) {

				str = bfr.readLine();

				if(str==null) {
					System.exit(0);
				}

				stk=new StringTokenizer(str," ");

var newVariable_0 = stk.hasMoreTokens();				while(newVariable_0) {
var newVariable_1 = Integer.parseInt(stk.nextToken());var newVariable_2 = stk.nextToken();					k1[i]=Integer.parseInt(newVariable_2);
					i++;
				}
				i=0;

				int kariiregaku=k1[2]-k1[0];
				if(kariiregaku<0) {
					kariiregaku=0;
				}

				if(k1[1]>=kariiregaku) {
					System.out.println(kariiregaku);
				}
				else {
					System.out.println("NA");
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

