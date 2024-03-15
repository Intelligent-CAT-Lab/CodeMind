Solution


int X = Integer.parseInt(input());
int i = 1;
int a = 0;
while (true) {
    a = a + X;
    if (a % 360 == 0) {
        System.out.println(i);
        break;
    }
    i++;
}