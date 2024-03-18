import sys

class EquivalentResistance:
    def solve(self, r1, r2):
        result = 1 / (1 / r1 + 1 / r2)
        return result

class LightScanner:
    def doubles(self, input_str):
        return map(float, input_str.split())

if __name__ == "__main__":
    # Assuming input from standard input (stdin)
    scanner = LightScanner()
    r1, r2 = scanner.doubles(input())
    
    solver = EquivalentResistance()
    answer = solver.solve(r1, r2)
    
    # Print the formatted answer with 10 decimal places
    # To match Java's default rounding behavior, Python's round function is used
    print(round(answer, 10))