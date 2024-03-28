class main:
    import sys
    
    def count_chars(input_string):
        a = 'A'
        sum = 0
        for char in input_string:
            if ord(char) <= ord(a):
                sum += 1
            a = char
        return sum
    
    input_string = sys.stdin.readline().strip()
    print(count_chars(input_string))