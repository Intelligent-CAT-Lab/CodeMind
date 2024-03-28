class main:
    import sys
    
    def main():
        paint_cans = set()
        for line in sys.stdin:
            for num in line.split():
                paint_cans.add(int(num))
    
        print(len(paint_cans))
    
    if __name__ == "__main__":
        main()