int A, B, C;
String[] input = scanner.nextLine().split(" ");
A = Integer.parseInt(input[0]);
B = Integer.parseInt(input[1]);
C = Integer.parseInt(input[2]);

int get = A - B;

int i = C - get;

if (i < 0) {
    i = 0;
}

System.out.println(i);