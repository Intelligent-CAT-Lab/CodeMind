def find_numbers_containing_three(x):
    if 3 <= x <= 10000:
        count = 0
        a = 1
        result = []
        while count < x:
            if a % 3 == 0:
                result.append(str(a))
            else:
                b = a
                while b != 0:
                    if b % 10 == 3:
                        result.append(str(a))
                        break
                    b //= 10
            a += 1
            count += 1
        return " ".join(result)

if __name__ == "__main__":
    x = int(input())
    print(find_numbers_containing_three(x))