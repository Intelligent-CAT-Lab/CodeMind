String[] a = input().split("/");
int a1 = Integer.parseInt(a[0]);
int a2 = Integer.parseInt(a[1]);
int a3 = Integer.parseInt(a[2]);

if (a1 <= 2018) {
    System.out.println("Heisei");
} else if (a1 == 2019 && a2 <= 4 && a3 <= 30) {
    System.out.println("Heisei");
} else {
    System.out.println("TBD");
}