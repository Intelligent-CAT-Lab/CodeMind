class main:
    def calculate_possible_ways(n, a, b):
        if a > b or (n == 1 and a != b):
            return 0
        if a == b:
            return 1
        return (n - 2) * (b - a) + 1
    
    # Test input
    input_str = input()
    n, a, b = map(int, input_str.split())
    output = calculate_possible_ways(n, a, b)
    print(output)