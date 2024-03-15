<s> [INST] Translate the following java code to python and enclose your solution inside ```python```:
```
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p02116{
	public static void main(String[] args) {

		BufferedReader bfr=new BufferedReader(new InputStreamReader(System.in));
		String str="";

		try {
			str=bfr.readLine();
			long res=0;
			long han=0;
			long ni_beki=1;
			int ruijyo=0;

			if(str=="") {
				System.exit(0);
			}

			else {
				res=Long.parseLong(str);

				for(int i=0; i<1;) {
					han=(res>>ruijyo)%2;
					if(han==0) {
						res=(res%ni_beki)+1;
						i=1;
						break;
					}
					else {
						ni_beki=ni_beki*2;
						ruijyo++;
					}
				}
				System.out.println(res);
			}
		} catch (IOException e) {
			// TODO èªåçæããã catch ãã­ãã¯
			e.printStackTrace();
		}

	}

}

```
[/INST]
```python
import sys

def p02116():
    try:
        str = input()
        res = int(str)

        han = 0
        ni_beki = 1
        ruijyo = 0

        if str == "":
            sys.exit(0)

        else:
            for i in range(1):
                han = (res >> ruijyo) % 2
                if han == 0:
                    res = (res % ni_beki) + 1
                    i = 1
                    break
                else:
                    ni_beki = ni_beki * 2
                    ruijyo += 1

            print(res)

    except ValueError:
        print("Invalid input")

if __name__ == "__main__":
    p02116()
```</s>
