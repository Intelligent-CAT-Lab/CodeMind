class main:
    def calculate(expression):
        parts = expression.split()
        a = int(parts[0])
        operator = parts[1]
        b = int(parts[2])
        
        if operator == "+":
            return a + b
        elif operator == "-":
            return a - b
    
    # Sample test case
    test_input = "1 + 2"
    print(calculate(test_input))