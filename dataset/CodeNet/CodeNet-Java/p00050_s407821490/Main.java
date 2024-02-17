import java.util.*;

public class Main {
    public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	while(s.hasNext()) {
	    String t = s.nextLine();
	    t = t.replace("apple", "\n");
	    t = t.replace("peach", "apple");
	    t = t.replace("\n", "peach");
	    System.out.println(t);
	}
    }
}