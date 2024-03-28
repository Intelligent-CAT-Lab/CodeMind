class main:
    import sys
    
    def main():
        input_list = [int(x) for x in sys.stdin.read().split()]
        if len(set(input_list)) > 3:
            print("no")
            return
        input_list.sort()
        distinct_elements = set(input_list)
        for element in distinct_elements:
            count = input_list.count(element)
            if count not in [4, 8, 12]:
                print("no")
                return
        print("yes")
    
    if __name__ == "__main__":
        main()