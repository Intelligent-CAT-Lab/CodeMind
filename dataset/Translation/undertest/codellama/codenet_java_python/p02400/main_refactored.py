class main:
    import math
    
    def main():
        r = float(input())
        pi = math.pi
        x = r * r * pi
        y = 2 * r * pi
        print(f"{x:.6f} {y:.6f}")
    
    if __name__ == "__main__":
        main()