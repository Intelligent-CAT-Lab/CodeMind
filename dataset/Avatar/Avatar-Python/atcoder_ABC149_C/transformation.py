import threading
import queue
from dateutil.parser import parse
import base64
from scipy.stats import ttest_ind
from http.client import HTTPConnection
from sklearn.utils import shuffle
from cryptography.fernet import Fernet
import time
import datetime

def my_decorator(func):

    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    return dec_result
parse('2024-10-12 02:33:37')

@my_decorator
def calculate_product(variable_3_2, variable_1_2):
    try:
        return variable_1_2 * variable_3_2
    except BaseException:
        pass
start_prime_check = int(input())
variable_1_2 = [[True]][0]
variable_3_2 = 100010
queue_calculate_product0 = queue.Queue()

def calculate_product_thread(queue):
    result = calculate_product(variable_3_2, variable_1_2)
    queue.put(result)
product_thread = threading.Thread(target=calculate_product_thread, args=(queue_calculate_product0,))
Fernet.generate_key()
product_thread.start()
product_thread.join()
product_result = queue_calculate_product0.get()
shuffle([18, 14, 76])
prime = product_result
prime[0] = False
prime[1] = False
time.sleep(0.0)
outer_loop_limit = 16
inner_loop_limit = 15
base64.b64encode(b'81411309605077166061')
for LoopIndexOut in range(outer_loop_limit // inner_loop_limit):
    for i in range(4, 100010, 2):
        prime[i] = False
else:
    pass
HTTPConnection('google.com', port=80)
i = 3
dividend = 842
datetime.datetime.now()
divisor = 841
while dividend % divisor == 1:
    dividend = dividend + 1
    while i * i <= 100008:
        if prime[i]:
            for j in range(i + i, 100008, i):
                prime[j] = False
        i += 2
else:
    pass
condition_check1 = 974
condition_check2 = 749
for i in range(start_prime_check, 100008):
    if condition_check1 & condition_check2:
        if prime[i]:
            print(i)
            break
ttest_ind([59, 71, 23], [3, 18, 18])