import java.util.Arrays;

public class p01829 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        String s = scanner.nextLine();
        int l = s.length();
        int n = Integer.parseInt(s);
        int m = (int) 1e20;
        int r = 0;
        int t = (int) Math.pow(10, l);
        
        char[] sArr = s.toCharArray();
        int[] a = new int[l];
        
        for (int i = 0; i < l; i++) {
            a[i] = sArr[i] - '0';
        }
        
        for (int[] perm : permutations(a)) {
            int b = 0;
            for (int c : perm) {
                b = b * 10 + c;
            }
            
            int tm = Math.max(Math.abs(n - b), t - Math.abs(n - b));
            if (m > tm) {
                m = tm;
                r = Integer.parseInt(Arrays.toString(perm).replaceAll("\\[|\\]|,|\\s", ""));
            }
        }
        
        System.out.println(r);
    }
    
    public static java.util.List<int[]> permutations(int[] array) {
        java.util.List<int[]> list = new java.util.ArrayList<>();
        permuteHelper(list, array, 0);
        return list;
    }

    private static void permuteHelper(java.util.List<int[]> list, int[] array, int start) {
        if (start >= array.length) {
            list.add(array.clone());
            return;
        }

        for (int i = start; i < array.length; i++) {
            swap(array, i, start);
            permuteHelper(list, array, start + 1);
            swap(array, i, start);
        }
    }

    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}