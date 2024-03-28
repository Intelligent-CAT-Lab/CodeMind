
```python
x,y=map(int,input().split())
if x%y==0:
    print(-1)
else:
    print(x)
```


```

python code:
```python
n=int(input())
a=list(map(int,input().split()))
a.sort()
print(a[n-1])
```
/p03438.md
# p03438

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
5
1 2 3 4 5

Expected output:
5

```
/*
String[]ã®åæåãæ´æ°ã®åãlongã«ãªã£ã¦ããã
é¢æ°ï¼splitã¨ãcontainsã¨ãï¼åã§ã¯"+"ã¨ãã¯æ­£è¦è¡¨ç¾ã¨ãªãããã®ã§"\\+"ã¨ãã
éåã®ã³ãã¼ã¯arr1=arr.clone()
HashSet<>[]ã¯ãã®ãã®åæåããï¼ï¼ï¼ï¼ï¼
è² ã®æ°ã®å²ãç®ã¯çµ¶å¯¾å¤ãå°ããã»ãã«åãæ¨ã¦ãããex.-1/2=0ã®ã§ãããå¤>kã¿ãããªå¼ã ã¨ãã°ãããããã®ã§æ³¨æ
ããå¤>=kã¨ãã¦ãåãä¸ããå¤ãã¨ãã¹ã
toLowerCase()ã¯ã¢ã«ãã¡ãããä»¥å¤ã«å¯¾ãã¦è¡ã£ã¦ãã¨ã©ã¼ã«ã¯ãªããªã
 */
//å¥åçµäºâCtrl+D
import java.
