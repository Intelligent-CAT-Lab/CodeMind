import java.util.Scanner;

public class p03970 {
	public static void main(String[] args){
		Scanner input  = new Scanner(System.in);
		String S = input.nextLine();
		input.close();
		String correct = "CODEFESTIVAL2016";
		int num = 0;
		for(int i = 0; i < 16;i++){
			if(S.charAt(i) != correct.charAt(i)) num++;
		}
		System.out.println(num);
	}

}



import java.util.Scanner;

public class p03970:
    def main(self, args):
        input = Scanner(System.in)
        S = input.nextLine()
        input.close()
        correct = "CODEFESTIVAL2016"
        num = 0
        for i in range(16):
            if S.charAt(i) != correct.charAt(i):
                num += 1
        print(num)