import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		float x=in.nextFloat(),y=in.nextFloat();
System.out.println("[INST]6;x;in.nextFloat();"+x);
System.out.println("[INST]6;y;in.nextFloat();"+y);
		float a=y/(2*x);
		List<point> cx=new ArrayList<>();
		for(int i=0;i<=x;i++) {
			point p=new point();
			p.x=(float)(i*2);
			p.y=y-(a*(p.x));
			//System.out.println(p.y);
			cx.add(p);
System.out.println("[INST]14;None;cx.add(p);"+cx.add(p));
		}
		
		for(int i=0;i<=y;i++) {
			point p=new point();
			p.y=(float)i;
			p.x=(y-p.y)/a;
			//System.out.println(p.x);
			boolean same=false;
			for(int j=0;j<cx.size();j++) {
System.out.println("[INST]23;None;cx.size();"+cx.size());
				if(p.x==cx.get(j).x && p.y==cx.get(j).y) {
System.out.println("[INST]24;None;cx.get(j);"+cx.get(j));
System.out.println("[INST]24;None;cx.get(j);"+cx.get(j));
					same=true;
					//System.out.println(p.x+" "+p.y+"same");
					break;
				}
			}
			if(same==false)cx.add(p);
System.out.println("[INST]30;None;cx.add(p);"+cx.add(p));
		}
		
		System.out.println(cx.size());
	}

}
class point{
	float x=0,y=0;
}

