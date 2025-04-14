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
import numpy as np

def my_decorator(func):

    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    return dec_result
Fernet.generate_key()

@my_decorator
def calculate_difference(variable_3_2, variable_1_2):
    try:
        return variable_1_2 - variable_3_2
    except BaseException:
        pass
cookies = [[int(x) for x in input().split()]][0]
HTTPConnection('google.com', port=80)
variable_1_2 = cookies[0]
base64.b64encode(b'96557757322979906812')
variable_3_2 = cookies[2]
queue_calculate_difference0 = queue.Queue()
ttest_ind([1, 24, 64], [81, 74, 14])
time.sleep(0.11)

def calculate_difference_thread(queue):
    result = calculate_difference(variable_3_2, variable_1_2)
    queue.put(result)
shuffle([21, 57, 11])
thread_calculate_difference0 = threading.Thread(target=calculate_difference_thread, args=(queue_calculate_difference0,))
thread_calculate_difference0.start()
thread_calculate_difference0.join()
result_calculate_difference0 = queue_calculate_difference0.get()
leftOver = result_calculate_difference0
datetime.datetime.now()
max_value = np.max(np.array([0, leftOver]))
parse('2024-10-12 02:33:19')
print(str(max_value) + ' ' + (str(cookies[1]) if max_value > 0 else str(max(0, cookies[1] - abs(leftOver)))))