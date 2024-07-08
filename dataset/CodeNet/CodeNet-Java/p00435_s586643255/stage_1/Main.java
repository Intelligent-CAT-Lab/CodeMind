import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	
	// テァツ板ィテヲツ??
	Scanner sc = new Scanner(System.in);
	char[] alpha = {'A','B','C','D','E','F','G','H',
			'I','J','K','L','M','N','O','P',
			'Q','R','S','T','U','V','W','X',
			'Y','Z'};
	
	// テ・ツ?・テ・ツ環?
	String in = sc.next();
	char[] inChar = in.toCharArray();

	// テ・ツ、ツ嘉ヲツ崢エ
	for(int i = 0;i<inChar.length;i++){
	    for(int j = 0;j<26;j++){
		if(inChar[i]==alpha[j]){
		    inChar[i] = alpha[j<3?(26-(3-j)):(j-3)%26];
		    break;
		}
	    }
	}

	String ans = "";
	for(int i = 0;i<inChar.length;i++){
	    ans += inChar[i];
	}

	System.out.println(ans);

    }
}