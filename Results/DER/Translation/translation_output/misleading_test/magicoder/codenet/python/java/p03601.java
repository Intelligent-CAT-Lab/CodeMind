<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1 2 10 20 15 200

Expected output:
100 -86

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

@@ Response
Here is the Java version of the given Python code:

```java
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] list = input.split(" ");
        int[] intList = new int[list.length];
        for (int i = 0; i < list.length; i++) {
            intList[i] = Integer.parseInt(list[i]);
        }

        int e = intList[4];
        int f = intList[5];

        List<Integer> listx = new ArrayList<>();
        int a = intList[0];
        int b = intList[1];

        int i = 0;
        while (true) {
            if (i * a * 100 > f) {
                break;
            }
            int j = 0;
            while (true) {
                int x = i * a * 100 + j * b * 100;
                if (x > f) {
                    break;
                }
                if (x == 0) {
                    j++;
                    continue;
                }
                if (!listx.contains(x)) {
                    listx.add(x);
                }
                j++;
            }
            i++;
        }

        List<Integer> listy = new ArrayList<>();
        int c = intList[2];
        int d = intList[3];

        double f2 = f * e / (100.0 + e);

        i = 0;
        while (true) {
            if (i * c > f2) {
                break;
            }
            int j = 0;
            while (true) {
                int y = i * c + j * d;
                if (y > f2) {
                    break;
                }
                if (!listy.contains(y)) {
                    listy.add(y);
                }
                j++;
            }
            i++;
        }

        int lengthx = listx.size();
        int lengthy = listy.size();

        int xyMax = 0;
        int yMax = 0;
        double noudoMax = 0;

        for (int j = 0; j < lengthx; j++) {
            for (int k = 0; k < lengthy; k++) {
                int x = listx.get(j);
                int y = listy.get(k);
                if (x + y > f) {
                    continue;
                }
                if ((double) y * 100 / (x + y) <= e) {
                    double noudo = (double) y / (x + y);
                    if (noudo >= noudoMax) {
                        xyMax = x + y;
                        yMax = y;
                        noudoMax = noudo;
                    }
                }
            }
        }

        System.out.println(xyMax + " " + yMax);
    }
}
```

This Java code does the same thing as the Python code. It reads input from the user, splits it into an array of integers, and then performs the same operations as the Python code. The output is then printed to the console.<｜end▁of▁sentence｜>
