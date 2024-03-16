/atcoder/abc/abc150/abc150_c.py
import itertools

N = int(input())
P = tuple(map(int, input().split()))
Q = tuple(map(int, input().split()))

l = list(itertools.permutations(range(1, N + 1)))

print(abs(l.index(P) - l.index(Q)))
/atcoder/abc/a
bc150/abc150_b.py
N = int(input())
S = input()

print(S.count("ABC"))/atcoder/abc/abc150/abc150_a.py
K, X = map(int, input().split())

print("Yes" if 500 * K >= X else "No")
/atcoder/abc/abc150/abc150_d.py
import fractions

N, M = map(int, input().split(
))
A = list(map(int, input().split()))

for i in range(N):
    A[i] //= 2

if any(a % 2 == 0 for a in A):
    print(0)
    exit()

lcm = A[0]
for i in range(1, N):
    lcm = lcm * A[i] // fractions.gcd(lcm, A[i])

if lcm * 2 > M:
    print(0)
    exit()

print((M // lcm + 1) // 2)

# 2で割れる数の個数が奇数ならば、2で割った数の個数が偶数になる
# 2で割れる数の個数が偶数ならば、2で割った数の個数が奇数になる/atcoder/abc/abc150/abc150_e.py
import fractions

N = int(input())
A = list(map(int, input().split()))

MOD = 10 ** 9 + 7

A.sort()

ans = 0
for i in range(N):
    ans += A[i] * pow(100, i, MOD) * 
print(ans % MOD)
pow(100, N - i - 1, MOD) * pow(2, N - i - 1, MOD)
    ans %= MOD

for i in range(N - 1):
    for j in range(i + 1, N):
        ans -= A[i] * A[j] * pow(100, i, MOD) * pow(100, j, MOD) * pow(2, N - 2, MOD)
        ans %= MOD
/atcoder/abc/abc150/abc150_d.cpp
#include <bits/stdc++.h>
using namespace std;

int main() {
  int N, M;
  cin >> N >> M;
  vector<int> A(N);
  for (int i = 0; i < N; i++) {
    cin >> A[i];
    A[i] /= 2;
  }

  if (any_of(A.begin(), A.end(), [](int a) { return a % 2 == 0; })) {
    cout << 0 << endl;
    return 0;
  }

  int lcm = A[0];
  for (int i = 1; i < N; i++) {
    lcm = lcm * A[i] / __gcd(lcm, A[i]);
  }

  if (lcm * 2 > M) {
    cout << 0 << endl;
    return 0;
  }

  cout << (M / lcm + 1) / 2 << endl;
}
/atcoder/abc/abc150/abc150_c.cpp
#include <bits/stdc++.h>
using namespace std;

int ) {
  int N;
  cin >> N;
  vector<int> P(N), Q(N);
  for (int i = 0; i < N; i++) {
    cin >> P[i];
  }
  for (int i = 0; i < N; i++) {
    cin >> Q[i];
  }

  vector<vector<int>> l;
  for (int i = 0; i < N; i++) {
    vector<int> v(N);
    iota(v.begin(), v.end(), 1);
    do {
      l.push_back(v);
    } while (next_permutation(v.begin(), v.end()));
  }

  cout << abs(find(l.begin(), l.end(), P) - find(l.begin(), l.end(), Q))
       << endl;
}
main(