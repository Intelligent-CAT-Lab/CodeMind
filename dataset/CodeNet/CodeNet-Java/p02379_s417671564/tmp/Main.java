import java.awt.*;
import java.awt.geom.*;
import java.io.*;

import java.util.*;
class Main {

	static char[] xx = new char[] {'S','H','C','D'};
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double x1 = sc.nextDouble();
System.out.println("[INST]10;x1;sc.nextDouble();"+x1);
		double y1 = sc.nextDouble();
System.out.println("[INST]11;y1;sc.nextDouble();"+y1);
		double x2 = sc.nextDouble();
System.out.println("[INST]12;x2;sc.nextDouble();"+x2);
		double y2 = sc.nextDouble();
System.out.println("[INST]13;y2;sc.nextDouble();"+y2);
		
		System.out.printf("%.8f", Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2)));
System.out.println("[INST]15;None;System.out.printf('%.8f', Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2)));"+System.out.printf("%.8f", Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2))));
System.out.println("[INST]15;None;Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));"+Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2)));
System.out.println("[INST]15;None;Math.pow(x1 - x2, 2);"+Math.pow(x1 - x2, 2));
System.out.println("[INST]15;None;Math.pow(y1 - y2, 2);"+Math.pow(y1 - y2, 2));

	}
}