<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
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

java code:<fim_suffix><fim_middle>
```java
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] str = sc.nextLine().split(" ");
		int[] list = new int[str.length];
		for (int i = 0; i < list.length; i++) {
			list[i] = Integer.parseInt(str[i]);
		}
		int e = list[4];
		int f = list[5];

		// 1 2 10 20 15 200
		// 17 19 22 26 55 2802

		// xãåãå¾ãå¤
		int[] listx = new int[10000];
		int a = list[0];
		int b = list[1];

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
				if (x > 0 &&!isContain(listx, x)) {
					listx[listx.length - 1] = x;
				}
				j++;
			}
			i++;
		}

		// yãåãå¾ãå¤
		int[] listy = new int[10000];
		int c = list[2];
		int d = list[3];

		// yãæ°´ã«æº¶ãåããæå¤§å¤
		int f2 = f * e / (100.0 + e);

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
				if (y > 0 &&!isContain(listy, y)) {
					listy[listy.length - 1] = y;
				}
				j++;
			}
			i++;
		}

		// å¨ã¦ã®xã¨yã®çµã¿åããã«ã¤ãã¦fãè¶ããªãããããã³æº¶ãåããããèª¿ã¹ã
		int lengthx = listx.length;
		int lengthy = listy.length;

		int xy_max = 0;
		int y_max = 0;
		double noudo_max = 0;

		for (int i = 0; i < lengthx; i++) {
			for (int j = 0; j < lengthy; j++) {
				int x = listx[i];
				int y = listy[j];
				if (x + y > f) {
					continue;
				}
				if (1.0 * y * 100 / (x + y) <= e) {
					double noudo = 1.0 * y / (x + y);
					if (noudo >= noudo_max) {
						xy_max = x + y;
						y_max = y;
						noudo_max = noudo;
					}
				}
			}
		}

		String message = xy_max + " " + y_max;
		System.out.println(message);
	}

	public static boolean isContain(int[] list, int x) {
		for (int i = 0; i < list.length; i++) {
			if (list[i] == x) {
				return true;
			}
		}
		return false;
	}
}
```

'''
<|endoftext|>
