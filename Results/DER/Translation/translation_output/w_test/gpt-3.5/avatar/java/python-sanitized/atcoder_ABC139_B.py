def atcoder_ABC139_B():
    a, b = map(int, input().split())
    kuti = 1
    tap = 0

    while kuti < b:
        kuti = kuti - 1 + a
        tap += 1

    print(tap)

# Test
atcoder_ABC139_B()