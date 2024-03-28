Solution


int a = Integer.parseInt(input());
for (int i = a; i >= 0; i--) {
    if (a % i == 0) {
        System.out.print(i + " â ");
        a = i;
    }
}