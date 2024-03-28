class main:
    import math
    
    def get_nth_triangle_number(n):
        return (n * (n + 1)) // 2
    
    def main():
        x = int(input("Enter a number: "))
        i = 1
        while get_nth_triangle_number(i) < x:
            i += 1
        print(i)
    
    if __name__ == "__main__":
        main()