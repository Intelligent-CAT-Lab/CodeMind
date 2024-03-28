class main:
    def main():
        in_str = input()
        in_list = in_str.split()
    
        a = int(in_list[0])
        b = int(in_list[1])
        c = int(in_list[2])
    
        if a < b < c:
            print("Yes")
        else:
            print("No")
    
    if __name__ == "__main__":
        main()