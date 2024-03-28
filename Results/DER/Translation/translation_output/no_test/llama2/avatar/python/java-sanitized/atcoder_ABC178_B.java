int[] a = new int[4];
int[] b = new int[4];
int[] c = new int[4];
int[] d = new int[4];

String[] input = input().split(" ");
for (int i = 0; i < 4; i++) {
    a[i] = Integer.parseInt(input[i]);
}
for (int i = 0; i < 4; i++) {
    b[i] = Integer.parseInt(input[i]);
}
for (int i = 0; i < 4; i++) {
    c[i] = Integer.parseInt(input[i]);
}
for (int i = 0; i < 4; i++) {
    d[i] = Integer.parseInt(input[i]);
}

int ans = Math.max(a[0] * c[0], a[0] * d[0], b[0] * c[0], b[0] * d[0]);
System.out.println(ans);