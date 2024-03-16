import java.util

def main():
    sc = java.util.Scanner(System.in)
    s = sc.next()
    
    while s.contains("0B ") or s.contains("1B "):
        s = s.replace("0B ", "")
        s = s.replace("1B ", "")
    
    s = s.replace(" B ", "")
    
    print(s)

main()