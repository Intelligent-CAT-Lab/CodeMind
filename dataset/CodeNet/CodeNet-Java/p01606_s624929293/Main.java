import java.util.*;

public class Main{
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int n = sc.nextInt();
			int w = sc.nextInt();
			
			int [] count = new int[n + 1];
			StringBuilder ans = new StringBuilder();
			for(int i = 1; i <= w; i++){
				for(int j = 1; j * j <= i; j++){
					if(i % j == 0){
						count[j]++;
						if(i / j != j){
							count[i / j]++;
						}
					}
				}
			}
			int nowcount = 0;
			for(int j = 0; j <= n; j++){
				if(count[j] >= 1){
					nowcount++;
				}
			}
			ans.append(" " + nowcount);
			
			for(int i = 1; i <= n - w; i++){
				for(int j = 1; j * j <= i; j++){
					if(i % j == 0){
						count[j]--;
						if(j == i){
							if(count[j] <= 1) nowcount--;
						}
						else{
							if(count[j] == 1)nowcount--;
						}
						if(i / j != j){
							count[i / j]--;
							if(j == 1){
								if(count[i / j] <= 1) nowcount--;
							}
							else{
								if(count[i / j] == 1) nowcount--;
							}
						}
					}
				}
				int num = i + w;
				for(int j = 1; j * j <= num; j++){
					if(num % j == 0){
						count[j]++;
						if(j <= i){
							if(count[j] == 2)nowcount++;
						}
						else{
							if(count[j] == 1)nowcount++;
						}
						if(num / j != j){
							count[num / j]++;
							if(num / j <= i){
								if(count[num / j] == 2)nowcount++;
							}
							else{
								if(count[num / j] == 1)nowcount++;
							}
						}
						
					}
				}
				ans.append(" " + nowcount);
			}
			System.out.println(ans.substring(1));
		}
	}

	private void debug(Object... o) {
		System.out.println("debug = " + Arrays.deepToString(o));
	}

	public static void main(String[] args) {
		new Main().doit();
	}
}