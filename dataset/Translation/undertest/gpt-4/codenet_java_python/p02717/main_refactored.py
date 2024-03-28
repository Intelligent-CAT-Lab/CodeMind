class main:
    def rotate_values(input_string):
        values = input_string.split()
        a, b, c = values
        return f"{c} {a} {b}"
    
    # Sample test case
    input_string = "1 2 3"
    output = rotate_values(input_string)
    print(output)