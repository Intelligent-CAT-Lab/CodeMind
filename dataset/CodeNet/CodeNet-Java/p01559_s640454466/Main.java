import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		new Main().run();
	}

	void run() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] x = new int[M];
		int[] y = new int[M];
		for (int i = 0; i < M; ++i) {
			x[i] = sc.nextInt();
			y[i] = sc.nextInt();
			--x[i];
			--y[i];
		}

		for (int i = 0; i < M; ++i) {
			for (int j = i + 1; j < M; ++j) {
				if (x[i] > x[j] || (x[i] == x[j] && y[i] > y[j])) {
					int tmp = x[i];
					x[i] = x[j];
					x[j] = tmp;
					tmp = y[i];
					y[i] = y[j];
					y[j] = tmp;
				}
			}
		}

		solve(x, y, N, M);
	}

	class P {
		int x, y;

		public P(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}

	static final long MODULO = 1_000_000_000 + 9;
	static int[] dx = { 1, -1, 0, 0 };
	static int[] dy = { 0, 0, 1, -1 };

	void solve(int[] x, int[] y, int N, int M) {
		HashSet<List<Integer>> obstacles = new HashSet<>();
		for (int i = 0; i < M; ++i) {
			obstacles.add(Arrays.asList(x[i], y[i]));
		}
		if (N < 1_000) {
			System.out.println(bruteFroce(0, 0, N - 1, N - 1, M, N, x, y, obstacles));
		} else {
			long[] fac = new long[2 * N - 1];
			long[] inv = new long[2 * N - 1];
			long[] invfac = new long[2 * N - 1];
			fac[0] = 1;
			inv[1] = 1;
			for (int i = 2; i < inv.length; ++i) {
				inv[i] = MODULO - (MODULO / i) * inv[(int) (MODULO % i)] % MODULO;
			}
			for (int i = 1; i < fac.length; ++i) {
				fac[i] = (fac[i - 1] * i) % MODULO;
			}
			invfac[0] = 1;
			for (int i = 1; i < invfac.length; ++i) {
				invfac[i] = invfac[i - 1] * inv[i] % MODULO;
			}
			// --------?????????????¨????-----------------------------

			long[][] cnt1 = new long[M + 1][M + 1];
			long[][] dist1 = new long[M + 1][M + 1];
			long[][] cnt2 = new long[M + 1][M + 1];
			long[][] dist2 = new long[M + 1][M + 1];
			for (int i = 0; i < M + 1; ++i) {
				for (int j = 0; j < M + 1; ++j) {
					dist1[i][j] = Long.MAX_VALUE / 16;
				}
			}
			dist1[0][0] = 0;
			ArrayDeque<P> que = new ArrayDeque<>();
			cnt1[0][0] = 1;
			que.add(new P(0, 0));
			while (!que.isEmpty()) {
				P p = que.poll();
				for (int i = 0; i < 4; ++i) {
					int nx = p.x + dx[i];
					int ny = p.y + dy[i];
					if (nx < 0 || ny < 0 || nx > M || ny > M)
						continue;
					if (obstacles.contains(Arrays.asList(nx, ny)))
						continue;
					if (dist1[nx][ny] >= dist1[p.x][p.y] + 1) {
						cnt1[nx][ny] += cnt1[p.x][p.y];
						if (cnt1[nx][ny] >= MODULO)
							cnt1[nx][ny] -= MODULO;
					}
					if (dist1[nx][ny] > dist1[p.x][p.y] + 1) {
						dist1[nx][ny] = dist1[p.x][p.y] + 1;
						que.add(new P(nx, ny));
					}
				}
			}

			for (int i = 0; i < M + 1; ++i) {
				for (int j = 0; j < M + 1; ++j) {
					dist2[i][j] = Long.MAX_VALUE / 16;
				}
			}
			dist2[0][0] = 0;
			que = new ArrayDeque<>();
			cnt2[0][0] = 1;
			que.add(new P(0, 0));
			while (!que.isEmpty()) {
				P p = que.poll();
				for (int i = 0; i < 4; ++i) {
					int nx = p.x + dx[i];
					int ny = p.y + dy[i];
					if (nx < 0 || ny < 0 || nx > M || ny > M)
						continue;
					if (obstacles.contains(Arrays.asList(N - 1 - nx, N - 1 - ny)))
						continue;
					if (dist2[nx][ny] >= dist2[p.x][p.y] + 1) {
						cnt2[nx][ny] += cnt2[p.x][p.y];
						if (cnt2[nx][ny] >= MODULO)
							cnt2[nx][ny] -= MODULO;
					}
					if (dist2[nx][ny] > dist2[p.x][p.y] + 1) {
						dist2[nx][ny] = dist2[p.x][p.y] + 1;
						que.add(new P(nx, ny));
					}
				}
			}

			long minDist = Long.MAX_VALUE / 16;
			for (int i = 0; i <= M; ++i) {
				int xs = i;
				int ys = M - i;
				for (int j = 0; j <= M; ++j) {
					int xd = N - 1 - j;
					int yd = N - 1 - M + j;
					minDist = Math.min(minDist, dist1[xs][ys] + dist2[N - 1 - xd][N - 1 - yd] + (xd - xs) + (yd - ys));
				}
			}
			long ans = 0;

			for (int i = 0; i <= M; ++i) {
				int xs = i;
				int ys = M - i;
				for (int j = 0; j <= M; ++j) {
					int xd = N - 1 - j;
					int yd = N - 1 - M + j;
					if (minDist == dist1[xs][ys] + dist2[N - 1 - xd][N - 1 - yd] + (xd - xs) + (yd - ys)) {
						ans = (ans + cnt1[xs][ys] * comb(xs, ys, xd, yd, M, N, x, y, fac, invfac, obstacles) % MODULO
								* cnt2[N - 1 - xd][N - 1 - yd] % MODULO) % MODULO;
					}
				}
			}
			System.out.println(ans);
		}
	}

	long bruteFroce(int xs, int ys, int xd, int yd, int M, int N, int[] x, int[] y, HashSet<List<Integer>> obstacles) {

		long[][] cnt = new long[xd - xs + 1][yd - ys + 1];
		long[][] dist = new long[xd - xs + 1][yd - ys + 1];
		for (int i = 0; i < dist.length; ++i) {
			for (int j = 0; j < dist[i].length; ++j) {
				dist[i][j] = Long.MAX_VALUE / 16;
			}
		}
		dist[0][0] = 0;
		ArrayDeque<P> que = new ArrayDeque<>();
		cnt[0][0] = 1;
		que.add(new P(0, 0));
		while (!que.isEmpty()) {
			P p = que.poll();
			for (int i = 0; i < 4; ++i) {
				int nx = p.x + dx[i];
				int ny = p.y + dy[i];
				if (nx < 0 || ny < 0 || nx >= xd - xs + 1 || ny >= yd - ys + 1)
					continue;
				if (obstacles.contains(Arrays.asList(nx + xs, ny + ys)))
					continue;
				if (dist[nx][ny] >= dist[p.x][p.y] + 1) {
					cnt[nx][ny] += cnt[p.x][p.y];
					if (cnt[nx][ny] >= MODULO)
						cnt[nx][ny] -= MODULO;
				}
				if (dist[nx][ny] > dist[p.x][p.y] + 1) {
					dist[nx][ny] = dist[p.x][p.y] + 1;
					que.add(new P(nx, ny));
				}
			}
		}
		return cnt[xd - xs][yd - ys];
	}

	long comb(int xs, int ys, int xd, int yd, int M, int N, int[] x, int[] y, long[] fac, long[] invfac,
			HashSet<List<Integer>> obstacles) {
		if (!smaller(xs, ys, xd, yd)) {
			throw new AssertionError();
		}
		if (obstacles.contains(Arrays.asList(xs, ys)) || obstacles.contains(Arrays.asList(xd, yd))) {
			throw new AssertionError();
		}
		long[] a = new long[M + 1];
		for (int k = 0; k <= M; ++k) {
			if (k != M && !(greater(x[k], y[k], xs, ys) && smaller(x[k], y[k], xd, yd))) {
				continue;
			}
			if (k != M) {
				a[k] = fac[x[k] - xs + y[k] - ys] * invfac[x[k] - xs] % MODULO * invfac[y[k] - ys] % MODULO;
			} else {
				a[k] = fac[xd - xs + yd - ys] * invfac[xd - xs] % MODULO * invfac[yd - ys] % MODULO;
			}

			for (int l = 0; l < M; ++l) {
				if (k != M && !(greater(x[l], y[l], xs, ys) && smaller(x[l], y[l], x[k], y[k]))) {
					continue;
				}
				if (k == M && !(greater(x[l], y[l], xs, ys) && smaller(x[l], y[l], xd, yd))) {
					continue;
				}
				if (k != M)
					a[k] = (a[k] - a[l] * fac[x[k] - x[l] + y[k] - y[l]] % MODULO * invfac[x[k] - x[l]] % MODULO
							* invfac[y[k] - y[l]] % MODULO + MODULO) % MODULO;
				else
					a[M] = (a[M] - a[l] * fac[xd - x[l] + yd - y[l]] % MODULO * invfac[xd - x[l]] % MODULO
							* invfac[yd - y[l]] % MODULO + MODULO) % MODULO;
			}
		}
		return a[M];

	}

	boolean greaterOrEqual(int x1, int y1, int x2, int y2) {
		if (x1 == x2 && y1 == y2) {
			return true;
		}
		if (x1 >= x2 && y1 >= y2) {
			return true;
		}
		return false;
	}

	boolean smallerOrEqual(int x1, int y1, int x2, int y2) {
		if (x1 == x2 && y1 == y2) {
			return true;
		}
		if (x1 <= x2 && y1 <= y2) {
			return true;
		}
		return false;
	}

	boolean greater(int x1, int y1, int x2, int y2) {
		if (x1 == x2 && y1 == y2) {
			return false;
		}
		if (x1 >= x2 && y1 >= y2) {
			return true;
		}
		return false;
	}

	boolean smaller(int x1, int y1, int x2, int y2) {
		if (x1 == x2 && y1 == y2)
			return false;
		if (x1 <= x2 && y1 <= y2) {
			return true;
		}
		return false;
	}

	void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}
}