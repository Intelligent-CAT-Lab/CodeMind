import java.util.*;
public class Main {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String sSplit[] = s.split("");
        for(int i = 0;i < s.length();i++){
            if(i % 2 == 0){
                System.out.print(sSplit[i]);
            }
        }
        System.out.println();
    }
}