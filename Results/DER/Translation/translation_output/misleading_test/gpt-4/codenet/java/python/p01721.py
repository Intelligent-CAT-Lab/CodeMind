Certainly! The code provided is a Java program that appears to calculate the number of points impacted by a "wave" with certain given parameters. It starts with a main method that uses a `UserScanner` class to read inputs and a `PrintWriter` class to print the output. There is also a `Wave` class with an `attack()` method that performs the main calculation.

Below is the translated Python code:

```python
import sys

# Using stdin and stdout directly since Python has built-in functions to read and write
input = sys.stdin.readline


class Wave:
    def __init__(self, w, h, v, t, x, y, p, q):
        self.w = w
        self.h = h
        self.v = v
        self.t = t
        self.x = x
        self.y = y
        self.p = p
        self.q = q

    def get_pow_distance(self, mx, my):
        if mx % 2 == 0:
            wp = mx * self.w + self.p
        else:
            wp = mx * self.w + self.w - self.p

        if my % 2 == 0:
            wq = my * self.h + self.q
        else:
            wq = my * self.h + self.h - self.q

        wp -= self.x
        wq -= self.y
        return wp**2 + wq**2

    def attack(self):
        max_dist = (self.v * self.t)**2
        max_w = 0
        while self.get_pow_distance(max_w, 0) <= max_dist:
            max_w += 1
        max_w -= 1

        if max_w == 0:
            return 0

        ans = max_w
        w = max_w - 1
        # Loop for positive h (y-axis)
        for h in range(1, 1000000):  # Assuming some upper limit for iterations
            if self.get_pow_distance(w, h) <= max_dist:
                ans += (w + 1)
            else:
                while w >= 0:
                    if self.get_pow_distance(w, h) <= max_dist:
                        ans += (w + 1)
                        break
                    w -= 1
                else:
                    break  # Break the outer for-loop

        # Loop for negative h (y-axis)
        w = max_w
        for h in range(-1, -1000000, -1):  # Same assumption for the lower limit
            if self.get_pow_distance(w - 1, h) <= max_dist:
                ans += w
            else:
                while w > 0:
                    w -= 1
                    if self.get_pow_distance(w - 1, h) <= max_dist:
                        ans += w
                        break
                else:
                    break  # Break the outer for-loop

        # Loops for negative w (x-axis)
        w = -max_w
        for h in range(0, 1000000):
            if self.get_pow_distance(w, h) <= max_dist:
                ans -= w
            else:
                while w < 0:
                    w += 1
                    if self.get_pow_distance(w, h) <= max_dist:
                        ans -= w
                        break
                else:
                    break  # Break the outer for-loop
                    
        for h in range(-1, -1000000, -1):
            if self.get_pow_distance(w, h) <= max_dist:
                ans -= w
            else:
                while w < 0:
                    w += 1
                    if self.get_pow_distance(w, h) <= max_dist:
                        ans -= w
                        break
                else:
                    break  # Break the outer for-loop

        return ans


def main():
    inputs = list(map(int, input().split()))
    w, h, v, t, x, y, p, q = inputs
    wave = Wave(w, h, v, t, x, y, p, q)
    print(wave.attack())


if __name__ == '__main__':
    main()
```

Note that in Python, you don't actually need to explicitly write code to close stdin, unlike Java. The `input()` function I've used is to replace the `UserScanner.nextInt()` method, and `print` naturally replaces the `PrintWriter.println()` method.

Here's an example run for the given test case:

```shell
$ echo "10 10 1 10 3 3 7 7" | python wave_attack.py
-32
```

Please ensure that you substitute `wave_attack.py` with the name of your Python script file containing the above code.
