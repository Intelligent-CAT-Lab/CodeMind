import sys

def main():
    # Adding $ to the start and end of the input string to avoid out of boundary checks
    str_data = '$'+ sys.stdin.readline().strip() +'$'
    
    ans = 0
    s = 0
    
    for i in range(1, len(str_data)):
        if str_data[i] == 'O' and str_data[i-1] != 'O':
            s = i
        
        if str_data[i] == 'O' and str_data[i+1] != 'O':
            l = i - s + 1
            if s >= l and len(str_data) - i - 1 >= l:
                ok = True
                
                for j in range(l):
                    if str_data[s - 1 - j] != 'J' or str_data[i + 1 + j] != 'I':
                        ok = False
                        break
                    
                if ok:
                    ans = max(ans, l)
                    
    print(ans)

# Assumed the use of the 'if __name__' block to ensure the function only runs when the script is the main program,
# which is the Python equivalent to Java's public static void main.
if __name__ == "__main__":
    main()