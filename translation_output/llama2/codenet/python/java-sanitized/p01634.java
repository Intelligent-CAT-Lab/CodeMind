Solution


String a = input();

if (a.length() < 6) {
    print("INVALID");
} else {
    int m = 0;
    int n = 0;
    int l = 0;
    for (int i = 0; i < a.length(); i++) {
        if (48 <= a.charAt(i) && a.charAt(i) <= 57) {
            m++;
        }
        if (97 <= a.charAt(i) && a.charAt(i) <= 122) {
            n++;
        }
        if (65 <= a.charAt(i) && a.charAt(i) <= 90) {
            l++;
        }
    }
    if (m == 0 || n == 0 || l == 0) {
        print("INVALID");
    } else {
        print("VALID");
    }
}