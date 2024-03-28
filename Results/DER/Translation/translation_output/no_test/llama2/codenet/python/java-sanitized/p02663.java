int h1, m1, h2, m2, k;
String[] input = scanner.nextLine().split(" ");
h1 = Integer.parseInt(input[0]);
m1 = Integer.parseInt(input[1]);
h2 = Integer.parseInt(input[2]);
m2 = Integer.parseInt(input[3]);
k = Integer.parseInt(input[4]);

int t1 = 60 * h1 + m1;
int t2 = 60 * h2 + m2;

System.out.println(t2 - t1 - k);