class main:
    def is_on_the_way(a, b, c):
        return ((c >= a and c <= b) or (c >= b and c <= a))
    
    def main():
        a, b, c = map(int, input().split())
        if is_on_the_way(a, b, c):
            print("Yes")
        else:
            print("No")
    
    if __name__ == "__main__":
        main()