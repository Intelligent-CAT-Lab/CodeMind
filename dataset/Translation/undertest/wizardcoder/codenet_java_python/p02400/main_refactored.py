class main:
    import math
    
    def calculate_area(radius):
        pi = math.pi
        x = radius**2 * pi
        y = 2 * radius * pi
        return x, y
    
    n = int(input())
    for i in range(n):
        radius = float(input())
        x, y = calculate_area(radius)
        print("{:.6f} {:.6f}".format(x, y))