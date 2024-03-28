Solution


String x = input();
int a = 0;
for (char i : x.toCharArray()) {
  if (i == 'x') {
    a++;
  }
}
System.out.println(["NO", "YES"][a <= 7]);