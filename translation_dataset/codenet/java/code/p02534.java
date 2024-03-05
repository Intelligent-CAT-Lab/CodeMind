import java.util.Scanner;

public class p02534 {
	public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        p02534 m = new p02534(sc);
        m.show(m.solve());
        sc.close();
    }
    
	//フィールド
    Scanner sc;
    int K;;
    
    //入力
    p02534(Scanner sc) {
        this.sc = sc;
        this.K = sc.nextInt();
    }
    
    //解答処理
    private String solve() {
        String answer = "";
        for (int i = 0; i < K; i++) {
        	answer += "ACL";
        }
        
        return answer;
    }
    
    //出力
    public void show(String answer) {
        System.out.println(answer);
    }

}
