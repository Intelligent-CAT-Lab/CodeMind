import java.util.Scanner;

public class p02534 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        p02534 m = new p02534(sc);
        m.show(m.solve());
        sc.close();
    }
    
    //ãã£ã¼ã«ã
    Scanner sc;
    int K;
    
    //å
¥å
    p02534(Scanner sc) {
        this.sc = sc;
        this.K = sc.nextInt();
    }
    
    //è§£ç­å¦ç
    private String solve() {
        String answer = "";
        for (int i = 0; i < K; i++) {
            answer += "ACL";
        }
        
        return answer;
    }
    
    //åºå
    public void show(String answer) {
        System.out.println(answer);
    }
}