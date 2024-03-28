class main:
    import sys
    
    class Solver:
        def __init__(self):
            self.input_data = input().split()
            self.index = 0
    
        def next_long(self):
            number = int(self.input_data[self.index])
            self.index += 1
            return number
    
        def run(self):
            a = self.next_long()
            b = self.next_long()
            c = self.next_long()
            d = c - a - b
            if d > 0 and 4 * a * b < d * d:
                print("Yes")
            else:
                print("No")
    
    if __name__ == "__main__":
        solver = Solver()
        solver.run()