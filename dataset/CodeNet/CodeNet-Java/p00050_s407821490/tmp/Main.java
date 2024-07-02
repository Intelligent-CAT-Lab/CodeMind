import java.util.*;

public class Main {
    public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	while(s.hasNext()) {
System.out.println("[INST]5;None;s.hasNext();"+s.hasNext());
	    String t = s.nextLine();
System.out.println("[INST]6;t;s.nextLine();"+t);
	    t = t.replace("apple", "\n");
System.out.println("[INST]7;t;t.replace('apple', '\n');"+t);
	    t = t.replace("peach", "apple");
System.out.println("[INST]8;t;t.replace('peach', 'apple');"+t);
	    t = t.replace("\n", "peach");
System.out.println("[INST]9;t;t.replace('\n', 'peach');"+t);
	    System.out.println(t);
	}
    }
}