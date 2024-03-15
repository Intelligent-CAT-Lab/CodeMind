import java.util.Scanner;

public class p01725 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next() + "$";
        int ans = -1000000000;
        for (int[] pri : product(new int[]{0, 1, 2}, 3)) {
            int cur = 0;
            int code = 0;
            int num = 0;
            int op = 0;
            int result = 0;
            while (cur < S.length()) {
                char c = S.charAt(cur);
                if (c == '(') {
                    cur++;
                    num = expr(0);
                    cur++;
                } else if (c == '+') {
                    op = '+';
                } else if (c == '-') {
                    op = '-';
                } else if (c == '*') {
                    op = '*';
                } else if (c == ')') {
                    break;
                } else if (c == ' ') {
                    continue;
                } else if (c == '$') {
                    break;
                } else if (c == '.') {
                    break;
                } else if (c == ',') {
                    break;
                } else if (c == '(') {
                    cur++;
                    num = expr(1);
                    cur++;
                } else if (c == '+') {
                    result += num;
                } else if (c == '-') {
                    result -= num;
                } else if (c == '*') {
                    result *= num;
                } else {
                    if (code == 0) {
                        num = 0;
                        while (c >= '0' && c <= '9') {
                            num = 10 * num + (c - '0');
                            cur++;
                        }
                    } else if (code == 1) {
                        num = expr(0);
                    } else if (code == 2) {
                        num = expr(1);
                    }
                    if (op == '+') {
                        result += num;
                    } else if (op == '-') {
                        result -= num;
                    } else if (op == '*') {
                        result *= num;
                    }
                    code = 0;
                    op = 0;
                }
            }
            ans = Math.max(ans, result);
        }
        System.out.println(ans);
    }

    private static int expr(int level) {
        int result = 0;
        int op = 0;
        while (true) {
            if (level == 2) {
                result = num();
            } else {
                result = expr(level + 1);
            }
            if (op == '+') {
                result += result;
            } else if (op == '-') {
                result -= result;
            } else if (op == '*') {
                result *= result;
            } else {
                break;
            }
            char c = S.charAt(cur);
            if (code.indexOf(c) == -1 || pri[code.indexOf(c)] != level) {
                break;
            }
            op = c;
            cur++;
        }
        return result;
    }

    private static int num() {
        int result = 0;
        while (true) {
            char c = S.charAt(cur);
            if (c == '(') {
                cur++;
                result = num();
                cur++;
            } else if (c == '+') {
                op = '+';
            } else if (c == '-') {
                op = '-';
            } else if (c == '*') {
                op = '*';
            } else if (c == ')') {
                break;
            } else if (c == ' ') {
                continue;
            } else if (c == '$') {
                break;
            } else if (c == '.') {
                break;
            } else if (c == ',') {
                break;
            } else if (c == '(') {
                cur++;
                result = num(1);
                cur++;
            } else if (c == '+') {
                result += result;
            } else if (c == '-') {
                result -= result;
            } else if (c == '*') {
                result *= result;
            } else {
                if (code == 0) {
                    result = 0;
                    while (c >= '0' && c <= '9') {
                        result = 10 * result + (c - '0');
                        cur++;
                    }
                } else if (code == 1) {
                    result = num(0);
                } else if (code == 2) {
                    result = num(1);
                }
                if (op == '+') {
                    result += result;
                } else if (op == '-') {
                    result -= result;
                } else if (op == '*') {
                    result *= result;
                }
                code = 0;
                op = 0;
            }
        }
        return result;
    }

    private static int num(int level) {
        int result = 0;
        int op = 0;
        while (true) {
            if (level == 2) {
                result = num();
            } else {
                result = num(level + 1);
            }
            if (op == '+') {
                result += result;
            } else if (op == '-') {
                result -= result;
            } else if (op == '*') {
                result *= result;
            } else {
                break;
            }
            char c = S.charAt(cur);
            if (code.indexOf(c) == -1 || pri[code.indexOf(c)] != level) {
                break;
            }
            op = c;
            cur++;
        }
        return result;
    }
}