import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Main {
	static boolean debug = true;

	public static void main(String[] args) throws IOException {

		UserScanner scan = new UserScanner(System.in);
		PrintWriter pwriter = new PrintWriter(System.out);

		int w = scan.nextInt();
		int h = scan.nextInt();
		int v = scan.nextInt();
		int t = scan.nextInt();
		int x = scan.nextInt();
		int y = scan.nextInt();
		int p = scan.nextInt();
		int q = scan.nextInt();
		Wave wave = new Wave(w, h, v, t, x, y, p, q);
		pwriter.println(wave.attack());

		pwriter.flush();

		scan.close();
		System.exit(0);
	}
}

class Wave {
	int w, h, v, t, x, y, p, q;

	public Wave(int w, int h, int v, int t, int x, int y, int p, int q) {
		this.w = w;
		this.h = h;
		this.v = v;
		this.t = t;
		this.x = x;
		this.y = y;
		this.p = p;
		this.q = q;
	}

	public long attack() {
		int maxW, maxH;

		double maxDist = v * t;
		maxDist = maxDist * maxDist;

		for (maxW = 0; getPowDistance(maxW, 0) <= maxDist; maxW++)
			;
		if (maxW == 0)
			return 0;

		// count reachable in w,h are positive
		// ... it means that first reflect wall is right, back
		long ans = maxW;
		int w = maxW - 1;
		for (int h = 1; w >= 0; h++)
			if (getPowDistance(w, h) <= maxDist)
				ans += (w + 1);
			else
				for (w = w - 1; w >= 0; w--)
					if (getPowDistance(w, h) <= maxDist) {
						ans += (w + 1);
						break;
					}

		// same for w is positive, h is negative
		w = maxW - 1;
		for (int h = -1; w >= 0; h--)
			if (getPowDistance(w, h) <= maxDist)
				ans += (w + 1);
			else
				for (w = w - 1; w >= 0; w--)
					if (getPowDistance(w, h) <= maxDist) {
						ans += (w + 1);
						break;
					}
		
		// same for w is negative
		w = -maxW;
		for (int h = 0; w < 0; h++)
			if (getPowDistance(w, h) <= maxDist)
				ans -= w;
			else
				for (w = w + 1; w < 0; w++)
					if (getPowDistance(w, h) <= maxDist) {
						ans -= w;
						break;
					}

		w = -maxW;
		for (int h = -1; w < 0; h--)
			if (getPowDistance(w, h) <= maxDist)
				ans -= w;
			else
				for (w = w + 1; w < 0; w++)
					if (getPowDistance(w, h) <= maxDist) {
						ans -= w;
						break;
					}
		return ans;
	}

	private double getPowDistance(int mx, int my) {
		// get reflected wave distance as powered
		//
		// mx=0,my=0 direct
		// mx=1,my=0 reflect right wall at once
		// ... equal to the distance between (2w-p,q) and (x,y)
		// mx=2,my=0 reflect right wall at once and left wall at once
		// ... equal to the distance between (2w+p,q) and (x,y)
		// mx=3,my=0 reflect right,left,right
		// ... equal to the distance between (4w-p,q) and (x,y)
		// mx=k,my=0 if k is even (k*w + p, q) else (k*w + w - p, q)
		// ... it can apply to negative k
		//
		// mx=0,my=l if l is even (p, l*h + q) else (p, l*h + h - q)
		// ... mx=k,my=l if k and l are even (k*w + p, l*h + q) ...
		double wp = 0, wq = 0;

		if (mx % 2 == 0)
			wp = mx * w + p;
		else
			wp = mx * w + w - p;

		if (my % 2 == 0)
			wq = my * h + q;
		else
			wq = my * h + h - q;

		wp -= x;
		wq -= y;
		return wp * wp + wq * wq;
	}

}

class UserScanner {
	private InputStream in;
	private final byte[] buffer = new byte[1024];
	private int ptr = 0;
	private int buflen = 0;

	public UserScanner(InputStream inStream) {
		in = inStream;
	}

	private void read() {
		ptr = 0;
		try {
			buflen = in.read(buffer);
		} catch (IOException e) {
			e.printStackTrace();
			System.exit(9);
		}
	}

	private byte getByte() {
		if (ptr >= buflen)
			read();
		if (buflen < 0 || isCtlSpace(buffer[ptr])) {
			return -1;
		} else
			return buffer[ptr++];
	}

	private void skipCtlSpace() {
		for (; ptr < buflen; ptr++)
			if (!isCtlSpace(buffer[ptr]))
				return;
		read();
		skipCtlSpace();
	}

	private boolean isCtlSpace(byte b) {
		if (b <= ' ' || b > '~')
			return true;
		else
			return false;
	}

	public void close() {
		try {
			in.close();
		} catch (IOException e) {
			e.printStackTrace();
			System.exit(9);
		}
	}

	public String next() {
		skipCtlSpace();
		StringBuilder sb = new StringBuilder();
		byte b;
		while ((b = getByte()) != -1) {
			sb.appendCodePoint(b);
		}
		return sb.toString();
	}

	public int nextInt() {
		skipCtlSpace();
		int n = 0;
		boolean minus = false;
		byte b;
		while ((b = getByte()) != -1) {
			if (b == '-')
				minus = true;
			else {
				n *= 10;
				n += (b - '0');
			}
		}
		if (minus)
			return n * -1;
		else
			return n;
	}
}