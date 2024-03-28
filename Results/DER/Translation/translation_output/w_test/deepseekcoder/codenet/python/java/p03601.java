<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1 2 10 20 15 200

Expected output:
110 10


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

### Response:
Here is the Java version of your Python code:

```java
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int[] numbers = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            numbers[i] = Integer.parseInt(input[i]);
        }

        int e = numbers[4];
        int f = numbers[5];

        List<Integer> listX = new ArrayList<>();
        int a = numbers[0];
        int b = numbers[1];
        for (int i = 0; ; i++) {
            if (i * a * 100 > f) {
                break;
            }
            for (int j = 0; ; j++) {
                int x = i * a * 100 + j * b * 100;
                if (x > f) {
                    break;
                }
                if (!listX.contains(x) && x != 0) {
                    listX.add(x);
                }
            }
        }

        List<Integer> listY = new ArrayList<>();
        int c = numbers[2];
        int d = numbers[3];
        double f2 = f * e / (100.0 + e);
        for (int i = 0; ; i++) {
            if (i * c > f2) {
                break;
            }
            for (int j = 0; ; j++) {
                int y = i * c + j * d;
                if (y > f2) {
                    break;
                }
                if (!listY.contains(y)) {
                    listY.add(y);
                }
            }
        }

        int xyMax = 0;
        int yMax = 0;
        double noudoMax = 0;
        for (int x : listX) {
            for (int y : listY) {
                if (x + y > f) {
                    continue;
                }
                double noudo = (double) y / (x + y);
                if (noudo >= noudoMax && (double) y * 100 / x <= e) {
                    xyMax = x + y;
                    yMax = y;
                    noudoMax = noudo;
                }
            }
        }

        System.out.println(xyMax + " " + yMax);
    }
}
```

This Java code does the same thing as your Python code. It reads numbers from the standard input, calculates the values of x and y, and then finds the maximum value of x + y that satisfies the conditions. The result is printed to the standard output.
<|EOT|>
