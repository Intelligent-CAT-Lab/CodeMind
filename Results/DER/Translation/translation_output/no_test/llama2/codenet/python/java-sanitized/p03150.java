String S = input();
for (int i = 0; i < S.length(); i++) {
    for (int j = i; j < S.length() + 1; j++) {
        if (S.substring(0, i) + S.substring(j) == "keyence") {
            System.out.println("YES");
            break;
        }
    }
}
for (int k = 0; k < S.length(); k++) {
    if (S.substring(k, k + 8) == "keyence") {
        System.out.println("YES");
        break;
    }
}
System.out.println("NO");