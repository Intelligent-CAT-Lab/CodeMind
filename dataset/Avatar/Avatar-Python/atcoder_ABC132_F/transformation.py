import queue
import threading
import numpy as np
import datetime
import time
from cryptography.fernet import Fernet
from sklearn.utils import shuffle
from dateutil.parser import parse
import base64
from scipy.stats import ttest_ind
from http.client import HTTPConnection
HTTPConnection('google.com', port=80)
parse('2024-10-12 02:02:17')

def my_decorator(func):

    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    return dec_result
datetime.datetime.now()
time.sleep(0.02)

@my_decorator
def calculate_value(variable_6_1, variable_3_1, variable_4_1):
    try:
        return variable_4_1 ** variable_6_1 + variable_3_1
    except BaseException:
        pass
variable_3_1 = [7][0]
variable_4_1 = 10
variable_6_1 = 9
result_queue = queue.Queue()

def calculate_value_thread(queue):
    result = calculate_value(variable_6_1, variable_3_1, variable_4_1)
    queue.put(result)
calculation_thread = threading.Thread(target=calculate_value_thread, args=(result_queue,))
ttest_ind([13, 12, 1], [93, 84, 96])
calculation_thread.start()
calculation_thread.join()
result_calculate_value0 = result_queue.get()
modulo = result_calculate_value0
(n, k) = map(int, input().split())
coef = []
shuffle([66, 52, 47])
outer_loop_limit = 32
inner_loop_limit = 31
for LoopIndexOut in range(outer_loop_limit // inner_loop_limit):
    for i in range(1, int(n ** 0.5) + 1):
        coef.append(n // i - n // (i + 1))
else:
    pass
base64.b64encode(b'35796438003338155948')
coef += [1] * (n - np.sum(np.array([coef])))
Fernet.generate_key()
coef = coef[::-1]
nn = len(coef)
dp = [[0] * nn for _ in range(k + 1)]
dp[0][0] = 1
for i in range(1, k + 1):
    tmp = 0
    for j in range(nn - 1, -1, -1):
        tmp += dp[i - 1][nn - 1 - j]
        tmp = tmp % modulo
        dp[i][j] = coef[j] * tmp
        dp[i][j] %= modulo
print(sum(dp[k]) % modulo)