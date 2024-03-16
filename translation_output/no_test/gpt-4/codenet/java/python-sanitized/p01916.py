import sys
import io

class p01916:
    def solve(self):
        s = input()
        
        a = [0] * 26
        b = [0] * 1111
        
        for char in s:
            a[ord(char) - ord('a')] += 1

        for val in a:
            b[val] += 1
        
        for i in range(999, -1, -2):
            if b[i] > 0:
                b[i] -= 1
                break

        m = 0
        
        for i in range(1, 1001, 2):
            m += b[i]
        
        if m % 2 == 0:
            print(m // 2)
        else:
            print(m // 2 + 1)
    
    def run(self):
        self.solve()

if __name__ == '__main__':
    # As Python supports multithreading but does not support starting a thread with a specified stack size and also has a GIL (Global Interpreter Lock),
    # the Java thread initialization with a specific stack size is not directly translatable or necessary in Python.
    # We can simply call the run method of the class instance.
    # Increase the recursion limit and buffer size for large inputs as specified in the Java program if needed.
    sys.setrecursionlimit(int(64 * 1024 * 1024))
    io.DEFAULT_BUFFER_SIZE = 2048
    p01916().run()