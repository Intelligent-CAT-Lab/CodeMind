<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

import math
    
r = float(input())
    
s = r * r * math.pi
    
l = r * 2 * math.pi
    
print('%.5f %.5f' % (s, l))

Translate the above python code to java.

java code:

[/INST]

import java.util.Scanner;

public class AreaAndPerimeter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double r = scanner.nextDouble();
        double s = r * r * Math.PI;
        double l = r * 2 * Math.PI;
        System.out.printf("%.5f %.5f", s, l);
    }
}</s>
