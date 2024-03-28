class main:
    import sys
    
    def main():
        if sys.getproperty("ONLINE_JUDGE") is None:
            input_file = open("/home/changshu/CodeMind/dataset/Avatar/Avatar-java/codeforces_99_A/input.txt", "r")
            output_file = open("/home/changshu/CodeMind/dataset/Avatar/Avatar-java/codeforces_99_A/output.txt", "w")
        else:
            input_file = sys.stdin
            output_file = sys.stdout
    
        tests = 1
        while tests > 0:
            solve()
            tests -= 1
    
        output_file.flush()
        output_file.close()
        input_file.close()
    
    def solve():
        str = input_file.readline()
        index = str.find(".")
        if index == -1:
            output_file.write(str)
            return
    
        d = ord(str[index + 1]) - ord("0")
        i = ord(str[index - 1]) - ord("0")
    
        if i == 9:
            output_file.write("GOTO â Vasilisa.")
            return
    
        if d >= 5:
            output_file.write(str[0:index - 1] + str(i + 1))
        else:
            output_file.write(str[0:index])
    
        output_file.write("\n")
    
    if __name__ == "__main__":
        main()