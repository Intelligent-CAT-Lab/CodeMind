class main:
    import sys
    
    def main():
        input_str = sys.stdin.readline().strip()
        num_list = input_str.split()
        num_list = sorted(num_list)
        num_small = int(num_list[0])
        num_middle = int(num_list[1])
        num_large = int(num_list[2])
        print(num_small, num_middle, num_large)
    
    if __name__ == '__main__':
        main()