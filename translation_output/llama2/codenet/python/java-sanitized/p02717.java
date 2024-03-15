> Translate the following python code to java and enclose your solution inside :

# ã¹ãã¼ã¹åºåãã®æ´æ°ã®å
¥å
X,Y,Z = map(int, input().split())

A=X
B=Y
C=Z

B=X
C=Y
A=Z

print(A,B,C)


## 解答


// ã¹ãã¼ã¹åºåãã®æ´æ°ã®å
¥å
int X,Y,Z;
String[] input = new String[3];
input[0] = input.readLine();
input[1] = input.readLine();
input[2] = input.readLine();

X = Integer.parseInt(input[0]);
Y = Integer.parseInt(input[1]);
Z = Integer.parseInt(input[2]);

int A = X;
int B = Y;
int C = Z;

B = X;
C = Y;
A = Z;

System.out.println(A + " " + B + " " + C);