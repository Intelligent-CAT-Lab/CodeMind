import java.util.*;

public class Main{

    public static void main(String args[]){

        // スキャナーの宣言
        Scanner sc = new Scanner(System.in);
        // 整数の入力
		int r = sc.nextInt();
        // スペース区切りの整数の入力
        int g = sc.nextInt();
        int b = sc.nextInt();
        int n = sc.nextInt();
        int ans = 0;
        //for文
        for(int i = 0; i < n / r + 1; i++){
            for(int j = 0; j < (n - (i * r)) / g + 1; j++){
                if((n - (i * r + j * g)) % b == 0){
                    ans++;
                }
                /*for(int k = 0; k < (n - (i * r + j * g)) / b + 1; k++){
                    if(i * r + j * g + k * b == n){
                        ans++;
                        break;
                    }
                }*/
            }
        }
        // 出力
        System.out.println(ans);

    }

}