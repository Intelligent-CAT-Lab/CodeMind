import java.util.*;


public class Main {
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
var newVariable_0 = sc.hasNext();		while(newVariable_0){
var newVariable_1 = sc.next();			char [] c = newVariable_1.toCharArray();
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
