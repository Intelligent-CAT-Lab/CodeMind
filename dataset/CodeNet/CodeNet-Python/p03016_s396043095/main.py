def f_takahashi_basics_in_education_and_learning(L, A, B, M, DIGIT_MAX=18):
    import numpy

    # https://github.com/numpy/numpy/blob/master/numpy/linalg/linalg.py L560から
    def matrix_power(a, n):
        a = numpy.core.asanyarray(a)
        fmatmul = numpy.core.dot

        z = result = None
        while n > 0:
            z = a % M if z is None else fmatmul(z, z) % M
            n, bit = divmod(n, 2)
            if bit:
                result = z if result is None else fmatmul(result, z) % M
        return result

    # 数列に対して、d桁の要素の個数を求める
    num_pow_d = [0] * (DIGIT_MAX + 1)
    for d in range(DIGIT_MAX + 1):
        if 10**d - 1 >= A:
            # dに対してA + B*n <= 10**d - 1 となる最大のn(L以下しか取りえない)
            num_pow_d[d] = min(((10**d - 1 - A) // B) + 1, L)  # +1はnが0スタートのため

    ans = numpy.array([0, A, 1])
    for d in range(1, DIGIT_MAX + 1):
        c_d = num_pow_d[d] - num_pow_d[d - 1]
        matrix = numpy.array([[(10**d) % M, 0, 0], [1, 1, 0], [0, B, 1]], dtype='object')
        m = numpy.eye(3, dtype='object') if c_d == 0 else matrix_power(matrix, c_d)
        ans = ans.dot(m) % M
    return ans[0]

L, A, B, M = [int(i) for i in input().split()]
print(f_takahashi_basics_in_education_and_learning(L, A, B, M))