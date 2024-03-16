import sys
import io

# We can use `INPUT` to switch between standard input and a predefined string for input

class Scanner:
    def __init__(self, file):
        self.file = file
        self.buf = []

    def next_token(self):
        while not self.buf:
            # Read the next line and split it into tokens
            line = self.file.readline()
            if not line:
                raise RuntimeError("No more input")
            self.buf = line.split()
        # Pop the first token from the buffer
        return self.buf.pop(0)

    def next_int(self):
        # Parse the next token as an integer
        return int(self.next_token())

    def next_float(self):
        # Parse the next token as a float
        return float(self.next_token())

    def next_double(self):
        # Parse the next token as a double
        return float(self.next_token())
    
    def next_line(self):
        # Get the next line
        return self.file.readline().strip()


class Printer:
    def __init__(self, file):
        self.file = file
    
    def println(self, *args):
        # Print the arguments as a line in the output file
        print(*args, file=self.file)
        
    def flush(self):
        # Flush the output buffer
        self.file.flush()


def solve(sc, pr):
    a = sc.next_int()
    b = sc.next_int()
    c = sc.next_int()
    x = sc.next_int()
    y = sc.next_int()

    # Set the initial minimum to a large number
    min_cost = float('inf')
    for i in range(max(x, y) + 1):
        tmp = a * max(0, x - i) + b * max(0, y - i) + c * i * 2
        min_cost = min(min_cost, tmp)
    
    pr.println(min_cost)


# Main function
def main():
    sc = Scanner(sys.stdin if INPUT is None else io.StringIO(INPUT))
    pr = Printer(sys.stdout)
    
    solve(sc, pr)

    # Uncomment the following lines if it's necessary to close the streams
    # pr.flush()
    # pr.close()
    # sc.close()


# Run the main function
if __name__ == "__main__":
    main()