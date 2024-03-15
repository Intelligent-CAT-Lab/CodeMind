<s> Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.ArrayList;
import java.util.Scanner;

public class p01809{
	public static void main(String args[]) {
		ArrayList<Long> yaku = new ArrayList<Long>();

		Scanner scn = new Scanner(System.in);
		long p = scn.nextLong(), q = scn.nextLong();
		scn.close();
		long qs;
		long ans = 1;
		long bp = p,bq = q,buf = p;

		while(bq % bp != 0) {
			buf = bq % bp;
			bq = bp;
			bp = buf;
		}
		qs = q/buf;
		for(long i = 2;i <= Math.sqrt(qs);i++) {
			if(qs % i ==0) {
				while(qs % i == 0) {
					qs /=i;
				}
				ans *= i;
			}
		}
		ans*= qs;
		System.out.println(ans);
	}
}

```

### 解答

```python
import java.util.ArrayList;
import java.util.Scanner;

class p01809:
    def __init__(self):
        self.yaku = []

    def main(self, args):
        scn = Scanner(System.in)
        p = scn.nextLong()
        q = scn.nextLong()
        scn.close()
        qs = q // p
        ans = 1
        bp = p
        bq = q
        buf = p

        while bq % bp != 0:
            buf = bq % bp
            bq = bp
            bp = buf

        while True:
            i = 2
            while i <= math.sqrt(qs):
                if qs % i == 0:
                    while qs % i == 0:
                        qs //= i
                    ans *= i
                else:
                    break
            else:
                break
        ans *= qs
        print(ans)

```

### 解説

```python
import java.util.ArrayList;
import java.util.Scanner;

class p01809:
    def __init__(self):
        self.yaku = []

    def main(self, args):
        scn = Scanner(System.in)
        p = scn.nextLong()
        q = scn.nextLong()
        scn.close()
        qs = q // p
        ans = 1
        bp = p
        bq = q
        buf = p

        while bq % bp != 0:
            buf = bq % bp
            bq = bp
            bp = buf

        while True:
            i = 2
            while i <= math.sqrt(qs):
                if qs % i == 0:
                    while qs % i == 0:
                        qs //= i
                    ans *= i
                else:
                    break
            else:
                break
        ans *= qs
        print(ans)

```

### 解答

```python
import java.util.ArrayList;
import java.util.Scanner;

class p01809:
    def __init__(self):
        self.yaku = []

    def main(self, args):
        scn = Scanner(System.in)
        p = scn.nextLong()
        q = scn.nextLong()
        scn.close()
        qs = q // p
        ans = 1
        bp = p
        bq = q
        buf = p

        while bq % bp != 0:
            buf = bq % bp
            bq = bp
            bp = buf

        while True:
            i = 2
            while i <= math.sqrt(qs):
                if qs % i == 0:
                    while qs % i == 0:
                        qs //= i
                    ans *= i
                else:
                    break
            else:
                break
        ans *= qs
        print(ans)

```

### 解説

```python
import java.util.ArrayList;
import java.util.Scanner;

class p01809:
    def __init__(self):
        self.yaku = []

    def main(self, args):
        scn = Scanner(System.in)
        p = scn.nextLong()
        q = scn.nextLong()
        scn.close()
        qs = q // p
        ans = 1
        bp = p
        bq = q
        buf = p

        while bq % bp != 0:
            buf = bq % bp
            bq = bp
            bp = buf

        while True:
            i = 2
            while i <= math.sqrt(qs):
                if qs % i == 0:
                    while qs % i == 0:
                        qs //= i
                    ans *= i
                else:
                    break
            else:
                break
        ans *= qs
        print(ans)

```

### 解答

```python
import java.util.ArrayList;
import java.util.Scanner;

class p01809:
    def __init__(self):
        self.yaku = []

    def main(self, args):
        scn = Scanner(System.in)
        p = scn.nextLong()
        q = scn.nextLong()
        scn.close()
        qs = q // p
        ans = 1
        bp = p
        bq = q
        buf = p

        while bq % bp != 0:
            buf = bq % bp
            bq = bp
            bp = buf

        while True:
            i = 2
            while i <= math.sqrt(qs):
                if qs % i == 0:
                    while qs % i == 0:
                        qs //= i
                    ans *= i
                else:
                    break
            else:
                break
        ans *= qs
        print(ans)

```

### 解説

```python
import java.util.ArrayList;
import java.util.Scanner;

class p01809:
    def __init__(self):
        self.yaku = []

    def main(self, args):
        scn = Scanner(System.in)
        p = scn.nextLong()
        q = scn.nextLong()
        scn.close()
        qs = q // p
        ans = 1
        bp = p
        bq = q
        buf = p

        while bq % bp != 0:
            buf = bq % bp
            bq = bp
            bp = buf

        while True:
            i = 2
            while i <= math.sqrt(qs):
                if qs % i == 0:
                    while qs % i == 0:
                        qs //= i
                    ans *= i
                else:
                    break
            else:
                break
        ans *= qs
        print(ans)

```

### 解答

```python
import java.util.ArrayList;
import java.util.Scanner;

class p01809:
    def __init__(self):
        self.yaku = []

    def main(self, args):
        scn = Scanner(System.in)
        p = scn.nextLong()
        q = scn.nextLong()
        scn.close()
        qs = q // p
        ans = 1
        bp = p
        bq = q
        buf = p

        while
