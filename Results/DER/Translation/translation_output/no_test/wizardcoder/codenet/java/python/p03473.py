Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class p03473 {
	static int[] MASK = { 1, 2, 4 };

	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		int M = Integer.parseInt(in.readLine());
		int result = (24- M) + 24;
		System.out.println(result);
	}
}

```

### Response:
```python
import java.util.*;
import java.io.*;
import java.nio.charset.StandardCharsets;

class p03473:
    MASK = [1, 2, 4]

    def main(self):
        reader = InputStreamReader(System.in, StandardCharsets.UTF_8)
        in = BufferedReader(reader)
        M = int(in.readLine())
        result = (24 - M) + 24
        print(result)

p03473().main()
```<|endoftext|>
