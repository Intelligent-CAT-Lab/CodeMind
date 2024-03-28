class main:
    import sys
    
    s = sys.stdin.readline().strip()
    if len(s) < 4:
        print("No")
        exit()
    if s[:4] == "YAKI":
        print("Yes")
    else:
        print("No")