
```java

```
/docs/source/index.rst
.. 2020-01-20-python-to-java documentation master file, created by
   sphinx-quickstart on Mon Jan 20 15:50:04 2020.
   You can adapt this file completely to your liking, but it should at least
   contain the root `toctree` directive.

Welcome to 2020-01-20-python-to-java's documentation!
======
===============================================

.. toctree::
   :maxdepth: 2
   :caption: Contents:

   2020-01-20-python-to-java

Indices and tables
==================

* :ref:`genindex`
* :ref:`modindex`
* :ref:`search`

.. code-block:: python

    import sys
    read = sys.stdin.buffer.read
    readline = sys.stdin.buffer.readline
    readlines = sys.stdin.buffer.readlines

    import numpy as np

    N,M,K = map(int,read().split())

    MOD = 10 ** 9 + 7

    def cumprod(arr,MOD):
        L = len(arr); Lsq = int(L**.5+1)
        arr = np.resize(arr,Lsq**2).reshape(Lsq,Lsq)
        for n in range(1,Lsq):
            arr[:,n] *= arr[:,n-1]; arr[:,n] %= MOD
        for n in range(1,Lsq):
            arr[n] *= arr[n-1,-1]; arr[n] %= MOD
        return arr.ravel()[:L]

    def make_fact(U,MOD):
        x = np.arange(U,dtype=np.int64); x[0] = 1
        fact = cumprod(x,MOD)
        x = np.arange(U,0,-1,dtype=np.int64); x[0] = pow(int(fact[-1]),MOD-2,MOD)
        fact_inv = cumprod(x,MOD)[::-1]
        return fact,fact_inv

    def make_power(a,L,MOD):
        B = L.bit_length()
        x = np.empty(1 + (1<<B),np.int64)
        x[0] = 1; x[1] = a
        for n in range(B):
            x[1<<n:1<<(n+1)] = x[:1<<n] * (a * x[(1<<n)-1] % MOD) % MOD
        return x[:L]

    U = 10 ** 6
    power2 = make_power(2,U,MOD)
    power2_inv = make_power(pow(2,MOD-2,MOD),U,MOD)
    power3 = make_power(3,U,MOD)
    power3_inv = make_power(pow(3,MOD-2,MOD),U,MOD)
    fact,fact_inv = make_fact(U,MOD)

    x = np.zeros(N+M,np.int64)
    x[1:] = (-1) * power2[:N+M-1] * power3_inv[K+1:N+M+K] % MOD
    x[1:] *= fact[K+1:N+M+K] * fact_inv[K] % MOD * fact_inv[1:N+M] % MOD
    x %= MOD
    x[0] = 3 * (1 - power3_inv[K+1]) % MOD * power2_inv[1] % MOD
    np.cumsum(x, out=x); x %= MOD
    x *= power3[:N+M] * power2_inv[:N+M] % MOD; x %= MOD

    coef = fact[N-1:N+M] * fact_inv[:M+1] % MOD * fact_inv[N-1] % MOD
    coef *= power3[K:K+M+1][::-1]; coef %= MOD
    answer = (coef * x[N-1:N+M] % MOD).sum() % MOD
    print(answer)

.. code-block:: java

    import java.io.BufferedReader;
    import java.io.IOException;
    import java.io.InputStreamReader;
    import java.util.Arrays;
    import java.util.StringTokenizer;

    public class Main {
        static int MOD = 1000000007;
        static int U = 1000000;
        static long[] power2, power2_inv, power3, power3_inv, fact, fact_inv;
        static long[] x, coef;

        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());

            power2 = make_power(2, U, MOD);
            power2_inv = make_power(pow(2, MOD - 2, MOD), U, MOD);
            power3 = make_power(3, U, MOD);
            power3_inv = make_
