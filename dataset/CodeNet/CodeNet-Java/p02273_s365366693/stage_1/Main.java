import java.awt.geom.Point2D;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        Point2D p = new Point2D.Double(0, 0);
        Point2D r = new Point2D.Double(100,0);
var newVariable_0 = System.out.printf("%.8f %.8f\n",p.getX(),p.getY());var newVariable_1 = p.getX();var newVariable_2 = p.getY();        System.out.printf("%.8f %.8f\n",p.getX(),newVariable_2);
        curve(n, p, r);
var newVariable_3 = System.out.printf("%.8f %.8f",r.getX(),r.getY());var newVariable_4 = r.getX();var newVariable_5 = r.getY();        System.out.printf("%.8f %.8f",r.getX(),newVariable_5);
    }
    private static void curve(int n, Point2D a, Point2D b) {
        if (n > 0) {
            Point2D s = new Point2D.Double();
            Point2D t = new Point2D.Double();
            Point2D u = new Point2D.Double();
            double th = (Math.PI / 180) * 60;
var newVariable_6 = s.setLocation(((2.0 * a.getX() + 1.0 * b.getX()) / 3.0), ((2.0 * a.getY() + 1.0 * b.getY()) / 3.0));var newVariable_7 = a.getX();var newVariable_8 = b.getX();var newVariable_9 = a.getY();var newVariable_10 = b.getY();            s.setLocation(((2.0 * a.getX() + 1.0 * b.getX()) / 3.0), ((2.0 * a.getY() + 1.0 * newVariable_10) / 3.0));
var newVariable_11 = t.setLocation(((1.0 * a.getX() + 2.0 * b.getX()) / 3.0), ((1.0 * a.getY() + 2.0 * b.getY()) / 3.0));var newVariable_12 = a.getX();var newVariable_13 = b.getX();var newVariable_14 = a.getY();var newVariable_15 = b.getY();            t.setLocation(((1.0 * a.getX() + 2.0 * b.getX()) / 3.0), ((1.0 * a.getY() + 2.0 * newVariable_15) / 3.0));
var newVariable_16 = u.setLocation(((t.getX() - s.getX()) * Math.cos(th) - (t.getY() - s.getY()) * Math.sin(th) + s.getX()),
                    ((t.getX() - s.getX()) * Math.sin(th) + (t.getY() - s.getY()) * Math.cos(th) + s.getY()));var newVariable_17 = t.getX();var newVariable_18 = s.getX();var newVariable_19 = Math.cos(th);var newVariable_20 = t.getY();var newVariable_21 = s.getY();var newVariable_22 = Math.sin(th);var newVariable_23 = s.getX();            u.setLocation(((t.getX() - newVariable_23) * Math.cos(th) - (t.getY() - s.getY()) * Math.sin(th) + newVariable_23),
var newVariable_24 = t.getX();var newVariable_25 = s.getX();var newVariable_26 = Math.sin(th);var newVariable_27 = t.getY();var newVariable_28 = s.getY();var newVariable_29 = Math.cos(th);var newVariable_30 = s.getY();                    ((t.getX() - s.getX()) * Math.sin(th) + (t.getY() - newVariable_30) * Math.cos(th) + newVariable_30));
            curve(n - 1, a, s);
var newVariable_31 = System.out.printf("%.8f %.8f\n",s.getX(),s.getY());var newVariable_32 = s.getX();var newVariable_33 = s.getY();            System.out.printf("%.8f %.8f\n",s.getX(),newVariable_33);
            curve(n - 1, s, u);
var newVariable_34 = System.out.printf("%.8f %.8f\n",u.getX(),u.getY());var newVariable_35 = u.getX();var newVariable_36 = u.getY();            System.out.printf("%.8f %.8f\n",u.getX(),newVariable_36);
            curve(n - 1, u, t);
var newVariable_37 = System.out.printf("%.8f %.8f\n",t.getX(),t.getY());var newVariable_38 = t.getX();var newVariable_39 = t.getY();            System.out.printf("%.8f %.8f\n",t.getX(),newVariable_39);
            curve(n - 1, t, b);
        }
    }
}
