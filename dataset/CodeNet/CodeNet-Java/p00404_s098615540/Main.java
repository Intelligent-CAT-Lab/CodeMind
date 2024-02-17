import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        Rectangle base = new Rectangle(0, 0, 0, 0);
        for (int i = 0; ; i++) {
            if (base.contains(x, y)) {
                System.out.println(i % 3 + 1);
                return;
            }
            if (i % 4 == 0) {
                base.endX = base.endX + base.endY - base.startY + 1;
            } else if (i % 4 == 1) {
                base.endY = base.endY + base.endX - base.startX + 1;
            } else if (i % 4 == 2) {
                base.startX = base.startX - (base.endY - base.startY + 1);
            } else {
                base.startY = base.startY - (base.endX - base.startX + 1);
            }
        }
    }
    
    static class Rectangle {
        int startX;
        int startY;
        int endX;
        int endY;
        
        public Rectangle(int startX, int startY, int endX, int endY) {
            this.startX = startX;
            this.startY = startY;
            this.endX = endX;
            this.endY = endY;
        }
        
        public boolean contains(int x, int y) {
            return x >= startX && x <= endX && y >= startY && y <= endY;
        }
    }
}
