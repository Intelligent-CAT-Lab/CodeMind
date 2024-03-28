<s> [INST] Translate the following java code to python and enclose your solution inside ```python```:
```
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p01634 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";

		while ((line = br.readLine()) != null && !line.isEmpty()) {
			int c1, c2, c3;
			c1 = c2 = c3 = 0;
			if (line.length() < 6) {
				System.out.println("INVALID");
			} else {
				for (char c : line.toCharArray()) {
					if (c >= '0' && c <= '9') {
						c1++;
					} else if (c >= 'A' && c <= 'Z') {
						c2++;
					} else {
						c3++;
					}
				}
				if (c1 > 0 && c2 > 0 && c3 > 0) {
					System.out.println("VALID");
				} else {
					System.out.println("INVALID");
				}
			}
		}
	}
}
```
[/INST]
```python
import sys

def main():
    br = sys.stdin
    line = ""

    while (line = br.readline()) != None and not line.strip():
        c1, c2, c3 = 0, 0, 0
        if len(line) < 6:
            print("INVALID")
        else:
            for c in line:
                if c >= '0' and c <= '9':
                    c1 += 1
                elif c >= 'A' and c <= 'Z':
                    c2 += 1
                else:
                    c3 += 1
            if c1 > 0 and c2 > 0 and c3 > 0:
                print("VALID")
            else:
                print("INVALID")

if __name__ == "__main__":
    main()
```</s>
