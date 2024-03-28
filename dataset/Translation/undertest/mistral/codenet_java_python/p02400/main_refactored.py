class main:
    import sys
    
    def main():
        r = float(input())
        pi = 3.14159265358979323846
        x = r**2 * pi
        y = 2 * r * pi
        print("{:.6f} {:.6f}".format(x, y))
    
    if __name__ == "__main__":
        main()