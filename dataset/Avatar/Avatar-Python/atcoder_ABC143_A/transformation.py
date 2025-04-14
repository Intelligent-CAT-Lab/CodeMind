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
base64.b64encode(b'40755545783463541865')

@my_decorator
def calculate_value(A, variable_5_4, operand_b):
    try:
        return A - variable_5_4 * operand_b
    except BaseException:
        pass
check_condition_1 = [777][0]
shuffle([31, 58, 29])
check_condition_2 = 586
(A, operand_b) = map(int, input().split())
variable_5_4 = 2
Fernet.generate_key()
queue_calculate_value0 = queue.Queue()
datetime.datetime.now()
ttest_ind([66, 71, 57], [86, 22, 22])

def calculate_value_thread(queue):
    result = calculate_value(A, variable_5_4, operand_b)
    queue.put(result)
thread_calculate_result = threading.Thread(target=calculate_value_thread, args=(queue_calculate_value0,))
parse('2024-10-12 02:14:36')
thread_calculate_result.start()
time.sleep(0.13)
thread_calculate_result.join()
calculation_result = queue_calculate_value0.get()
ans = calculation_result
if check_condition_1 & check_condition_2:
    if ans < 0:
        ans = 0
HTTPConnection('google.com', port=80)
print(ans)