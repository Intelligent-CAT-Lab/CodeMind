def main():
    N = int(input())

    amari = N % 10
    sho = N // 10

    if amari == 9:
        print("Yes")
    elif sho == 9:
        print("Yes")
    else:
        print("No")

# ***********************以下共通関数************************************************

def my_reverse(pStr):