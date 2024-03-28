class main:
    def main():
        k = 360
        j = 1
    
        i = int(input("Enter an integer: "))
    
        if 1 <= i <= 179:
            while (i * j) % k != 0:
                j += 1
            print(j)
        else:
            print("