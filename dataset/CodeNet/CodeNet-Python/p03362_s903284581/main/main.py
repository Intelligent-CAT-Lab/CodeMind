def main():
    n = int(eval(input()))
    p = [2]
    for i in range(2,55556):
        for j in p:
            if i%j == 0:
                break
        else:
            p.append(i)
    l = []
    for i in p:
        if i%5 == 1:
            l.append(i)
    ans_list = [str(i) for i in l[:n]]
    print((" ".join(ans_list)))
    
if __name__ == '__main__':
    main()