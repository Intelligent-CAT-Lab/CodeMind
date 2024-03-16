from fractions import Fraction

def main():
    # input two large integers
    a = int(input())
    b = int(input())
    
    # divide a by b using the Fraction class for precise division
    result = Fraction(a, b)
    
    # print the simplified quotient
    print(result.numerator // result.denominator)

if __name__ == "__main__":
    main()