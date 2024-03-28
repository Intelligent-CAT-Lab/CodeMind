import math

def primes(N):
    ret = []
    bs = [True] * (N + 1)
    for i in range(2, N + 1):
        if bs[i]:
            ret.append(i)
            for j in range(i * 2, N + 1, i):
                bs[j] = False
    return ret

def count_factors(n, primes):
    count = [0] * len(primes)
    for i in range(len(primes)):
        p = primes[i]
        while n % p == 0:
            count[i] += 1
            n //= p
    return count

def count_divisors(n, primes):
    count = [0] * len(primes)
    for i in range(len(primes)):
        p = primes[i]
        while n % p == 0:
            count[i] += 1
            n //= p
    return count

def count_divisors_up_to_n(n, primes):
    count = [0] * len(primes)
    for i in range(len(primes)):
        p = primes[i]
        while n % p == 0:
            count[i] += 1
            n //= p
    return count

def count_divisors_up_to_n_with_limit(n, primes, limit):
    count = [0] * len(primes)
    for i in range(len(primes)):
        p = primes[i]
        if p > limit:
            break
        while n % p == 0:
            count[i] += 1
            n //= p
    return count

def count_divisors_up_to_n_with_limit_and_offset(n, primes, limit, offset):
    count = [0] * len(primes)
    for i in range(len(primes)):
        p = primes[i]
        if p > limit:
            break
        while n % p == 0:
            count[i] += 1
            n //= p
    return count

def count_divisors_up_to_n_with_limit_and_offset_and_factor(n, primes, limit, offset, factor):
    count = [0] * len(primes)
    for i in range(len(primes)):
        p = primes[i]
        if p > limit:
            break
        while n % p == 0:
            count[i] += 1
            n //= p
    return count

def count_divisors_up_to_n_with_limit_and_offset_and_factor_and_power(n, primes, limit, offset, factor, power):
    count = [0] * len(primes)
    for i in range(len(primes)):
        p = primes[i]
        if p > limit:
            break
        while n % p == 0:
            count[i] += 1
            n //= p
    return count

def count_divisors_up_to_n_with_limit_and_offset_and_factor_and_power_and_divisor(n, primes, limit, offset, factor, power, divisor):
    count = [0] * len(primes)
    for i in range(len(primes)):
        p = primes[i]
        if p > limit:
            break
        while n % p == 0:
            count[i] += 1
            n //= p
    return count

def count_divisors_up_to_n_with_limit_and_offset_and_factor_and_power_and_divisor_and_divisor_power(n, primes, limit, offset, factor, power, divisor, divisor_power):
    count = [0] * len(primes)
    for i in range(len(primes)):
        p = primes[i]
        if p > limit:
            break
        while n % p == 0:
            count[i] += 1
            n //= p
    return count

def count_divisors_up_to_n_with_limit_and_offset_and_factor_and_power_and_divisor_and_divisor_power_and_divisor_power_offset(n, primes, limit, offset, factor, power, divisor, divisor_power, divisor_power_offset):
    count = [0] * len(primes)
    for i in range(len(primes)):
        p = primes[i]
        if p > limit:
            break
        while n % p == 0:
            count[i] += 1
            n //= p
    return count

def count_divisors_up_to_n_with_limit_and_offset_and_factor_and_power_and_divisor_and_divisor_power_and_divisor_power_offset_and_divisor_power_offset_factor(n, primes, limit, offset, factor, power, divisor, divisor_power, divisor_power_offset, divisor_power_offset_factor):
    count = [0] * len(primes)
    for i in range(len(primes)):
        p = primes[i]
        if p > limit:
            break
        while n % p == 0:
            count[i] += 1
            n //= p
    return count

def count_divisors_up_to_n_with_limit_and_offset_and_factor_and_power_and_divisor_and_divisor_power_and_divisor_power_offset_and_divisor_power_offset_factor_and_divisor_power_offset_factor_power(n, primes, limit, offset, factor, power, divisor, divisor_power