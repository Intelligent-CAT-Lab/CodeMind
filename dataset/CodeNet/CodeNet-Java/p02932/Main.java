

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;


public class Main {
    public static void main(String[] args) throws Exception {
        boolean local = false;
        boolean async = true;

        Charset charset = Charset.forName("ascii");

        FastIO io = local ? new FastIO(new FileInputStream("D:\\DATABASE\\TESTCASE\\Code.in"), System.out, charset) : new FastIO(System.in, System.out, charset);
        Task task = new Task(io, new Debug(local));

        if (async) {
            Thread t = new Thread(null, task, "skypool", 1 << 27);
            t.setPriority(Thread.MAX_PRIORITY);
            t.start();
            t.join();
        } else {
            task.run();
        }

        if (local) {
            io.cache.append("\n\n--memory -- \n" + ((Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) >> 20) + "M");
        }

        io.flush();
    }

    public static class Task implements Runnable {
        final FastIO io;
        final Debug debug;
        int inf = (int) 1e8;
        long lInf = (long) 1e18;
        double dInf = 1e50;

        public Task(FastIO io, Debug debug) {
            this.io = io;
            this.debug = debug;
        }

        @Override
        public void run() {
            solve();
        }

        NumberTheory.Modular mod = new NumberTheory.Modular((int) 1e9 + 7);
        NumberTheory.Composite comp = new NumberTheory.Composite(1000000, mod);
        NumberTheory.BitOperator bo = new NumberTheory.BitOperator();

        public void solve() {
            int n = io.readInt();
            int m = io.readInt();
            int l = io.readInt();
            int r = io.readInt();

            io.cache.append(solve(n, m, l, r));
        }

        public int solve(int n, int m, int l, int r) {
            //ei
            int lPart = m;
            int rPart = n - m;
            int[] cache1 = new int[r + 1];
            int[] cache2 = new int[r + 1];
            for (int x = 1; x < cache1.length; x++) {
                int localSum = 0;
                for (int j = 0; j <= rPart; j++) {
                    int c = comp.composite(rPart, j);
                    int numberOfX = lPart + j;
                    int sub = numberOfX * x;
                    if ((long)numberOfX * x > r) {
                        break;
                    }
                    int plus = mod.mul(c, mod.subtract(inRange(n, r - sub), inRange(n, l - 1 - sub)));
                    if (bo.bitAt(j, 0) == 1) {
                        plus = -plus;
                    }
                    localSum = mod.plus(localSum, plus);
                }
                cache1[x] = mod.mul(localSum, comp.composite(n, lPart));
            }
            // min{1..M} >= x + 1 and max{M+1...N} < x
            for (int x = 1; x < cache2.length; x++) {
                int localSum = 0;
                for (int j = 0; j <= rPart; j++) {
                    int c = comp.composite(rPart, j);
                    int numberOfX = lPart + j;
                    int sub = numberOfX * x + lPart;
                    if ((long)numberOfX * x + lPart > r) {
                        break;
                    }
                    int plus = mod.mul(c, mod.subtract(inRange(n, r - sub), inRange(n, l - 1 - sub)));
                    if (bo.bitAt(j, 0) == 1) {
                        plus = -plus;
                    }
                    localSum = mod.plus(localSum, plus);
                }
                cache2[x] = mod.mul(localSum, comp.composite(n, lPart));
            }

            int sum = mod.subtract(inRange(n, r), inRange(n, l - 1));
            for (int i = 0; i <= r; i++) {
                int plus = mod.subtract(cache1[i], cache2[i]);
                sum = mod.subtract(sum, plus);
            }

            return sum;
        }


        /**
         * a1 + a2 + ... + an <= m
         */
        public int inRange(int n, int m) {
            return comp.composite(m + n, n);
        }
    }


    public static class NumberTheory {
        private static final Random RANDOM = new Random();

        public static class ExtLucasFactorial {
            int exp;
            int fact;
            int p;
            int pc;
            Modular modular;
            Power power;
            ExtGCD extGCD = new ExtGCD();
            int[] g;

            /**
             * O(pc)
             *
             * @param p  the prime
             * @param pc p^c
             * @param g  buffer
             */
            public ExtLucasFactorial(int p, int pc, int[] g) {
                this.p = p;
                this.pc = pc;
                this.g = g;
                modular = new Modular(pc);
                power = new Power(modular);
                g[0] = 1;
                g[1] = 1;
                for (int i = 2; i <= pc; i++) {
                    if (i % p == 0) {
                        g[i] = g[i - 1];
                    } else {
                        g[i] = modular.mul(g[i - 1], i);
                    }
                }
            }

            /**
             * return m! (mod pc) without any factor which is multiple of p.
             * <br>
             * O(\log_2^2{m})
             */
            private int fact(long m) {
                fact = 1;
                exp = 0;
                while (m > 1) {
                    exp += m / p;
                    fact = modular.mul(fact, power.pow(g[pc], m / pc));
                    fact = modular.mul(fact, g[(int) (m % pc)]);
                    m /= p;
                }
                return fact;
            }

            /**
             * Find C(m,n), it means choose n elements from a set whose size is m.
             * <br>
             * O(\log_2^2{m})
             */
            public int composite(long m, long n) {
                int v = fact(m);
                int e = exp;
                extGCD.extgcd(fact(n), pc);
                v = modular.mul(v, modular.valueOf(extGCD.getX()));
                e -= exp;
                extGCD.extgcd(fact(m - n), pc);
                v = modular.mul(v, modular.valueOf(extGCD.getX()));
                e -= exp;
                v = modular.mul(v, power.pow(p, e));
                return v;
            }
        }

        /**
         * Extend lucas algorithm
         */
        public static class ExtLucas {
            PollardRho pr = new PollardRho();
            Map<Integer, ExtLucasFactorial> factorialMap = new HashMap();

            public ExtLucas(int p) {
                Map<Integer, Integer> factors = pr.findAllFactors(p);
                for (Map.Entry<Integer, Integer> entry : factors.entrySet()) {
                    factorialMap.put(entry.getValue(), new ExtLucasFactorial(entry.getKey(), entry.getValue(), new int[entry.getValue() + 1]));
                }
            }

            /**
             * Get C(m, n) % p
             */
            public int composite(long m, long n) {
                ExtCRT extCRT = new ExtCRT();
                for (Map.Entry<Integer, ExtLucasFactorial> entry : factorialMap.entrySet()) {
                    extCRT.add(entry.getValue().composite(m, n), entry.getKey());
                }
                return (int) extCRT.r;
            }
        }

        /**
         * Extend lucas algorithm long version
         */
        public static class LongExtLucas {
            LongPollardRho pr = new LongPollardRho();
            Map<Integer, ExtLucasFactorial> factorialMap = new HashMap();

            public LongExtLucas(long p) {
                Map<Long, Long> factors = pr.findAllFactors(p);
                for (Map.Entry<Long, Long> entry : factors.entrySet()) {
                    factorialMap.put(entry.getValue().intValue(), new ExtLucasFactorial(entry.getKey().intValue(), entry.getValue().intValue(), new int[entry.getValue().intValue() + 1]));
                }
            }

            /**
             * Get C(m, n) % p
             */
            public int composite(long m, long n) {
                ExtCRT extCRT = new ExtCRT();
                for (Map.Entry<Integer, ExtLucasFactorial> entry : factorialMap.entrySet()) {
                    extCRT.add(entry.getValue().composite(m, n), entry.getKey());
                }
                return (int) extCRT.r;
            }
        }

        /**
         * Extend gcd
         */
        public static class ExtGCD {
            private long x;
            private long y;
            private long g;

            public long getX() {
                return x;
            }

            public long getY() {
                return y;
            }

            /**
             * Get g = Gcd(a, b) and find a way to set x and y to match ax+by=g
             */
            public long extgcd(long a, long b) {
                if (a >= b) {
                    g = extgcd0(a, b);
                } else {
                    g = extgcd0(b, a);
                    long tmp = x;
                    x = y;
                    y = tmp;
                }
                return g;
            }


            private long extgcd0(long a, long b) {
                if (b == 0) {
                    x = 1;
                    y = 0;
                    return a;
                }
                long g = extgcd0(b, a % b);
                long n = x;
                long m = y;
                x = m;
                y = n - m * (a / b);
                return g;
            }
        }

        public static class Gcd {
            public long gcd(long a, long b) {
                return a >= b ? gcd0(a, b) : gcd0(b, a);
            }

            private long gcd0(long a, long b) {
                return b == 0 ? a : gcd0(b, a % b);
            }

            public int gcd(int a, int b) {
                return a >= b ? gcd0(a, b) : gcd0(b, a);
            }

            private int gcd0(int a, int b) {
                return b == 0 ? a : gcd0(b, a % b);
            }
        }

        /**
         * Euler sieve for filter primes
         */
        public static class EulerSieve {
            int[] primes;
            boolean[] isComp;
            int primeLength;

            public EulerSieve(int limit) {
                isComp = new boolean[limit + 1];
                primes = new int[limit + 1];
                primeLength = 0;
                for (int i = 2; i <= limit; i++) {
                    if (!isComp[i]) {
                        primes[primeLength++] = i;
                    }
                    for (int j = 0, until = limit / i; j < primeLength && primes[j] <= until; j++) {
                        int pi = primes[j] * i;
                        isComp[pi] = true;
                        if (i % primes[j] == 0) {
                            break;
                        }
                    }
                }
            }
        }

        /**
         * Euler sieve for multiplicative function
         */
        public static class MultiplicativeFunctionSieve {
            int[] primes;
            boolean[] isComp;
            int primeLength;
            int[] mobius;
            int[] euler;
            int[] factors;
            int[] smallestPrimeFactor;
            int[] numberOfSmallestPrimeFactor;

            public MultiplicativeFunctionSieve(int limit, boolean enableMobius, boolean enableEuler, boolean enableFactors) {
                isComp = new boolean[limit + 1];
                primes = new int[limit + 1];
                numberOfSmallestPrimeFactor = new int[limit + 1];
                smallestPrimeFactor = new int[limit + 1];
                primeLength = 0;
                for (int i = 2; i <= limit; i++) {
                    if (!isComp[i]) {
                        primes[primeLength++] = i;
                        numberOfSmallestPrimeFactor[i] = smallestPrimeFactor[i] = i;
                    }
                    for (int j = 0, until = limit / i; j < primeLength && primes[j] <= until; j++) {
                        int pi = primes[j] * i;
                        smallestPrimeFactor[pi] = primes[j];
                        numberOfSmallestPrimeFactor[pi] = smallestPrimeFactor[i] == primes[j]
                                ? (numberOfSmallestPrimeFactor[i] * numberOfSmallestPrimeFactor[primes[j]])
                                : numberOfSmallestPrimeFactor[primes[j]];
                        isComp[pi] = true;
                        if (i % primes[j] == 0) {
                            break;
                        }
                    }
                }

                if (enableMobius) {
                    mobius = new int[limit + 1];
                    mobius[1] = 1;
                    for (int i = 2; i <= limit; i++) {
                        if (!isComp[i]) {
                            mobius[i] = -1;
                        } else {
                            if (numberOfSmallestPrimeFactor[i] != smallestPrimeFactor[i]) {
                                mobius[i] = 0;
                            } else {
                                mobius[i] = mobius[numberOfSmallestPrimeFactor[i]] *
                                        mobius[i / numberOfSmallestPrimeFactor[i]];
                            }
                        }
                    }
                }

                if (enableEuler) {
                    euler = new int[limit + 1];
                    euler[1] = 1;
                    for (int i = 2; i <= limit; i++) {
                        if (!isComp[i]) {
                            euler[i] = i - 1;
                        } else {
                            if (numberOfSmallestPrimeFactor[i] == i) {
                                euler[i] = i - i / smallestPrimeFactor[i];
                            } else {
                                euler[i] = euler[numberOfSmallestPrimeFactor[i]] *
                                        euler[i / numberOfSmallestPrimeFactor[i]];
                            }
                        }
                    }
                }

                if (enableFactors) {
                    factors = new int[limit + 1];
                    factors[1] = 1;
                    for (int i = 2; i <= limit; i++) {
                        if (!isComp[i]) {
                            factors[i] = 2;
                        } else {
                            if (numberOfSmallestPrimeFactor[i] == i) {
                                factors[i] = 1 + factors[i / smallestPrimeFactor[i]];
                            } else {
                                factors[i] = factors[numberOfSmallestPrimeFactor[i]] *
                                        factors[i / numberOfSmallestPrimeFactor[i]];
                            }
                        }
                    }
                }
            }
        }

        /**
         * Mod operations
         */
        public static class Modular {
            int m;

            public Modular(int m) {
                this.m = m;
            }

            public int valueOf(int x) {
                x %= m;
                if (x < 0) {
                    x += m;
                }
                return x;
            }

            public int valueOf(long x) {
                x %= m;
                if (x < 0) {
                    x += m;
                }
                return (int) x;
            }

            public int mul(int x, int y) {
                return valueOf((long) x * y);
            }

            public int mul(long x, long y) {
                x = valueOf(x);
                y = valueOf(y);
                return valueOf(x * y);
            }

            public int plus(int x, int y) {
                return valueOf(x + y);
            }

            public int plus(long x, long y) {
                x = valueOf(x);
                y = valueOf(y);
                return valueOf(x + y);
            }

            public int subtract(int x, int y) {
                return valueOf(x - y);
            }

            public int subtract(long x, long y) {
                return valueOf(x - y);
            }

            @Override
            public String toString() {
                return "mod " + m;
            }
        }

        /**
         * Bit operations
         */
        public static class BitOperator {
            public int bitAt(int x, int i) {
                return (x >> i) & 1;
            }

            public int bitAt(long x, int i) {
                return (int) ((x >> i) & 1);
            }

            public int setBit(int x, int i, boolean v) {
                if (v) {
                    x |= 1 << i;
                } else {
                    x &= ~(1 << i);
                }
                return x;
            }

            public long setBit(long x, int i, boolean v) {
                if (v) {
                    x |= 1L << i;
                } else {
                    x &= ~(1L << i);
                }
                return x;
            }

            public long swapBit(long x, int i, int j) {
                int bi = bitAt(x, i);
                int bj = bitAt(x, j);
                x = setBit(x, i, bj == 1);
                x = setBit(x, j, bi == 1);
                return x;
            }

            public int swapBit(int x, int i, int j) {
                int bi = bitAt(x, i);
                int bj = bitAt(x, j);
                x = setBit(x, i, bj == 1);
                x = setBit(x, j, bi == 1);
                return x;
            }

            /**
             * Determine whether x is subset of y
             */
            public boolean subset(long x, long y) {
                return intersect(x, y) == x;
            }

            /**
             * Merge two set
             */
            public long merge(long x, long y) {
                return x | y;
            }

            public long intersect(long x, long y) {
                return x & y;
            }

            public long differ(long x, long y) {
                return x - intersect(x, y);
            }
        }

        /**
         * Power operations
         */
        public static class Power {
            public Modular getModular() {
                return modular;
            }

            final Modular modular;

            public Power(Modular modular) {
                this.modular = modular;
            }

            public int pow(int x, long n) {
                if (n == 0) {
                    return 1;
                }
                long r = pow(x, n >> 1);
                r = modular.valueOf(r * r);
                if ((n & 1) == 1) {
                    r = modular.valueOf(r * x);
                }
                return (int) r;
            }

            public int inverse(int x) {
                return pow(x, modular.m - 2);
            }

            public int pow2(int x) {
                return x * x;
            }

            public long pow2(long x) {
                return x * x;
            }

            public double pow2(double x) {
                return x * x;
            }
        }

        /**
         * Log operations
         */
        public static class Log2 {
            public int ceilLog(int x) {
                return 32 - Integer.numberOfLeadingZeros(x - 1);
            }

            public int floorLog(int x) {
                return 31 - Integer.numberOfLeadingZeros(x);
            }

            public int ceilLog(long x) {
                return 64 - Long.numberOfLeadingZeros(x - 1);
            }

            public int floorLog(long x) {
                return 63 - Long.numberOfLeadingZeros(x);
            }
        }

        /**
         * Find all inverse number
         */
        public static class InverseNumber {
            int[] inv;

            public InverseNumber(int[] inv, int limit, Modular modular) {
                this.inv = inv;
                inv[1] = 1;
                int p = modular.m;
                for (int i = 2; i <= limit; i++) {
                    int k = p / i;
                    int r = p % i;
                    inv[i] = modular.mul(-k, inv[r]);
                }
            }

            public InverseNumber(int limit, Modular modular) {
                this(new int[limit + 1], limit, modular);
            }
        }

        /**
         * Factorial
         */
        public static class Factorial {
            int[] fact;
            int[] inv;

            public Factorial(int[] fact, int[] inv, InverseNumber in, int limit, Modular modular) {
                this.fact = fact;
                this.inv = inv;
                fact[0] = inv[0] = 1;
                for (int i = 1; i <= limit; i++) {
                    fact[i] = modular.mul(fact[i - 1], i);
                    inv[i] = modular.mul(inv[i - 1], in.inv[i]);
                }
            }

            public Factorial(int limit, Modular modular) {
                this(new int[limit + 1], new int[limit + 1], new InverseNumber(limit, modular), limit, modular);
            }
        }

        /**
         * Composition
         */
        public static class Composite {
            final Factorial factorial;
            final Modular modular;

            public Composite(Factorial factorial, Modular modular) {
                this.factorial = factorial;
                this.modular = modular;
            }

            public Composite(int limit, Modular modular) {
                this(new Factorial(limit, modular), modular);
            }

            public int composite(int m, int n) {
                if (n > m) {
                    return 0;
                }
                return modular.mul(modular.mul(factorial.fact[m], factorial.inv[n]), factorial.inv[m - n]);
            }
        }

        /**
         * Test whether a number is primes
         */
        public static class MillerRabin {
            Modular modular;
            Power power;

            /**
             * Check whether n is a prime s times
             */
            public boolean mr(int n, int s) {
                if (n == 2) {
                    return true;
                }
                if (n % 2 == 0) {
                    return false;
                }
                modular = new Modular(n);
                power = new Power(modular);
                for (int i = 0; i < s; i++) {
                    int x = RANDOM.nextInt(n - 2) + 2;
                    if (!mr0(x, n)) {
                        return false;
                    }
                }
                return true;
            }

            private boolean mr0(int x, int n) {
                int exp = n - 1;
                while (true) {
                    int y = power.pow(x, exp);
                    if (y != 1 && y != n - 1) {
                        return false;
                    }
                    if (y != 1 || exp % 2 == 1) {
                        break;
                    }
                    exp = exp / 2;
                }
                return true;
            }
        }

        /**
         * Modular operation for long version
         */
        public static class LongModular {
            final long m;

            public LongModular(long m) {
                this.m = m;
            }

            public long mul(long a, long b) {
                return b == 0 ? 0 : ((mul(a, b >> 1) << 1) % m + a * (b & 1)) % m;
            }

            public long plus(long a, long b) {
                return valueOf(a + b);
            }

            public long valueOf(long a) {
                a %= m;
                if (a < 0) {
                    a += m;
                }
                return a;
            }
        }

        public static class LongPower {
            final LongModular modular;

            public LongPower(LongModular modular) {
                this.modular = modular;
            }

            long pow(long x, long n) {
                if (n == 0) {
                    return 1;
                }
                long r = pow(x, n >> 1);
                r = modular.mul(r, r);
                if ((n & 1) == 1) {
                    r = modular.mul(r, x);
                }
                return r;
            }

            long inverse(long x) {
                return pow(x, modular.m - 2);
            }
        }

        /**
         * Test whether a number is primes
         */
        public static class LongMillerRabin {
            LongModular modular;
            LongPower power;

            /**
             * Check whether n is a prime s times
             */
            public boolean mr(long n, int s) {
                if (n == 2) {
                    return true;
                }
                if (n % 2 == 0) {
                    return false;
                }
                modular = new LongModular(n);
                power = new LongPower(modular);
                for (int i = 0; i < s; i++) {
                    long x = (long) (RANDOM.nextDouble() * (n - 2) + 2);
                    if (!mr0(x, n)) {
                        return false;
                    }
                }
                return true;
            }

            private boolean mr0(long x, long n) {
                long exp = n - 1;
                while (true) {
                    long y = power.pow(x, exp);
                    if (y != 1 && y != n - 1) {
                        return false;
                    }
                    if (y != 1 || exp % 2 == 1) {
                        break;
                    }
                    exp = exp / 2;
                }
                return true;
            }
        }

        public static class LongPollardRho {
            LongMillerRabin mr = new LongMillerRabin();
            Gcd gcd = new Gcd();
            LongModular modular;

            /**
             * Find a factor of n, if n is returned, it means n is 1 or a prime
             */
            public long findFactor(long n) {
                if (mr.mr(n, 3)) {
                    return n;
                }
                modular = new LongModular(n);
                while (true) {
                    long f = findFactor0((long) (RANDOM.nextDouble() * n), (long) (RANDOM.nextDouble() * n), n);
                    if (f != -1) {
                        return f;
                    }
                }
            }

            private long findFactor0(long x, long c, long n) {
                long xi = x;
                long xj = x;
                int j = 2;
                int i = 1;
                while (i < n) {
                    i++;
                    xi = modular.plus(modular.mul(xi, xi), c);
                    long g = gcd.gcd(n, Math.abs(xi - xj));
                    if (g != 1 && g != n) {
                        return g;
                    }
                    if (i == j) {
                        j = j << 1;
                        xj = xi;
                    }
                }
                return -1;
            }

            /**
             * Find the representation of n=p1^c1 * p2^c2 * ... * pm ^ cm.
             * <br>
             * The returned map contained such entries: pi -> pi^ci
             */
            public Map<Long, Long> findAllFactors(long n) {
                Map<Long, Long> map = new HashMap();
                findAllFactors(map, n);
                return map;
            }

            private void findAllFactors(Map<Long, Long> map, long n) {
                if (n == 1) {
                    return;
                }
                long f = findFactor(n);
                if (f == n) {
                    Long value = map.get(f);
                    if (value == null) {
                        value = 1L;
                    }
                    map.put(f, value * f);
                    return;
                }
                findAllFactors(map, f);
                findAllFactors(map, n / f);
            }

        }

        /**
         * Extend chinese remainder theory
         */
        public static class ExtCRT {
            /**
             * remainder
             */
            long r;
            /**
             * modulus
             */
            long m;
            ExtGCD gcd = new ExtGCD();

            public ExtCRT() {
                r = 0;
                m = 1;
            }

            /**
             * Add a new condition: x % m = r
             */
            public boolean add(long r, long m) {
                long m1 = this.m;
                long x1 = this.r;
                long m2 = m;
                long x2 = ((r % m) + m) % m;
                long g = gcd.extgcd(m1, m2);
                long a = gcd.getX();
                if ((x2 - x1) % g != 0) {
                    return false;
                }
                this.m = m1 / g * m2;
                this.r = BigInteger.valueOf(a).multiply(BigInteger.valueOf((x2 - x1) / g))
                        .multiply(BigInteger.valueOf(m1)).add(BigInteger.valueOf(x1))
                        .mod(BigInteger.valueOf(this.m)).longValue();
                return true;
            }
        }

        /**
         * Lucas algorithm
         */
        public static class Lucas {
            private final Composite composite;
            private int modulus;

            public Lucas(Composite composite) {
                this.composite = composite;
                this.modulus = composite.modular.m;
            }

            public int composite(long m, long n) {
                if (n == 0) {
                    return 1;
                }
                return composite.modular.mul(composite.composite((int) (m % modulus), (int) (n % modulus)),
                        composite(m / modulus, n / modulus));
            }
        }

        /**
         * Find all factors of a number
         */
        public static class PollardRho {
            MillerRabin mr = new MillerRabin();
            Gcd gcd = new Gcd();
            Random random = new Random();

            public int findFactor(int n) {
                if (mr.mr(n, 10)) {
                    return n;
                }
                while (true) {
                    int f = findFactor0(random.nextInt(n), random.nextInt(n), n);
                    if (f != -1) {
                        return f;
                    }
                }
            }

            /**
             * Find all prime factor of n
             * <br>
             * p1 => p1^c1
             * <br>
             * ...
             * <br>
             * pk => pk^ck
             */
            public Map<Integer, Integer> findAllFactors(int n) {
                Map<Integer, Integer> map = new HashMap();
                findAllFactors(map, n);
                return map;
            }

            private void findAllFactors(Map<Integer, Integer> map, int n) {
                if (n == 1) {
                    return;
                }
                int f = findFactor(n);
                if (f == n) {
                    Integer value = map.get(f);
                    if (value == null) {
                        value = 1;
                    }
                    map.put(f, value * f);
                    return;
                }
                findAllFactors(map, f);
                findAllFactors(map, n / f);
            }

            private int findFactor0(int x, int c, int n) {
                int xi = x;
                int xj = x;
                int j = 2;
                int i = 1;
                while (i < n) {
                    i++;
                    xi = (int) ((long) xi * xi + c) % n;
                    int g = gcd.gcd(n, Math.abs(xi - xj));
                    if (g != 1 && g != n) {
                        return g;
                    }
                    if (i == j) {
                        j = j << 1;
                        xj = xi;
                    }
                }
                return -1;
            }
        }

        public static class ModExpression {
            ExtGCD extGCD = new ExtGCD();
            Modular modular = new Modular(1);

            /**
             * Find ka=b(mod c) where k is the minimum possible non negative integer.
             * <br>
             * If it's impossible, -1 will be returned.
             */
            public long solve(long a, long b, int c) {
                modular.m = c;
                a = modular.valueOf(a);
                b = modular.valueOf(b);
                int g = (int) extGCD.extgcd((int) a, c);
                if (b % g != 0) {
                    return -1;
                }
                modular.m = c / g;
                return modular.valueOf(b / g * extGCD.getX());
            }
        }

        /**
         * \sum_{i=1}^{limit}f(\lfloor n/i \rfloor)
         */
        public static class FloorDivisionOptimizer {
            int l;
            int r;
            int n;
            int limit;


            public FloorDivisionOptimizer(int n, int l, int limit) {
                this.n = n;
                this.l = 0;
                this.limit = limit;
                this.r = l - 1;
            }

            public boolean hasNext() {
                return r < limit;
            }

            public int next() {
                l = r + 1;
                r = n / (n / l);
                return n / l;
            }
        }


        public static class QuadraticResidue {
            final Modular modular;
            final BitOperator bitOperator = new BitOperator();
            Power power;
            final PollardRho rho = new PollardRho();


            public QuadraticResidue(Modular modular) {
                this.modular = modular;
                power = new Power(modular);
            }

            /**
             * return \sqrt{n} or -1 if it doesn't exist
             */
            public int square(int n) {
                n = modular.valueOf(n);
                if (n == 0) {
                    return 0;
                }
                int p = modular.m;
                if (power.pow(n, (p - 1) / 2) != 1) {
                    return -1;
                }
                while (true) {
                    int a = RANDOM.nextInt(p);
                    int w = modular.plus(modular.mul(a, a), -n);
                    if (power.pow(w, (p - 1) / 2) == 1) {
                        continue;
                    }


                    int pow = (p + 1) / 2;
                    int i = 31 - Integer.numberOfLeadingZeros(pow);
                    int real = 1;
                    int img = 0;
                    for (; i >= 0; i--) {
                        int nReal = modular.plus(modular.mul(real, real),
                                modular.mul(modular.mul(img, img), w));
                        int nImg = modular.mul(modular.mul(real, img), 2);
                        real = nReal;
                        img = nImg;
                        if (bitOperator.bitAt(pow, i) == 1) {
                            nReal = modular.plus(modular.mul(real, a), modular.mul(img, w));
                            nImg = modular.plus(modular.mul(img, a), real);
                            real = nReal;
                            img = nImg;
                        }
                    }

                    return real;
                }
            }

            public int minPrimitiveRoot() {
                if (modular.m == 2) {
                    return 1;
                }
                Map<Integer, Integer> factorMap = rho.findAllFactors(modular.m - 1);
                int[] factors = factorMap.keySet().stream().mapToInt(Integer::intValue).toArray();
                for (int i = 2; ; i++) {
                    boolean valid = true;
                    for (int factor : factors) {
                        if (power.pow(i, (modular.m - 1) / factor) == 1) {
                            valid = false;
                            break;
                        }
                    }
                    if (valid) {
                        return i;
                    }
                }
            }
        }
    }

    public static class FastIO {
        public final StringBuilder cache = new StringBuilder(20 << 20);
        private final InputStream is;
        private final OutputStream os;
        private final Charset charset;
        private StringBuilder defaultStringBuf = new StringBuilder(1 << 8);
        private byte[] buf = new byte[1 << 20];
        private int bufLen;
        private int bufOffset;
        private int next;

        public FastIO(InputStream is, OutputStream os, Charset charset) {
            this.is = is;
            this.os = os;
            this.charset = charset;
        }

        public FastIO(InputStream is, OutputStream os) {
            this(is, os, Charset.forName("ascii"));
        }

        private int read() {
            while (bufLen == bufOffset) {
                bufOffset = 0;
                try {
                    bufLen = is.read(buf);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                if (bufLen == -1) {
                    return -1;
                }
            }
            return buf[bufOffset++];
        }

        public void skipBlank() {
            while (next >= 0 && next <= 32) {
                next = read();
            }
        }

        public int readInt() {
            int sign = 1;

            skipBlank();
            if (next == '+' || next == '-') {
                sign = next == '+' ? 1 : -1;
                next = read();
            }

            int val = 0;
            if (sign == 1) {
                while (next >= '0' && next <= '9') {
                    val = val * 10 + next - '0';
                    next = read();
                }
            } else {
                while (next >= '0' && next <= '9') {
                    val = val * 10 - next + '0';
                    next = read();
                }
            }

            return val;
        }

        public long readLong() {
            int sign = 1;

            skipBlank();
            if (next == '+' || next == '-') {
                sign = next == '+' ? 1 : -1;
                next = read();
            }

            long val = 0;
            if (sign == 1) {
                while (next >= '0' && next <= '9') {
                    val = val * 10 + next - '0';
                    next = read();
                }
            } else {
                while (next >= '0' && next <= '9') {
                    val = val * 10 - next + '0';
                    next = read();
                }
            }

            return val;
        }

        public double readDouble() {
            boolean sign = true;
            skipBlank();
            if (next == '+' || next == '-') {
                sign = next == '+';
                next = read();
            }

            long val = 0;
            while (next >= '0' && next <= '9') {
                val = val * 10 + next - '0';
                next = read();
            }
            if (next != '.') {
                return sign ? val : -val;
            }
            next = read();
            long radix = 1;
            long point = 0;
            while (next >= '0' && next <= '9') {
                point = point * 10 + next - '0';
                radix = radix * 10;
                next = read();
            }
            double result = val + (double) point / radix;
            return sign ? result : -result;
        }

        public String readString(StringBuilder builder) {
            skipBlank();

            while (next > 32) {
                builder.append((char) next);
                next = read();
            }

            return builder.toString();
        }

        public String readString() {
            defaultStringBuf.setLength(0);
            return readString(defaultStringBuf);
        }

        public int readLine(char[] data, int offset) {
            int originalOffset = offset;
            while (next != -1 && next != '\n') {
                data[offset++] = (char) next;
                next = read();
            }
            return offset - originalOffset;
        }

        public int readString(char[] data, int offset) {
            skipBlank();

            int originalOffset = offset;
            while (next > 32) {
                data[offset++] = (char) next;
                next = read();
            }

            return offset - originalOffset;
        }

        public int readString(byte[] data, int offset) {
            skipBlank();

            int originalOffset = offset;
            while (next > 32) {
                data[offset++] = (byte) next;
                next = read();
            }

            return offset - originalOffset;
        }

        public char readChar() {
            skipBlank();
            char c = (char) next;
            next = read();
            return c;
        }

        public void flush() {
            try {
                os.write(cache.toString().getBytes(charset));
                os.flush();
                cache.setLength(0);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        public boolean hasMore() {
            skipBlank();
            return next != -1;
        }
    }

    public static class Debug {
        private boolean allowDebug;

        public Debug(boolean allowDebug) {
            this.allowDebug = allowDebug;
        }

        public void assertTrue(boolean flag) {
            if (!allowDebug) {
                return;
            }
            if (!flag) {
                fail();
            }
        }

        public void fail() {
            throw new RuntimeException();
        }

        public void assertFalse(boolean flag) {
            if (!allowDebug) {
                return;
            }
            if (flag) {
                fail();
            }
        }

        private void outputName(String name) {
            System.out.print(name + " = ");
        }

        public void debug(String name, int x) {
            if (!allowDebug) {
                return;
            }

            outputName(name);
            System.out.println("" + x);
        }

        public void debug(String name, long x) {
            if (!allowDebug) {
                return;
            }
            outputName(name);
            System.out.println("" + x);
        }

        public void debug(String name, double x) {
            if (!allowDebug) {
                return;
            }
            outputName(name);
            System.out.println("" + x);
        }

        public void debug(String name, int[] x) {
            if (!allowDebug) {
                return;
            }
            outputName(name);
            System.out.println(Arrays.toString(x));
        }

        public void debug(String name, long[] x) {
            if (!allowDebug) {
                return;
            }
            outputName(name);
            System.out.println(Arrays.toString(x));
        }

        public void debug(String name, double[] x) {
            if (!allowDebug) {
                return;
            }
            outputName(name);
            System.out.println(Arrays.toString(x));
        }

        public void debug(String name, Object x) {
            if (!allowDebug) {
                return;
            }
            outputName(name);
            System.out.println("" + x);
        }

        public void debug(String name, Object... x) {
            if (!allowDebug) {
                return;
            }
            outputName(name);
            System.out.println(Arrays.deepToString(x));
        }
    }
}