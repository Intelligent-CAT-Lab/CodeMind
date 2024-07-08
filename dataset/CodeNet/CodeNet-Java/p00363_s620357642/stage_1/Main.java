import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main{
	public static void main(String[] args) {

		BufferedReader bfr=new BufferedReader(new InputStreamReader(System.in));
		String str="";
		StringTokenizer stk;
		String moji="";
		int yoko,tate;
		String[] hata;

		try {
			str=bfr.readLine();
			if(str==null) {
				System.exit(0);
			}
			else {
				stk=new StringTokenizer(str," ");
var newVariable_0 = stk.nextToken();				yoko=Integer.parseInt(newVariable_0);
var newVariable_1 = stk.nextToken();				tate=Integer.parseInt(newVariable_1);
				moji=stk.nextToken();
				hata=new String[tate];

				for(int i=0; i<tate; i++) {
					hata[i]="";
				}


				for(int i=0; i<yoko; i++) {
					if(i==0 || i==yoko-1) {		// hata no +
						hata[0]=hata[0]+"+";
						hata[tate-1]=hata[tate-1]+"+";
						for(int j=1; j<tate-1; j++) {
							hata[j]=hata[j]+"|";
						}
					}
					else {
						hata[0]=hata[0]+"-";
						hata[tate-1]=hata[tate-1]+"-";

						for(int j=1; j<tate-1; j++) {
							if(j!=(tate-1)/2) {
								hata[j]=hata[j]+".";
							}
							else {
								if(i==(yoko-1)/2) {
									hata[j]=hata[j]+moji;
								}
								else {
									hata[j]=hata[j]+".";
								}
							}
						}
					}
				}
				for(int l=0; l<tate; l++) {
					System.out.println(hata[l]);
				}

			}
		}catch(IOException e){}
	}
}
