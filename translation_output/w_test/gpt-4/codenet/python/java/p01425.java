Here's the Python code translated into Java:

```java
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    
    static final double g = 9.8;
    static final double eps = 1e-10;
    
    static double calc(double vy, double t) {
        return vy * t - g / 2 * t * t;
    }

    static int cmp(double lb, double ub, double x){
        if(x < lb + eps)
            return -1;
        else if(x > ub - eps)
            return 1;
        return 0;
    }

    static boolean check(double qx, double qy){
        if(qx == 0)
            return false;
        double a = g * g / 4;
        double b = qy * g - V * V;
        double c = qx * qx + qy * qy;
        double D = b * b - 4 * a * c;
        if(D < -eps)
            return false;
        if(-eps <= D && D < 0)
            D = 0;
        for(int d : new int[]{-1, 1}){
            double tt = (-b + d * Math.sqrt(D)) / (2 * a);
            if(tt <= 0)
                continue;
            double t = Math.sqrt(tt);
            double vx = qx / t;
            double vy = qy / t + g * t / 2;
            if(calc(vy, X / vx) < Y - eps)
                return false;
            for(double[] obstacle : obstacles){
                double L = obstacle[0];
                double B = obstacle[1];
                double R = obstacle[2];
                double T = obstacle[3];
                int l = cmp(B, T, calc(vy, L / vx));
                int r = cmp(B, T, calc(vy, R / vx));
                int xh = cmp(L, R, vx * (vy / g));
                int yh = cmp(B, T, calc(vy, vy / g));
                if(l * r <= 0 || xh == 0 && yh * l <= 0)
                    break;
            }
            if(obstacles.stream().allMatch(obstacle -> {
                double L = obstacle[0];
                double B = obstacle[1];
                double R = obstacle[2];
                double T = obstacle[3];
                int l = cmp(B, T, calc(vy, L / vx));
                int r = cmp(B, T, calc(vy, R / vx));
                int xh = cmp(L, R, vx * (vy / g));
                int yh = cmp(B, T, calc(vy, vy / g));
                return l * r > 0 && (xh != 0 || yh * l > 0);
            })){
                return true;
            }
        }
        return false;
    }

    static List<double[]> obstacles;
    static double V, X, Y;
    
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        V = scanner.nextDouble();
        X = scanner.nextDouble();
        Y = scanner.nextDouble();
        obstacles = new ArrayList<>();
        for(int i = 0; i < N; i++){
            double L = scanner.nextDouble();
            double B = scanner.nextDouble();
            double R = scanner.nextDouble();
            double T = scanner.nextDouble();
            if(L < X){
                obstacles.add(new double[]{L, B, Math.min(R, X), T});
            }
        }
        if(check(X, Y)){
            System.out.println("Yes");
            System.exit(0);
        }
        for(double[] obstacle : obstacles){
            double L = obstacle[0];
            double R = obstacle[2];
            double T = obstacle[3];
            if(L != 0 && R != 0 && (check(L, T) || check(R, T))){
                System.out.println("Yes");
                System.exit(0);
            }
        }
        System.out.println("No");
        scanner.close();
    }
}
```

Please note that when translating Python to Java, one must take into account differences in syntax and common practices, type handling, error-checking, and predefined constants and methods. It is also important to manage inputs and outputs appropriately, as Java handles these somewhat differently from Python. In the above Java code, I've used a `Scanner` to handle the input, and I've used a `List<double[]>` to store the obstacles. The rest of the code follows the logic of the Python script as closely as possible.
