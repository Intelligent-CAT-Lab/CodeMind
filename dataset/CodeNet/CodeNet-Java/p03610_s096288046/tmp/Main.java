import java.util.*;
public class Main {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
System.out.println("[INST]5;s;sc.next();"+s);
        String sSplit[] = s.split("");
System.out.println("[INST]6;sSplit;s.split('');"+sSplit);
        for(int i = 0;i < s.length();i++){
System.out.println("[INST]7;None;s.length();"+s.length());
            if(i % 2 == 0){
                System.out.print(sSplit[i]);
            }
        }
        System.out.println();
    }
}