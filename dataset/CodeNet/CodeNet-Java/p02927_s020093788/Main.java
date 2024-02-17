import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int Month = sc.nextInt();
		// スペース区切りの整数の入力
		int Day = sc.nextInt();
      int Dayone = Day%10;
      int Dayten = Day/10;
      //カウンター
		int count = 0;
		// 文字列の入力
		//String s = sc.next();
      int k=9;
      for(int tuki=1;tuki<=Month;tuki++){
      	for(int i=2;i<=Dayten;i++){
        	if(i==Dayten){
      	    	k=Dayone;
        	}else{
              k=9;
            }
          for(int j=2;j<=k;j++){
      			if(i*j==tuki){
        		count++;
        		// 出力
				//System.out.println(tuki+"月　"+(i*10+j)+"日　"+count);
      			}
        	}
      	}
      }
      
      
      
		// 出力
		//System.out.println(Month+" "+Day+" "+Dayten+" "+Dayone+" "+count);
      System.out.println(count);
	}
}