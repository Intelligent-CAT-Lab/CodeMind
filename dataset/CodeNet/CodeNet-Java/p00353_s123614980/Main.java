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

				while(stk.hasMoreTokens()) {
					k1[i]=Integer.parseInt(stk.nextToken());
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

