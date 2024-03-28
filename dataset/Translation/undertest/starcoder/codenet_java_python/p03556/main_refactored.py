class main:
    import math
    
    def execute(scanner):
        r = int(math.sqrt(scanner.next()))
        print(r * r)
    
    if __name__ == "__main__":
        import sys
        with open(sys.argv[1], 'r') as input_file:
            execute(input_file)