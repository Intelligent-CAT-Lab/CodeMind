<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
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
		String input = sc.nextLine();
		String[] list = input.split(" ");
		for (int i = 0; i < list.length; i++) {
			list[i] = Integer.toString(Integer.parseInt(list[i]));
		}

		int e = Integer.parseInt(list[4]);
		int f = Integer.parseInt(list[5]);

		// 1 2 10 20 15 200
		// 17 19 22 26 55 2802

		// xãåãå¾ãå¤
		int[] listx = new int[10000];
		int a = Integer.parseInt(list[0]);
		int b = Integer.parseInt(list[1]);

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
				if (x > 0 && x < 10000 && listx[x] == 0) {
					listx[x] = 1;
				}
				j++;
			}
			i++;
		}

		// yãåãå¾ãå¤
		int[] listy = new int[10000];
		int c = Integer.parseInt(list[2]);
		int d = Integer.parseInt(list[3]);

		// yãæ°´ã«æº¶ãåããæå¤§å¤
		int f2 = f * e / (100 + e);

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
				if (y > 0 && y < 10000 && listy[y] == 0) {
					listy[y] = 1;
				}
				j++;
			}
			i++;
		}

		// å¨ã¦ã®xã¨yã®çµã¿åããã«ã¤ãã¦fãè¶ããªãããããã³æº¶ãåããããèª¿ã¹ã
		int lengthx = 0;
		int lengthy = 0;
		int xy_max = 0;
		int y_max = 0;
		double noudo_max = 0;

		for (int i = 0; i < 10000; i++) {
			if (listx[i] == 1) {
				lengthx++;
			}
		}
		for (int i = 0; i < 10000; i++) {
			if (listy[i] == 1) {
				lengthy++;
			}
		}

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

		String message = Integer.toString(xy_max) + " " + Integer.toString(y_max);
		System.out.println(message);

	}

}
```
<|endoftext|>
