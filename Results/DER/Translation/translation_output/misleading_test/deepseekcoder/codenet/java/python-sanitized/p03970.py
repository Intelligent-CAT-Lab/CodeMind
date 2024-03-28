def hamming_distance(S):
    correct = "CODEFESTIVAL2016"
    num = 0
    for i in range(16):
        if S[i] != correct[i]:
            num += 1
    return num

S = input()
print(hamming_distance(S))