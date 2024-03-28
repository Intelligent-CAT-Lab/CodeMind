Solution


String B = input();

String[] O = {"1 1 0", "0 0 1"};

if (B.equals(O[0]) || B.equals(O[1])) {
    System.out.println("Open");
} else {
    System.out.println("Close");
}