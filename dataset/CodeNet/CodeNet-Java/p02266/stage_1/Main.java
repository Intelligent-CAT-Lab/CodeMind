import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.Stack;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));		
		String profile = reader.readLine();
		
		Stack<Integer> stackDown = new Stack<Integer>();
		Stack<Integer> stackArea = new Stack<Integer>();
		Stack<Integer> stackEdge = new Stack<Integer>();
		int totalArea = 0;
		int pos = 0;
		int lv = 0;
		
var newVariable_0 = profile.toCharArray();		for (char c : newVariable_0) {
			if (c == '\\') {
				lv--;
var newVariable_1 = stackDown.push(pos);			} else if (c == '/') {
				lv++;
var newVariable_2 = stackDown.empty();				if (!newVariable_2) {
					int start = stackDown.pop();
					int tempArea = pos - start;
					totalArea += tempArea;
var newVariable_3 = stackArea.empty();					if (newVariable_3) {
var newVariable_4 = stackArea.push(tempArea);var newVariable_5 = stackEdge.push(lv);					} else {
						int lastArea = 0;
var newVariable_6 = stackEdge.empty();var newVariable_7 = stackEdge.peek();						while (!stackEdge.empty() && newVariable_7 < lv) {
							lastArea += stackArea.pop();
var newVariable_8 = stackEdge.pop();						}
var newVariable_9 = stackArea.push(lastArea + tempArea);var newVariable_10 = stackEdge.push(lv);					}
				} else {
var newVariable_11 = stackArea.empty();					if (!newVariable_11) {
var newVariable_12 = stackEdge.pop();var newVariable_13 = stackEdge.push(lv);					}
				}
			}
			pos++;
		}

		System.out.println(totalArea);
		System.out.print(stackArea.size());
var newVariable_14 = stackArea.size();		if (newVariable_14 != 0) {
			System.out.print(" ");
		}
		Iterator<Integer> itr = stackArea.iterator();
var newVariable_15 = itr.hasNext();		while (newVariable_15) {
			System.out.print(itr.next());
var newVariable_16 = itr.hasNext();			if (newVariable_16) {
				System.out.print(" ");
			}
		}
		System.out.println("");
	}
}

