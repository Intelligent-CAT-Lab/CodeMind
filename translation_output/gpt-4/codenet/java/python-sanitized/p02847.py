import sys

class MScanner:
    def __init__(self, input_stream):
        self.br = input_stream
    
    def next(self):
        while True:
            token = self.br.readline().split()
            if token:
                for t in token:
                    yield t
    
    def next_line(self):
        return self.br.readline().strip()
    
    def next_int(self):
        return int(self.next())

    def take_array(self, n, value_type=int):
        return [value_type(x) for x in self.next().split()[:n]]

# Usage of MScanner with sys.stdin
sc = MScanner(sys.stdin)

def main():
    days = ["MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"]
    input_day = sc.next_line()

    # Find the index of the input day in the days list
    idx = days.index(input_day)
    
    # Calculate the days until Sunday
    ans = (6 - idx + 7) % 7
    if ans == 0:
        print(7)
    else:
        print(ans)

# Call the main function
if __name__ == "__main__":
    main()