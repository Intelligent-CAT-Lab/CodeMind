Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
```


import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class p03605 {

	public static void main(String[] args) throws IOException {

		Scanner scan = new Scanner(System.in);

		int N = scan.nextInt();

		int amari = N % 10;
		int sho = N / 10;

		if (amari == 9) {
			System.out.println("Yes");
		} else if (sho == 9) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

	//***********************ä»¥ä¸å±éé¢æ°************************************************
	/**
	 * æå­åãåè»¢ãã¦è¿ã
	 * @param pStr æå­å
	 * @return åè»¢ããæå­å
	 */
	public static String myReverse(String pStr) {
		if (pStr.length() < 1) {
			return "";
		}

		StringBuffer sb = new StringBuffer(pStr);
		return sb.reverse().toString();
	}

	/**
	 * ä½ããæ±ããã
	 * @param a
	 * @param b
	 * @return ä½ããä½ãããã¤ãã¹ã®æã¯ãã©ã¹ã§è¿ãã
	 */
	public static long myMod(long a, long b) {
		long ret = 0;

		ret = a % b;

		if (ret < 0) {
			ret += b;
		}

		return ret;
	}

	/**
	 * ä¹æ°ãæ±ãã â»modå¯¾å¿
	 * @param kisu åºæ°
	 * @param josu ä¹æ°
	 * @param primeNumMod_0 æ³ modå¤ ä½¿ããªãå ´åã¯ã0ã
	 * @return
	 */
	public static long myPowWithMod(long kisu, long josu, long primeNumMod_0) {

		long ans = 1;

		//ä¹æ°ã0ã®å ´åâ1
		if (josu == 0)
			return 1;

		if (primeNumMod_0 == 0) {
			//modãä½¿ããªãã¨ã

			while (josu > 0) {

				if (josu % 2 == 0) {
					//ç´¯ä¹ãå¶æ°ã®æ

					kisu *= kisu;
					josu = josu / 2;
				} else {
					//ç´¯ä¹ãå¥æ°ã®æ
					ans *= kisu;
					josu--;
				}
			}

			return ans;

		} else {
			//modãä½¿ãã¨ã

			//åãã«æ¡ãè½ã¨ã
			kisu = myMod(kisu, primeNumMod_0);

			while (josu > 0) {

				if (josu % 2 == 0) {
					//ç´¯ä¹ãå¶æ°ã®æ

					kisu *= myMod(kisu, primeNumMod_0);
					josu = josu / 2;

				} else {
					//ç´¯ä¹ãå¥æ°ã®æ
					ans *= myMod(kisu, primeNumMod_0);
					josu--;

				}
			}

			return myMod(ans, primeNumMod_0);

		}

	}

}

```

### Response:
```python
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class p03605 {

	public static void main(String[] args) throws IOException {

		Scanner scan = new Scanner(System.in);

		int N = scan.nextInt();

		int amari = N % 10;
		int sho = N / 10;

		if (amari == 9) {
			System.out.println("Yes");
		} else if (sho == 9) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

	//***********************ä»¥ä¸å±éé¢æ°************************************************
	/**
	 * æå­åãåè»¢ãã¦è¿ã
	 * @param pStr æå­å
	 * @return åè»¢ããæå­å
	 */
	public static String myReverse(String pStr) {
		if (pStr.length() < 1) {
			return "";
		}

		StringBuffer sb = new StringBuffer(pStr);
		return sb.reverse().toString();
	}

	/**
	 * ä½ããæ±ããã
	 * @param a
	 * @param b
	 * @return ä½ããä½ãããã¤ãã¹ã®æã¯ãã©ã¹ã§è¿ãã
	 */
	public static long myMod(long a, long b) {
		long ret = 0;

		ret = a % b;

		if (ret < 0) {
			ret += b;
		}

		return ret;
	}

	/**
	 * ä¹æ°ãæ±ãã â»modå¯¾å¿
	 * @param kisu åºæ°
	 * @param josu ä¹æ°
	 * @param primeNumMod_0 æ³ modå¤ ä½¿ã
