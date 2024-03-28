class main:
    import sys
    
    def main():
        input_str = sys.stdin.readline().strip()
        input_list = list(input_str)
        result = 0
        p = 0
        g = 1
    
        for i in range(1, len(input_list)):
            if input_list[i] == 'g':
                if p + 1 <= g:
                    result += 1
                    p += 1
                else:
                    g += 1
            else:
                if p + 1 <= g:
                    p += 1
                else:
                    g += 1
                    result -= 1
    
        print(result)
    
    if __name__ == "__main__":
        main()