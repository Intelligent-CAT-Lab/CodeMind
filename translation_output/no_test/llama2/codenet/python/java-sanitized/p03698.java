Solution


String s = input();
int count = 0;
for (char member : s.toCharArray()) {
    count = 0;
    for (char member2 : s.toCharArray()) {
        if (member2 == member) {
            count++;
        }
    }
    if (count >= 2) {
        System.out.println("no");
        break;
    }
    if (count == 1) {
        System.out.println("yes");
    }
}