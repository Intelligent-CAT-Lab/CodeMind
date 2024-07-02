import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{

	public static void main(String[] args) {
		
		//入力
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String work[]=new String[5];
		try {
			work=br.readLine().split("\\s+");
System.out.println("[INST]11;work;br.readLine().split('\\s+');"+work);
System.out.println("[INST]11;None;br.readLine();"+br.readLine());
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		int W=Integer.parseInt(work[0]);
System.out.println("[INST]16;W;Integer.parseInt(work[0]);"+W);
		int H=Integer.parseInt(work[1]);
System.out.println("[INST]17;H;Integer.parseInt(work[1]);"+H);
		int x=Integer.parseInt(work[2]);
System.out.println("[INST]18;x;Integer.parseInt(work[2]);"+x);
		int y=Integer.parseInt(work[3]);
System.out.println("[INST]19;y;Integer.parseInt(work[3]);"+y);
		int r=Integer.parseInt(work[4]);
System.out.println("[INST]20;r;Integer.parseInt(work[4]);"+r);
		
		//判定処理
		String judge;
		if((x-r)>=0 && (x+r)<=W){
			if(((y-r)>=0 && (y+r)<=H)) {
				judge="Yes";
			}else {
				judge="No";
			}
		}else {
			judge="No";
		}
		
		//出力
		System.out.println(judge);
	}

}

