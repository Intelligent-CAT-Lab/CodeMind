
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        boolean x = true;
        int cnt = 0;
        int[] dt = new int[26];
        for (int i = 0; i < s.length(); i++) {
            dt[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < 26; i++) {
            if (dt[i] % 2 != 0 && cnt < 1) {
                cnt++;
            } else if (dt[i] % 2 != 0 && cnt >= 1) {
                x = false;
                break;
            }
        }
        if (x) {
            System.out.println("First");
        } else if (!x && s.length() % 2 == 0) {
            System.out.println("Second");
        } else if (!x && s.length() % 2 != 0) {
            System.out.println("First");
        }
    }
}
```
/src/main/java/com/github/hcsp/controlflow/Main.java
package com.github.hcsp.controlflow;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        boolean x = true;
        int cnt = 0;
        int[] dt = new int[26];
        for (int i = 0; i < s.length(); i++) {
            dt[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < 26; i++) {
            if (dt[i] % 2 != 0 && cnt < 1) {
                cnt++;
            } else if (dt[i] % 2 != 0 && cnt >= 1) {
                x = false;
                break;
            }
        }
        if (x) {
            System.out.println("First");
        } else if (!x && s.length() % 2 == 0) {
            System.out.println("Second");
        } else if (!x && s.length() % 2 != 0) {
            System.out.println("First");
        }
    }
}

//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String s = sc.nextLine();
//        boolean x = true;
//        Map<Character, Integer> dt = new HashMap<>();
//        for (int i = 0; i < s.length(); i++) {
//            if (dt.containsKey(s.charAt(i))) {
//                dt.put(s.charAt(i), dt.get(s.charAt(i)) + 1);
//            } else {
//                dt.put(s.charAt(i), 1);
//            }
//        }
//        int cnt = 0;
//        x = true;
//        for (Map.Entry<Character, Integer> entry : dt.entrySet()) {
//            if (entry.getValue() % 2 != 0 && cnt < 1) {
//                cnt++;
//            } else if (entry.getValue() % 2 != 0 && cnt >= 1) {
//                x = false;
//                break;
//            }
//        }
//        if (x) {
//            System.out.println("First");
//        } else if (!x && s.length() % 2 == 0) {
//            System.out.println("Second");
//        } else if (!x && s.length() % 2 != 0) {
//            System.out.println("First");
//        }
//    }
//}

//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String s = sc.nextLine();
//        boolean x = true;
//        Map<Character, Integer> dt = new HashMap<>();
//        for (int i = 0; i < s.length(); i++) {
//            if (dt.containsKey(s.charAt(i))) {
//                dt.put(s.charAt(i), dt.get(s.charAt(i)) + 1);
//            } else {
//                dt.put(s.charAt(i), 1);
//            }
//        }
//        int cnt = 0;
//        x = true;
//        for (Map.Entry<Character, Integer> entry : dt.entrySet()) {
//            if (entry.getValue() % 2 != 0 && cnt < 1) {
//                cnt++;
//            } else if (entry.getValue() % 2 != 0 && cnt >= 1) {
//                x = false;
//                break;
//            }
//        }
//        if (x) {
//            System.out.println("First");
//        } else if (!x && s.length() % 2 == 0) {
//            System.out.println("Second");
//        } else if (!x && s.length() % 2 != 0) {
//            System.out.println("First");
//        }
//    }
//}

//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String s = sc.nextLine();
//        boolean x = true;
//        Map<Character, Integer> dt = new HashMap<>();
//        for (int i = 0; i < s.length(); i++) {
//            if (dt.containsKey(s.charAt(i))) {
//                dt.put(s.charAt(i), dt.get(s.charAt(i)) + 1);
//            } else {
//                dt.put(s.charAt(i), 1);
//            }
//        }
//        int cnt = 0;
//        x = true;
//        for (Map.Entry<Character, Integer> entry : dt.entrySet()) {
//            if (entry.getValue() % 2 != 0 && cnt < 1) {
//                cnt++;
//            } else if (entry.getValue() % 2 != 0 && cnt >= 1) {
//                x = false;
//                break;
//            }
//        }
//        if (x) {
//            System.out.println("First");
//        } else if (!x && s.length() % 2 == 0) {
//            System.out.println("Second");
//        } else if (!x && s.length() % 2 != 0) {
//            System.out.println("First");
//        }
//    }
//}

//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String s = sc.nextLine();
//        boolean x = true;
//        Map<Character, Integer> dt = new HashMap<>();
//        for (int i = 0; i < s.length(); i++) {
//            if (dt.containsKey(s.charAt(i))) {
//                dt.put(s.charAt(i), dt.get(s.charAt(i)) + 1);
//            } else {
//                dt.put(s.charAt(i), 1);
//            }
//        }
//        int cnt = 0;
//        x = true;
//        for (Map.Entry<Character, Integer> entry : dt.entrySet()) {
//            if (entry.getValue() % 2 != 0 && cnt < 1) {
//                cnt++;
//            } else if (entry.getValue() % 2 != 0 && cnt >= 1) {
//
