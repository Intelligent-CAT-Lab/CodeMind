import sys

def lucky_number(number):
    mask = 2
    value = -1
    
    while value < number:
        s = bin(mask)[2:]
        zeros = s.count('0')
        
        if zeros!= len(s) - zeros:
            mask += 1
            continue
        
        s = s.replace('0', '4')
        s = s.replace('1', '7')
        value = int(s)
        mask += 1
    
    return value

if __name__ == "__main__":
    number = int(sys.stdin.readline())
    print(lucky_number(number))