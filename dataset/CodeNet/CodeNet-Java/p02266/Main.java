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
		
		for (char c : profile.toCharArray()) {
			if (c == '\\') {
				lv--;
				stackDown.push(pos);
			} else if (c == '/') {
				lv++;
				if (!stackDown.empty()) {
					int start = stackDown.pop();
					int tempArea = pos - start;
					totalArea += tempArea;
					if (stackArea.empty()) {
						stackArea.push(tempArea);
						stackEdge.push(lv);
					} else {
						int lastArea = 0;
						while (!stackEdge.empty() && stackEdge.peek() < lv) {
							lastArea += stackArea.pop();
							stackEdge.pop();
						}
						stackArea.push(lastArea + tempArea);
						stackEdge.push(lv);
					}
				} else {
					if (!stackArea.empty()) {
						stackEdge.pop();
						stackEdge.push(lv);
					}
				}
			}
			pos++;
		}

		System.out.println(totalArea);
		System.out.print(stackArea.size());
		if (stackArea.size() != 0) {
			System.out.print(" ");
		}
		Iterator<Integer> itr = stackArea.iterator();
		while (itr.hasNext()) {
			System.out.print(itr.next());
			if (itr.hasNext()) {
				System.out.print(" ");
			}
		}
		System.out.println("");
	}
}

