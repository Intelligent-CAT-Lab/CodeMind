<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
```
ref = list("AADINNUY")
aizu = "AIZUNYAN"
inp = raw_input()
if len(inp) < 8:
	print inp
else:
	ans = ""
	l = len(inp)
	i = 0
	while i < l:
		if i <= l - 8 and sorted(inp[i:i+8]) == ref:
			ans += aizu
			i += 8
		else:
			ans += inp[i]
			i += 1
	print ans
	
```

java code:<fim_suffix><fim_middle>
```
import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String ref = "AADINNUY";
		String aizu = "AIZUNYAN";
		String inp = sc.next();
		if(inp.length() < 8){
			System.out.println(inp);
		}else{
			String ans = "";
			int l = inp.length();
			int i = 0;
			while(i < l){
				if(i <= l - 8 && inp.substring(i, i+8).compareTo(ref) == 0){
					ans += aizu;
					i += 8;
				}else{
					ans += inp.charAt(i);
					i += 1;
				}
			}
			System.out.println(ans);
		}
	}
}
```
<|endoftext|>
