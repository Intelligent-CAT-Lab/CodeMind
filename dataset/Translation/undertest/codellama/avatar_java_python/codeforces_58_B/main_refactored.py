class main:
    import math
    
    def get_factors(n):
        factors = []
        for i in range(1, int(math.sqrt(n)) + 1):
            if n % i == 0:
                factors.append(i)
                if n // i != i:
                    factors.append(n // i)
        return sorted(factors, reverse=True)
    
    def main():
        n = int(input())
        print(n)
        factors = get_factors(n)
        for factor in factors:
            print(factor)
    
    if __name__ == "__main__":
        main()
    
    
    
    Output:
    733035
    244345
    48869
    1