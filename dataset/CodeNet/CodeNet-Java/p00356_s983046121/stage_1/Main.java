import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		float x=in.nextFloat(),y=in.nextFloat();
		float a=y/(2*x);
		List<point> cx=new ArrayList<>();
		for(int i=0;i<=x;i++) {
			point p=new point();
			p.x=(float)(i*2);
			p.y=y-(a*(p.x));
			//System.out.println(p.y);
var newVariable_0 = cx.add(p);		}
		
		for(int i=0;i<=y;i++) {
			point p=new point();
			p.y=(float)i;
			p.x=(y-p.y)/a;
			//System.out.println(p.x);
			boolean same=false;
var newVariable_1 = cx.size();			for(int j=0;j<newVariable_1;j++) {
var newVariable_2 = cx.get(j);var newVariable_3 = cx.get(j);				if(p.x==newVariable_3.x && p.y==newVariable_3.y) {
					same=true;
					//System.out.println(p.x+" "+p.y+"same");
					break;
				}
			}
var newVariable_4 = cx.add(p);			if(same==false)newVariable_4;
		}
		
		System.out.println(cx.size());
	}

}
class point{
	float x=0,y=0;
}

