
```
import sys

def solve():
    one = nextIntArray()
    N = one[0]
    d = one[1]
    if N <= 2:
        myout(0)
        return
    N -= 3
    loop = N // 11
    amari = N % 11
    map = [[1,1,1,2,2,3,4,4,5,5,5], [0,1,2,2,3,3,3,4,4,4,5], [1,1,1,2,2,2,3,3,4,5,5],
                    [0,0,1,1,2,3,3,4,4,4,5], [1,2,2,3,3,3,4,4,4,5,5], [0,0,1,1,1,2,2,3,4,4,5],
                    [0,1,1,2,3,3,4,4,4,5,5], [1,1,2,2,2,3,3,3,4,4,5], [0,1,1,1,2,2,3,4,4,5,5],
                    [1,1,2,3,3,4,4,4,5,5,5], [0,1,1,1,2,2,2,3,3,4,5]]
    myout(loop * 5 + map[d][amari])

#Method addition frame start

#Method addition frame end

#Don't have to see. start------------------------------------------
ii = sys.stdin.readlines()
index = 0
max = len(ii)
def hasNext():
    return index < max
def next():
    global index
    if hasNext():
        ret = ii[index]
        index += 1
        return ret
    else:
        raise IndexError("There is no more input")
def nextInt():
    return int(next())
def nextLong():
    return long(next())
def nextDouble():
    return float(next())
def nextStrArray():
    return myconv(next(), 8)
def nextCharArray():
    return myconv(next(), 0)
def nextIntArray():
    input = nextStrArray()
    ret = []
    for i in range(len(input)):
        ret.append(int(input[i]))
    return ret
def nextLongArray():
    input = nextStrArray()
    ret = []
    for i in range(len(input)):
        ret.append(long(input[i]))
    return ret
def myconv(list, no):#only split
    splitString = CONVSTR[no]
    return list.split(splitString)
CONVSTR = {8: " ", 9: "\n", 0: ""}
def myout(t):
    print(t)
def flush():
    sys.stdout.flush()
solve()
flush()
#Don't have to see. end------------------------------------------
```

## 03930

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*; import java.io.*; import java.math.*;
public class p03930{
    static void solve(){//Here is the main function
      ArrayList<Integer> one = nextIntArray();
      int N = one.get(0);
      int M = one.get(1);
      int[] a = nextIntArray();
      int[] b = nextIntArray();
      int[] c = nextIntArray();
      int[] d = nextIntArray();
      int[] e = nextIntArray();
      int[] f = nextIntArray();
      int[] g = nextIntArray();
      int[] h = nextIntArray();
