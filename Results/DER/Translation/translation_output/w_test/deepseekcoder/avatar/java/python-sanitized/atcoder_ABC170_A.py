def atcoder_ABC170_A():
    count = [0]*5
    for i in range(5):
        x = int(input())
        count[i] += x
        if count[i] == 0:
            return i+1

print(atcoder_ABC170_A())