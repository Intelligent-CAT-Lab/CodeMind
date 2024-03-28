def p02406(x):
    if 3 <= x <= 10000:
        output_list = []
        count = 0
        a = 1
        while count < x:
            b = a // 10
            if a % 3 == 0:
                output_list.append(a)
            else:
                b = a
                while b != 0:
                    if b % 10 == 3:
                        output_list.append(a)
                        break
                    b //= 10
            a += 1
            count += 1
        return ' '.join(map(str, output_list))

# Test the function
if __name__ == "__main__":
    test_input = int(input("Enter a number: "))
    result = p02406(test_input)
    print(result)