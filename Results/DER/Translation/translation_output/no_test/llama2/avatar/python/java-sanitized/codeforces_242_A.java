Solution


int x, y, a, b;
String[] input = scanner.nextLine().split(" ");
x = Integer.parseInt(input[0]);
y = Integer.parseInt(input[1]);
a = Integer.parseInt(input[2]);
b = Integer.parseInt(input[3]);

int[][] c = new int[x - a + 1][y - b + 1];
for (int i = a; i < x + 1; i++) {
    for (int j = b; j < y + 1; j++) {
        if (i > j) {
            c[i - a][j - b] = 1;
        }
    }
}
System.out.println(c.length);
for (int[] row : c) {
    for (int col : row) {
        System.out.print(col + " ");
    }
    System.out.println();
}