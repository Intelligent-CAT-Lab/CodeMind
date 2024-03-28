class main:
    s = input()
    
    str_list = list(s)
    counter = 0
    for i in range(len(str_list) - 1):
        if str_list[i] != str_list[i+1]:
            counter += 1
    
    print(counter)