class main:
    import sys
    
    def main():
        for line in sys.stdin:
            line = line.strip()
            str_array = line.split("")
            result_num1 = -1
            result_num2 = -1
    
            for i in range(len(str_array)):
                if i + 1 < len(str_array) and str_array[i] == str_array[i + 1]:
                    result_num1 = i + 1
                    result_num2 = i + 2
                    break
    
                if i + 2 < len(str_array) and str_array[i] == str_array[i + 2]:
                    result_num1 = i + 1
                    result_num2 = i + 3
                    break
    
            print(result_num1, result_num2)
    
    if __name__ == "__main__":
        main()