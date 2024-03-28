<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
```
# coding:utf-8

input=raw_input()
list=input.split(" ")
for i in range(len(list)):
    list[i]=int(list[i])

e=list[4]
f=list[5]

# 1 2 10 20 15 200
# 17 19 22 26 55 2802

# xãåãå¾ãå¤
listx=[]
a=list[0]
b=list[1]

i=0
while True:
   if i*a*100>f:
       break
   j=0
   while True:
      x=i*a*100+j*b*100
      if x>f:
          break;
      if x==0:
          j+=1
          continue;
      if x not in listx:
          listx.append(int(x))
      j+=1 
   i+=1 

# yãåãå¾ãå¤
listy=[]
c=list[2]
d=list[3]

# yãæ°´ã«æº¶ãåããæå¤§å¤
f2=f*e/(100.0+e)

i=0
while True:
   if i*c>f2:
       break
   j=0
   while True:
      y=i*c+j*d
      if y>f2:
          break;
      if y not in listy:
          listy.append(int(y))
      j+=1 
   i+=1 

# å¨ã¦ã®xã¨yã®çµã¿åããã«ã¤ãã¦fãè¶ããªãããããã³æº¶ãåããããèª¿ã¹ã
lengthx=len(listx)
lengthy=len(listy)

xy_max=0
y_max=0
noudo_max=0

for i in range(lengthx):
    for j in range(lengthy):
        x=listx[i]
        y=listy[j]
        if x+y>f:
            continue
        if float(y)*100/float(x)<=e:
            noudo=float(y)/(x+y)
            if noudo>=noudo_max:
                xy_max=x+y
                y_max=y
                noudo_max=noudo

message=str(xy_max)+" "+str(y_max)
print message

```
[/INST]
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] list = input.split(" ");
        int[] listInt = new int[list.length];
        for (int i = 0; i < list.length; i++) {
            listInt[i] = Integer.parseInt(list[i]);
        }
        int e = listInt[4];
        int f = listInt[5];
        int x = 0, y = 0, noudo = 0, xy_max = 0, y_max = 0;
        List<Integer> listx = new ArrayList<>();
        List<Integer> listy = new ArrayList<>();
        while (true) {
            for (int i = 0; i < listInt.length; i++) {
                if (i == 0) {
                    a = listInt[i];
                } else if (i == 1) {
                    b = listInt[i];
                } else if (i == 2) {
                    c = listInt[i];
                } else if (i == 3) {
                    d = listInt[i];
                } else if (i == 4) {
                    e = listInt[i];
                } else if (i == 5) {
                    f = listInt[i];
                }
            }
            x = a * 100;
            y = b * 100;
            while (true) {
                int z = x + y;
                if (z > f) {
                    break;
                }
                if (z == 0) {
                    continue;
                }
                if (!listx.contains(z)) {
                    listx.add(z);
                }
                x += 100;
            }
            while (true) {
                int z = x + y;
                if (z > f) {
                    break;
                }
                if (z == 0) {
                    continue;
                }
                if (!listy.contains(z)) {
                    listy.add(z);
                }
                y += 100;
            }
            if (listx.size() > listy.size()) {
                xy_max = x + y;
                y_max = y;
            } else {
                xy_max = x + y;
                y_max = x;
            }
            noudo = (float) y / (x + y);
            if (noudo > noudo_max) {
                xy_max = x + y;
                y_max = y;
                noudo_max = noudo;
            }
            System.out.println(xy_max + " " + y_max);
        }
    }
}
```</s>
