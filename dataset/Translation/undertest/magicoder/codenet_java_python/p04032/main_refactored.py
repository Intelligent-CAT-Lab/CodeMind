class main:
    import sys
    
    def find_duplicates(line):
        str_array = list(line)
        result_num1 = -1
        result_num2 = -1
    
        for i in range(len(str_array)):
            if i + 1 <= len(str_array) - 1 and str_array[i] == str_array[i + 1]:
                result_num1 = i + 1
                result_num2 = i + 2
                break
    
            if i + 2 <= len(str_array) - 1 and str_array[i] == str_array[i + 2]:
                result_num1 = i + 1
                result_num2 = i + 3
                break
    
        return result_num1, result_num2
    
    
    if __name__ == "__main__":
        for line in sys.stdin:
            result_num1, result_num2 = find_duplicates(line.strip())
            print(result_num1, result_num2)