public class p00404 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int x_min = 0;
        int y_min = 0;
        int x_max = 0;
        int y_max = 0;
        int f = 0;
        int f1 = 1;
        int f2 = 0;
        int p = 0;
        while(true){
            if(x_min <= x && x <= x_max && y_min <= y && y <= y_max){
                System.out.println((p%3)+1);
                break;
            }
            f = f1 + f2;
            if(p % 4 == 0){
                x_max += f;
            }else if(p % 4 == 1){
                y_max += f;
            }else if(p % 4 == 2){
                x_min -= f;
            }else{
                y_min -= f;
            }
            f2 = f1;
            f1 = f;
            p = p + 1;
        }
    }
}