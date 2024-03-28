class main:
    import sys
    
    def calculate_volume(length, width):
        return (length * width) / 3.305785
    
    for line in sys.stdin:
        length, width = map(float, line.split())
        print(calculate_volume(length, width))