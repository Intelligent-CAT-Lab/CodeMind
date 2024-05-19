System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
7 6 -1 1 -1 9 2 3 4

Expected output:
94

```
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Integer.parseInt;

/**
 * Alphametic
 */
public class p00322 {

	static int[][] nums;
	static boolean[] used;

	static int[][] layout = {
			{0, 2},
			{1, 1}, {1, 2},
			{2, 0}, {2, 1}, {2, 2},
			{3, 0}, {3, 1}, {3, 2},
	};

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] words;

		words = br.readLine().split(" ");

		nums = new int[4][3];
		used = new boolean[10];
		int count = 0;

		for (int i = 0; i < words.length; i++) {
			int n = parseInt(words[i]);
			if (n!= -1) used[n] = true;
			else count++;
			nums[layout[i][0]][layout[i][1]] = n;
		}

		System.out.println(solve(count));
	}

	static int solve(int c) {

		if (c == 0) {
			if (check()) return 1;
			else return 0;
		}

		//
		int ret = 0;

		outer:
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 3; j++) {
				if (nums[i][j] == -1) {
					for (int k = 1; k <= 9; k++) {
						if (!used[k]) {
							nums[i][j] = k;
							used[k] = true;
							ret += solve(c - 1);
							nums[i][j] = -1;
							used[k] = false;
						}
					}
					break outer;
				}
			}
		}

		return ret;
	}

	static boolean check() {
		
		int[] a = new int[4];
		
		for (int i = 0; i < 4; i++) {
			a[i] = nums[i][0] * 100 + nums[i][1] * 10 + nums[i][2];
		}
		
		return a[0] + a[1] + a[2] == a[3];
	}
}
```


Answer:
```python
import itertools

def alphametic(nums):
    nums = [int(n) for n in nums]
    used = [False] * 10
    count = nums.count(-1)

    def solve(c):
        if c == 0:
            if check(nums):
                return 1
            else:
                return 0
        ret = 0
        for i in range(4):
            for j in range(3):
                if nums[i * 3 + j] == -1:
                    for k in range(1, 10):
                        if not used[k]:
                            nums[i * 3 + j] = k
                            used[k] = True
                            ret += solve(c - 1)
                            nums[i * 3 + j] = -1
                            used[k] = False
                    break
        return ret

    def check(nums):
        a = [nums[0] * 100 + nums[1] * 10 + nums[2],
             nums[3] * 100 + nums[4] * 10 + nums[5],
             nums[6] * 100 + nums[7] * 10 + nums[8],
             nums[9] * 100 + nums[10] * 10 + nums[11]]
        return a[0] + a[1] + a[2] == a[3]

    return solve(count)

nums = [7, 6, -1, 1, -1, 9, 2, 3, 4]
print(alphametic(nums))
```<|endoftext|>
