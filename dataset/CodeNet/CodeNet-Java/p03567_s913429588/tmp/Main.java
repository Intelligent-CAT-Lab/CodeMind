import java.util.*;


public class Main {
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
System.out.println("[INST]7;None;sc.hasNext();"+sc.hasNext());
			char [] c = sc.next().toCharArray();
System.out.println("[INST]8;c;sc.next().toCharArray();"+c);
System.out.println("[INST]8;None;sc.next();"+sc.next());
			boolean flg = false;
			for(int i = 0; i < c.length-1;i++){
				if(c[i] == 'A' && c[i+1] == 'C'){
					flg = true;
					break;
				}
			}

			System.out.println(flg ? "Yes" : "No");
		}
	}



	private void debug(Object... o) {
		System.out.println("debug = " + Arrays.deepToString(o));
	}

	public static void main(String[] args) {
		new Main().doit();
	}

}
