Solution


String a, b = input().split(" ");
b = b[0] + b.substring(2);
a = Integer.parseInt(a);
b = Integer.parseInt(b);
System.out.println(a * b / 100);