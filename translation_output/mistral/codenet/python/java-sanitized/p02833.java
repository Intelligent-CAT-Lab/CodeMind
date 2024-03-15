import java.util.*;

public class p02833 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, r;
        while (true) {
            n = sc.nextInt();
            r = sc.nextInt();
            if (n == 0 || r == 0) {
                break;
            }
            int result = nCr(n, r);
            System.out.println(result);
        }
    }

    public static int nCr(int n, int r) {
        int minR = Math.min(r, n - r);
        int numerator = reduce(Math::multiplyExact, range(n, n - minR, -1), 1);
        int denominator = reduce(Math::multiplyExact, range(1, minR + 1), 1);
        return (int) Math.floor(numerator / denominator);
    }

    public static int find(int u) {
        if (par[u] < 0) {
            return u;
        } else {
            return find(par[u]);
        }
    }

    public static void uni(int x, int y) {
        int u = find(x);
        int v = find(y);
        if (u == v) {
            return;
        }
        if (par[u] < par[v]) {
            par[u] += par[v];
            par[v] = u;
        } else {
            par[v] += par[u];
            par[u] = v;
        }
    }

    public static int[] read(int p) {
        if (p == 0) {
            return new int[0];
        } else if (p == 1) {
            return new int[]{sc.nextInt()};
        } else if (p == 2) {
            return new int[]{sc.nextInt(), sc.nextInt()};
        } else if (p == 3) {
            return new int[]{sc.nextInt(), sc.nextInt(), sc.nextInt()};
        }
        return new int[p];
    }

    public static int[] rd(int p) {
        if (p == 0) {
            return new int[0];
        } else if (p == 1) {
            return new int[]{sc.nextInt()};
        } else if (p == 2) {
            return new int[]{sc.nextInt(), sc.nextInt()};
        } else if (p == 3) {
            return new int[]{sc.nextInt(), sc.nextInt(), sc.nextInt()};
        }
        return new int[p];
    }

    public static int[] div(int n, int d) {
        int quotient = n / d;
        int remainder = n % d;
        return new int[]{quotient, remainder};
    }

    public static int[] multiply(int[] a, int[] b) {
        int[] result = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            result[i] = a[i] * b[i];
        }
        return result;
    }

    public static int[] reduce(BiFunction<Integer, Integer, Integer> func, int[] arr) {
        int result = arr[0];
        for (int i = 1; i < arr.length; i++) {
            result = func.apply(result, arr[i]);
        }
        return new int[]{result};
    }

    public static int[] range(int start, int end, int step) {
        int[] result = new int[Math.ceil((end - start) / step) + 1];
        for (int i = 0; i < result.length; i++) {
            result[i] = start + i * step;
        }
        return result;
    }

    public static int[] map(Function<Integer, Integer> func, int[] arr) {
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result[i] = func.apply(arr[i]);
        }
        return result;
    }

    public static int[] multiplyExact(int a, int b) {
        return new int[]{a * b};
    }

    public static int[] divExact(int a, int b) {
        int quotient = a / b;
        int remainder = a % b;
        return new int[]{quotient, remainder};
    }

    public static int[] findMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return new int[]{min};
    }

    public static int[] sort(int[] arr) {
        Arrays.sort(arr);
        return arr;
    }

    public static int[] reverse(int[] arr) {
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result[i] = arr[arr.length - 1 - i];
        }
        return result;
    }

    public static int[] merge(int[] arr1, int[] arr2) {
        int[] result = new int[arr