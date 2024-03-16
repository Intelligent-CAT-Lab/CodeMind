import sys
import math

class TaskA:
    def solve(self, in_list):
        t, s, q = map(int, in_list)
        sum_count = 0
        while s < t:
            s *= q
            sum_count += 1
        return sum_count

if __name__ == "__main__":
    input_lines = sys.stdin.readlines()
    in_list = [int(x) for x in input_lines[0].split()]
    solver = TaskA()
    result = solver.solve(in_list)
    print(result)