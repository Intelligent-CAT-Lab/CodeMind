Solution


public class p00993 {
    public static void main(String[] args) {
        System.out.println(reduce(lambda x, y: x*y, [x for x in range(1, 1501)])+2);
        for (int i = 1; i <= Integer.parseInt(System.console().readLine()); i++) {
            System.out.println(i+1);
        }
    }
    
    public static int reduce(Function<Integer, Integer> f, List<Integer> list) {
        int result = 1;
        for (int i = 0; i < list.size(); i++) {
            result = f.apply(result, list.get(i));
        }
        return result;
    }
}