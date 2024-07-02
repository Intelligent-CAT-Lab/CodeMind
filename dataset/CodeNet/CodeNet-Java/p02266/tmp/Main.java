import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.Stack;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));		
		String profile = reader.readLine();
System.out.println("[INST]11;profile;reader.readLine();"+profile);
		
		Stack<Integer> stackDown = new Stack<Integer>();
		Stack<Integer> stackArea = new Stack<Integer>();
		Stack<Integer> stackEdge = new Stack<Integer>();
		int totalArea = 0;
		int pos = 0;
		int lv = 0;
		
		for (char c : profile.toCharArray()) {
System.out.println("[INST]20;None;profile.toCharArray();"+profile.toCharArray());
			if (c == '\\') {
				lv--;
				stackDown.push(pos);
System.out.println("[INST]23;None;stackDown.push(pos);"+stackDown.push(pos));
			} else if (c == '/') {
				lv++;
				if (!stackDown.empty()) {
System.out.println("[INST]26;None;stackDown.empty();"+stackDown.empty());
					int start = stackDown.pop();
System.out.println("[INST]27;start;stackDown.pop();"+start);
					int tempArea = pos - start;
					totalArea += tempArea;
					if (stackArea.empty()) {
System.out.println("[INST]30;None;stackArea.empty();"+stackArea.empty());
						stackArea.push(tempArea);
System.out.println("[INST]31;None;stackArea.push(tempArea);"+stackArea.push(tempArea));
						stackEdge.push(lv);
System.out.println("[INST]32;None;stackEdge.push(lv);"+stackEdge.push(lv));
					} else {
						int lastArea = 0;
						while (!stackEdge.empty() && stackEdge.peek() < lv) {
System.out.println("[INST]35;None;stackEdge.empty();"+stackEdge.empty());
System.out.println("[INST]35;None;stackEdge.peek();"+stackEdge.peek());
							lastArea += stackArea.pop();
System.out.println("[INST]36;lastArea;stackArea.pop();"+lastArea);
							stackEdge.pop();
System.out.println("[INST]37;None;stackEdge.pop();"+stackEdge.pop());
						}
						stackArea.push(lastArea + tempArea);
System.out.println("[INST]39;None;stackArea.push(lastArea + tempArea);"+stackArea.push(lastArea + tempArea));
						stackEdge.push(lv);
System.out.println("[INST]40;None;stackEdge.push(lv);"+stackEdge.push(lv));
					}
				} else {
					if (!stackArea.empty()) {
System.out.println("[INST]43;None;stackArea.empty();"+stackArea.empty());
						stackEdge.pop();
System.out.println("[INST]44;None;stackEdge.pop();"+stackEdge.pop());
						stackEdge.push(lv);
System.out.println("[INST]45;None;stackEdge.push(lv);"+stackEdge.push(lv));
					}
				}
			}
			pos++;
		}

		System.out.println(totalArea);
		System.out.print(stackArea.size());
		if (stackArea.size() != 0) {
System.out.println("[INST]54;None;stackArea.size();"+stackArea.size());
			System.out.print(" ");
		}
		Iterator<Integer> itr = stackArea.iterator();
System.out.println("[INST]57;itr;stackArea.iterator();"+itr);
		while (itr.hasNext()) {
System.out.println("[INST]58;None;itr.hasNext();"+itr.hasNext());
			System.out.print(itr.next());
			if (itr.hasNext()) {
System.out.println("[INST]60;None;itr.hasNext();"+itr.hasNext());
				System.out.print(" ");
			}
		}
		System.out.println("");
	}
}

