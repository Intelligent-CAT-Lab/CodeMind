int n = Integer.parseInt(br.readLine());

if (n == 1) {
    System.out.println("1");
    System.out.println("0");
} else if (n == 2) {
    System.out.println("2");
    System.out.println("0");
    System.out.println("11");
} else {
    System.out.println(n - 1);
    for (int i = 0; i < n - 1; i++) {
        System.out.println("1" + "0".repeat(i) + "1");
    }
}