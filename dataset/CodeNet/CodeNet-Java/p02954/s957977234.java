import java.io.*;
import java.math.*;
import java.util.*;
public class Main {
 
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String S = input.next();
		int N = S.length();
		int[] ans = new int[N];
		int curIndex = 0;
		while (curIndex < N) {
			int numLeft = 0;
			int numRight = 0;
			while (S.charAt(curIndex)=='R') {
				numRight++;
				curIndex++;
				if (curIndex==N) break;
			}
			//curIndex--; //After last ever L/R, curIndex is incremented which causes array 
			//out of bounds
			int R = curIndex-1;
			while (S.charAt(curIndex)=='L') {
				numLeft++;
				curIndex++;
				if (curIndex==N) break;
			}
			int left = numLeft;
			int right = numRight;
			if ((left+right)%2==0) { //Children cascade into adjacent numbers as close to 
				//each other as possible
				int sum = left+right;
				left=sum/2;
				right=sum/2;
			}else {
				int sum = left+right;
				if (right%2==1) { //The greater number is given to the R/L count with odd parity
					right=sum/2;
					left=sum-right;
				}else {
					left=sum/2;
					right=sum-left;
				}
			}
			ans[R]=left;
			ans[R+1]=right; //Children moving swaps squares 
			if (curIndex==N-1) break;
		}
		for (int i = 0; i < N; i++)
			System.out.print(ans[i]+" ");
	}
}