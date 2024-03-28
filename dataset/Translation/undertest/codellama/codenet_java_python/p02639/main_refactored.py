class main:
    import java.util.Scanner;
    
    public class p02639 {
        public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
            int[] x = new int[5];
            int sum=0;
            for(int i=0;i<5;i++){
                x[i] = sc.nextInt();
                sum += x[i];
            }
            System.out.println(15-sum);
        }
    
    }
    
    
    
    import java.util.Scanner;
    
    public class p02639:
        def main(args):
            sc = Scanner(System.in)
            x = [0] * 5
            sum = 0
            for i in range(5):
                x[i] = sc.nextInt()
                sum += x[i]
            print(15 - sum)