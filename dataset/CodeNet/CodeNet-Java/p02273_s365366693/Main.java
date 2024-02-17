import java.awt.geom.Point2D;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        Point2D p = new Point2D.Double(0, 0);
        Point2D r = new Point2D.Double(100,0);
        System.out.printf("%.8f %.8f\n",p.getX(),p.getY());
        curve(n, p, r);
        System.out.printf("%.8f %.8f",r.getX(),r.getY());
    }
    private static void curve(int n, Point2D a, Point2D b) {
        if (n > 0) {
            Point2D s = new Point2D.Double();
            Point2D t = new Point2D.Double();
            Point2D u = new Point2D.Double();
            double th = (Math.PI / 180) * 60;
            s.setLocation(((2.0 * a.getX() + 1.0 * b.getX()) / 3.0), ((2.0 * a.getY() + 1.0 * b.getY()) / 3.0));
            t.setLocation(((1.0 * a.getX() + 2.0 * b.getX()) / 3.0), ((1.0 * a.getY() + 2.0 * b.getY()) / 3.0));
            u.setLocation(((t.getX() - s.getX()) * Math.cos(th) - (t.getY() - s.getY()) * Math.sin(th) + s.getX()),
                    ((t.getX() - s.getX()) * Math.sin(th) + (t.getY() - s.getY()) * Math.cos(th) + s.getY()));
            curve(n - 1, a, s);
            System.out.printf("%.8f %.8f\n",s.getX(),s.getY());
            curve(n - 1, s, u);
            System.out.printf("%.8f %.8f\n",u.getX(),u.getY());
            curve(n - 1, u, t);
            System.out.printf("%.8f %.8f\n",t.getX(),t.getY());
            curve(n - 1, t, b);
        }
    }
}
