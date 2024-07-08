import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	public static final int BIG_NUM = 2000000000;
	public static final int MOD = 1000000007;
	public static final long HUGE_NUM = 99999999999999999L;
	public static final double EPS = 0.000000001;

	public static final int SIZE = 1005;
	public static long dp[][];

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {

		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner scanner = new Scanner(System.in);

		dp = new long[SIZE][SIZE];

		for(int i = 0; i < SIZE; i++){
			for(int k = 0; k < SIZE; k++){

				dp[i][k] = -1;
			}
		}

		int num_ball = scanner.nextInt();
		int num_box = scanner.nextInt();

		System.out.println(recursive(num_ball,num_box));
    }

	public static long recursive(int num_ball,int num_box){

		if(dp[num_ball][num_box] != -1){

			return dp[num_ball][num_box];
		}

		if(num_ball == 0){

			return 1;
		}else if(num_box == 1){

			return 1;
		}

		long ret = 0;

		for(int next_box = 1; next_box <= num_box; next_box++){
			int next_ball = num_ball-next_box;
			if(next_ball < 0)break;

			ret += recursive(next_ball,next_box);
			ret %= MOD;
		}

		return dp[num_ball][num_box] = ret;
	}
}

class UTIL{

	//最大公約数
	public static long gcd(long x,long y){

		x = Math.abs(x);
		y = Math.abs(y);

		if(x < y){

			long tmp = y;
			y = x;
			x = tmp;
		}

		if(y == 0){

			return x;
		}else{

			return gcd(y,x%y);
		}
	}

	//最小公倍数
	public static long lcm(long x,long y){

		return (x*y)/gcd(x,y);
	}

	//String→intへ変換
    public static int getNUM(String tmp_str){

var newVariable_0 = Integer.parseInt(tmp_str);        return newVariable_0;
    }

    //文字が半角数字か判定する関数
    public static boolean isNumber(String tmp_str){

var newVariable_1 = tmp_str.length();        if(tmp_str == null || newVariable_1 == 0){

            return false;
        }

        Pattern pattern = Pattern.compile("\\A[0-9]+\\z");
        Matcher matcher = pattern.matcher(tmp_str);
var newVariable_2 = matcher.matches();        return newVariable_2;
    }
}
