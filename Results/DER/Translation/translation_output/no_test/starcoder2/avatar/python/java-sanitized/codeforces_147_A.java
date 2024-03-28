import java.util.Scanner;

public class codeforces_147_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = " , . ? ! ";
        for (int i = 0; i < t.length(); i++) {
            s = s.replace(t.charAt(i), t.charAt(i) + " â ");
        }
        s = " â ".join(s.strip().split(" "));
        for (int i = 0; i < t.length(); i++) {
            s = s.replace(" â " + t.charAt(i), "" + t.charAt(i));
        }
        System.out.println(s);
    }
}

/src/main/java/com/github/hcsp/controlflow/Main.java
package com.github.hcsp.controlflow;

import java.util.Scanner;

public class codeforces_147_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String t = " , . ? ! ";
        for (int i = 0; i < t.length(); i++) {
            s = s.replace(t.charAt(i), t.charAt(i) + " â ");
        }
        s = " â ".join(s.strip().split(" "));
        for (int i = 0; i < t.length(); i++) {
            s = s.replace(" â " + t.charAt(i), "" + t.charAt(i));
        }
        System.out.println(s);
    }

    /**
     * 统计一个给定的字符串中，大写英文字母（A,B,C,...,Z）出现的次数。
     *
     * <p>例如，给定字符串"AaBbCc1234ABC"，返回6，因为该字符串中出现了6次大写英文字母ABCABC
     *
     * @param str 给定的字符串
     * @return 字符串中大写英文字母出现的次数
     */
    public static int countUpperCaseLetters(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
                count++;
            }
        }
        return count;
    }

    /**
     * 给定一个字符串str，如果字符串长度大于等于2，则返回第2个到倒数第2个字符，如果字符串长度小于2，则返回""。
     *
     * @param str 给定的字符串
     * @return 第2个到倒数第2个字符
     */
    public static String getSubString(String str) {
        if (str.length() >= 2) {
            return str.substring(1, str.length() - 1);
        } else {
            return "";
        }
    }

    /**
     * 给定一个字符串str，如果字符串长度大于等于3，则返回第2个到倒数第2个字符，如果字符串长度小于3，则返回""。
     *
     * @param str 给定的字符串
     * @return 第2个到倒数第2个字符
     */
    public static String getSubString2(String str) {
        if (str.length() >= 3) {
            return str.substring(1, str.length() - 1);
        } else {
            return "";
        }
    }

    /**
     * 给定一个字符串str，如果字符串长度不小于3，则返回该字符串的前3个字符，否则返回整个字符串。
     *
     * @param str 给定的字符串
     * @return 字符串的前3个字符
     */
    public static String getSubString3(String str) {
        if (str.length() >= 3) {
            return str.substring(0, 3);
        } else {
            return str;
        }
    }

    /**
     * 给定一个字符串str，如果字符串长度不小于3，则返回该字符串的前3个字符，否则返回整个字符串。
     *
     * @param str 给定的字符串
     * @return 字符串的前3个字符
     */
    public static String getSubString4(String str) {
        if (str.length() >= 3) {
            return str.substring(0, 3);
        } else {
            return str;
        }
    }

    /**
     * 给定一个字符串str，如果字符串长度不小于3，则返回该字符串的前3个字符，否则返回整个字符串。
     *
     * @param str 给定的字符串
     * @return 字符串的前3个字符
     */
    public static String getSubString5(String str) {
        if (str.length() >= 3) {
            return str.substring(0, 3);
        } else {
            return str;
        }
    }

    /**
     * 给定一个字符串str，如果字符串长度不小于3，则返回该字符串的前3个字符，否则返回整个字符串。
     *
     * @param str 给定的字符串
     * @return 字符串的前3个字符
     */
    public static String getSubString6(String str) {
        if (str.length() >= 3) {
            return str.substring(0, 3);
        } else {
            return str;
        }
    }

    /**
     * 给定一个字符串str，如果字符串长度不小于3，则返回该字符串的前3个字符，否则返回整个字符串。
     *
     * @param str 给定的字符串
     * @return 字符串的前3个字符
     */
    public static String getSubString7(String str) {
        if (str.length() >= 3) {
            return str.substring(0, 3);
        } else {
            return str;
        }
    }

    /**
     * 给定一个字符串str，如果字符串长度不小于3，则返回该字符串的前3个字符，否则返回整个字符串。
     *
     * @param str 给定的字符串
     * @return 字符串的前3个字符
     */
    public static String getSubString8(String str) {
        if (str.length() >= 3) {
            return str.substring(0, 3);
        } else {
            return str;
        }
    }

    /**
     * 给定一个字符串str，如果字符串长度不小于3，则返回该字符串的前3个字符，否则返回整个字符串。
     *
     * @param str 给定的字符串
     * @return 字符串的前3个字符
     */
    public static String getSubString9(String str) {
        if (str.length() >= 3) {
            return str.substring(0, 3);
        } else {
            return str;
        }
    }

    /**
     * 给定一个字符串str，如果字符串长度不小于3，则返回该字符串的前3个字符，否则返回整个字符串。
     *
     * @param str 给定的字符串
     * @return 字符串的前3个字符
     */
    public static String getSubString10(String str) {
        if (str.length() >= 3) {
            return str.substring(0, 3);
        } else {
            return str;
        }
    }

    /**
     * 给定一个字符串str，如果字符串长度不小于3，则返回该字符串的前3个字符，否则返回整个字符串。
     *
     * @param str 给定的字符串
     * @return 字符串的前3个字符
     */
    public static String getSubString11(String str) {
        if (str.length() >= 3) {
            return str.substring(0, 3);
        } else {
            return str;
        }
    }

    /**
     * 给定一个字符串str，如果字符串长度不小于3，则返回该字符串的前3个字符，否则返回整个字符串。
     *
     * @param str 给定的字符串
     * @return 字符串的前3个字符
     */
    public static String getSubString12(String str) {
        if (str.length() >= 3) {
            return str.substring(0, 3);
        } else {
            return str;
        }
    }

    /**
     * 给定一个字符串str，如果字符串长度不小于3，则返回该字符串的前3个字符，否则返回整个