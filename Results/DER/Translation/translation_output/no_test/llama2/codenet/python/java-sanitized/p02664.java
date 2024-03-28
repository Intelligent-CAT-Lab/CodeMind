Solution


String a = input();

String[] aArray = a.split("");

for (int i = 0; i < aArray.length; i++) {
    if (aArray[i].equals("?")) {
        aArray[i] = "D";
    }
}

String b = "";
for (int i = 0; i < aArray.length; i++) {
    b += aArray[i];
}

System.out.println(b);