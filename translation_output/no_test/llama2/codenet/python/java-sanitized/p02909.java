Solution


Scanner sc = new Scanner(System.in);
String S = sc.nextLine();

if (S.equals("Sunny")) {
    System.out.println("Cloudy");
} else if (S.equals("Cloudy")) {
    System.out.println("Rainy");
} else {
    System.out.println("Sunny");
}