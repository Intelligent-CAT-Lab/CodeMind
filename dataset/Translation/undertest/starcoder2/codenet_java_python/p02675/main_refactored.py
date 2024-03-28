class main:
    N = int(input())
    
    if N%10 == 2 or N%10 == 4 or N%10 == 5 or N%10 == 7 or N%10 == 9:
        print("hon")
    elif N%10 == 0 or N%10 == 1 or N%10 == 6 or N%10 == 8:
        print("pon")
    else:
        print("bon")