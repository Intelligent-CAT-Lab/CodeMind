import java.awt.geom.Point2D;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
System.out.println("[INST]5;n;scan.nextInt();"+n);
        Point2D p = new Point2D.Double(0, 0);
        Point2D r = new Point2D.Double(100,0);
        System.out.printf("%.8f %.8f\n",p.getX(),p.getY());
System.out.println("[INST]8;None;System.out.printf('%.8f %.8f\n',p.getX(),p.getY());"+System.out.printf("%.8f %.8f\n",p.getX(),p.getY()));
System.out.println("[INST]8;None;p.getX();"+p.getX());
System.out.println("[INST]8;None;p.getY();"+p.getY());
        curve(n, p, r);
        System.out.printf("%.8f %.8f",r.getX(),r.getY());
System.out.println("[INST]10;None;System.out.printf('%.8f %.8f',r.getX(),r.getY());"+System.out.printf("%.8f %.8f",r.getX(),r.getY()));
System.out.println("[INST]10;None;r.getX();"+r.getX());
System.out.println("[INST]10;None;r.getY();"+r.getY());
    }
    private static void curve(int n, Point2D a, Point2D b) {
        if (n > 0) {
            Point2D s = new Point2D.Double();
            Point2D t = new Point2D.Double();
            Point2D u = new Point2D.Double();
            double th = (Math.PI / 180) * 60;
            s.setLocation(((2.0 * a.getX() + 1.0 * b.getX()) / 3.0), ((2.0 * a.getY() + 1.0 * b.getY()) / 3.0));
System.out.println("[INST]18;None;s.setLocation(((2.0 * a.getX() + 1.0 * b.getX()) / 3.0), ((2.0 * a.getY() + 1.0 * b.getY()) / 3.0));"+s.setLocation(((2.0 * a.getX() + 1.0 * b.getX()) / 3.0), ((2.0 * a.getY() + 1.0 * b.getY()) / 3.0)));
System.out.println("[INST]18;None;a.getX();"+a.getX());
System.out.println("[INST]18;None;b.getX();"+b.getX());
System.out.println("[INST]18;None;a.getY();"+a.getY());
System.out.println("[INST]18;None;b.getY();"+b.getY());
            t.setLocation(((1.0 * a.getX() + 2.0 * b.getX()) / 3.0), ((1.0 * a.getY() + 2.0 * b.getY()) / 3.0));
System.out.println("[INST]19;None;t.setLocation(((1.0 * a.getX() + 2.0 * b.getX()) / 3.0), ((1.0 * a.getY() + 2.0 * b.getY()) / 3.0));"+t.setLocation(((1.0 * a.getX() + 2.0 * b.getX()) / 3.0), ((1.0 * a.getY() + 2.0 * b.getY()) / 3.0)));
System.out.println("[INST]19;None;a.getX();"+a.getX());
System.out.println("[INST]19;None;b.getX();"+b.getX());
System.out.println("[INST]19;None;a.getY();"+a.getY());
System.out.println("[INST]19;None;b.getY();"+b.getY());
            u.setLocation(((t.getX() - s.getX()) * Math.cos(th) - (t.getY() - s.getY()) * Math.sin(th) + s.getX()),
System.out.println("[INST]20;None;u.setLocation(((t.getX() - s.getX()) * Math.cos(th) - (t.getY() - s.getY()) * Math.sin(th) + s.getX()),
                    ((t.getX() - s.getX()) * Math.sin(th) + (t.getY() - s.getY()) * Math.cos(th) + s.getY()));"+u.setLocation(((t.getX() - s.getX()) * Math.cos(th) - (t.getY() - s.getY()) * Math.sin(th) + s.getX()),
                    ((t.getX() - s.getX()) * Math.sin(th) + (t.getY() - s.getY()) * Math.cos(th) + s.getY())));
System.out.println("[INST]20;None;t.getX();"+t.getX());
System.out.println("[INST]20;None;s.getX();"+s.getX());
System.out.println("[INST]20;None;Math.cos(th);"+Math.cos(th));
System.out.println("[INST]20;None;t.getY();"+t.getY());
System.out.println("[INST]20;None;s.getY();"+s.getY());
System.out.println("[INST]20;None;Math.sin(th);"+Math.sin(th));
System.out.println("[INST]20;None;s.getX();"+s.getX());
                    ((t.getX() - s.getX()) * Math.sin(th) + (t.getY() - s.getY()) * Math.cos(th) + s.getY()));
System.out.println("[INST]21;None;t.getX();"+t.getX());
System.out.println("[INST]21;None;s.getX();"+s.getX());
System.out.println("[INST]21;None;Math.sin(th);"+Math.sin(th));
System.out.println("[INST]21;None;t.getY();"+t.getY());
System.out.println("[INST]21;None;s.getY();"+s.getY());
System.out.println("[INST]21;None;Math.cos(th);"+Math.cos(th));
System.out.println("[INST]21;None;s.getY();"+s.getY());
            curve(n - 1, a, s);
            System.out.printf("%.8f %.8f\n",s.getX(),s.getY());
System.out.println("[INST]23;None;System.out.printf('%.8f %.8f\n',s.getX(),s.getY());"+System.out.printf("%.8f %.8f\n",s.getX(),s.getY()));
System.out.println("[INST]23;None;s.getX();"+s.getX());
System.out.println("[INST]23;None;s.getY();"+s.getY());
            curve(n - 1, s, u);
            System.out.printf("%.8f %.8f\n",u.getX(),u.getY());
System.out.println("[INST]25;None;System.out.printf('%.8f %.8f\n',u.getX(),u.getY());"+System.out.printf("%.8f %.8f\n",u.getX(),u.getY()));
System.out.println("[INST]25;None;u.getX();"+u.getX());
System.out.println("[INST]25;None;u.getY();"+u.getY());
            curve(n - 1, u, t);
            System.out.printf("%.8f %.8f\n",t.getX(),t.getY());
System.out.println("[INST]27;None;System.out.printf('%.8f %.8f\n',t.getX(),t.getY());"+System.out.printf("%.8f %.8f\n",t.getX(),t.getY()));
System.out.println("[INST]27;None;t.getX();"+t.getX());
System.out.println("[INST]27;None;t.getY();"+t.getY());
            curve(n - 1, t, b);
        }
    }
}
