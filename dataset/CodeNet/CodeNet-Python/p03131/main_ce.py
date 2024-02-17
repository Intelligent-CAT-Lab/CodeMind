K, A, B = [int(elem) for elem in "4 2 6".split()]
if B - A <= 2:
    print(K + 1)
else:
    first_num_exchanges = A + 1
    rest_num_exchanges = K - first_num_exchanges
    gain_per_two_manipulation = B - A
    num_cookies = rest_num_exchanges // 2 * gain_per_two_manipulation + B
    if rest_num_exchanges % 2 == 1:
        num_cookies += 1
    print(num_cookies)
