import sys
import math

class FastReader:
    def __init__(self):
        self.reader = sys.stdin
        self.st = []

    def next(self):
        while not self.st:
            self.st = self.reader.readline().split()
        return self.st.pop(0)

    def next_line(self):
        return self.reader.readline()

    def next_int(self):
        return int(self.next())

    def next_double(self):
        return float(self.next())

    def int_array(self, size):
        arr = [0] * size
        for i in range(size):
            arr[i] = self.next_int()
        return arr

    def char_array(self):
        return list(self.next_line().strip())

# Main Code
if __name__ == "__main__":
    fr = FastReader()
    
    # Reading doubles and converting them to integers for simplicity
    n, m = int(fr.next_double()), int(fr.next_double())
    
    for i in range(int(m - (n % m))):
        # Casting to integer here since Python's division returns float
        print(int(n // m), end=" ")
    
    for i in range(int(m - (n % m)), int(m)):
        # Using math.ceil to replicate the behavior of Java's ceil
        print(int(math.ceil(n / m)), end=" ")

# Here is the testing part you can run manually. Since we do not have
# the same environment that the input and output of tests was designed
# for in the Java code, you will need to adjust how you provide the
# testing input to the Python script.
# Example test case using the input "87 34"
# You would provide the input to the script by feeding it directly into stdin
# Either by piping: `echo "87 34" | python script.py`
# or by typing it in the CLI after starting the script if it's interactive.