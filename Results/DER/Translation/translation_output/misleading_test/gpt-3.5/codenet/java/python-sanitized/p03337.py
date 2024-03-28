from sys import stdin, stdout

class TaskA:
    def solve(self, in_data):
        a, b = map(int, in_data.split())
        stdout.write(str(max(a + b, a - b, a * b)))

if __name__ == "__main__":
    input_data = stdin.readline()
    solver = TaskA()
    solver.solve(input_data)