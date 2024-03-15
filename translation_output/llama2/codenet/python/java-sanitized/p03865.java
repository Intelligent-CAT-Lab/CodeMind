String s = input();
if (s[0] == s[s.length() - 1]) {
    if (s.length() % 2 == 1) {
        System.out.println("Second");
    } else {
        System.out.println("First");
    }
} else {
    if (s.length() % 2 == 1) {
        System.out.println("First");
    } else {
        System.out.println("Second");
    }
}