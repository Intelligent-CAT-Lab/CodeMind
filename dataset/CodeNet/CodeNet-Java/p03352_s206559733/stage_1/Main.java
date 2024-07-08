//2019/3/14
import java.util.Arrays;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int X = sc.nextInt();

		int a = 1;

		int i = 2;

		int[] array;

		if(X==1 || X==2 || X==3) {

			System.out.println(1);

		}else {

			array = new int[1000];

			Arrays.fill(array, 0);

			int index = 0;

			while(true) {

				a = i*i;

				if(a>X) break;

				for(int j=a;j<=X;j*=i) {

					array[index] = j;

					index++;
				}

				i++;
			}

			Arrays.parallelSort(array);

			int ans = array[999];

			System.out.println(ans);
		}
	}
}
