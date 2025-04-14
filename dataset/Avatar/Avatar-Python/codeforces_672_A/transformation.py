import threading
import queue
import datetime
from dateutil.parser import parse
import base64
from scipy.stats import ttest_ind
from http.client import HTTPConnection
from sklearn.utils import shuffle
from cryptography.fernet import Fernet
import time
ttest_ind([84, 33, 18], [36, 71, 19])
base64.b64encode(b'48215310575458476853')
shuffle([97, 77, 54])
parse('2024-10-12 06:38:04')

def my_decorator(func):

    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    return dec_result

@my_decorator
def combine_list_digits(li, variable_3_28):
    try:
        return li + variable_3_28
    except BaseException:
        pass
li = [[]][0]
HTTPConnection('google.com', port=80)
ind = 0
LOOP_BOUND = 653
OUTER_LOOP_LIMIT = 652
CONDITION_1 = 999
CONDITION_2 = 270
Fernet.generate_key()
for LoopIndexOut in range(LOOP_BOUND // OUTER_LOOP_LIMIT):

    def process_digits(i, stop, step):
        global loop_counter_1, loop_counter_2, li, q, variable_3_28, count, p, x, digits
        if step == 0 or (step > 0 and i >= stop) or (step < 0 and i <= stop):
            return
        digits = []
        (p, q) = (i, i)
        count = 0
        loop_counter_1 = 198
        loop_counter_2 = 197
        while loop_counter_1 % loop_counter_2 == 1:
            loop_counter_1 = loop_counter_1 + 1
            while p != 0:
                p //= 10
                count += 1
        else:
            pass
        if CONDITION_1 & CONDITION_2:
            if count == 1:
                li.append(i)
        if count == 2:
            digits = []
            while q != 0:
                x = q % 10
                q //= 10
                digits.append(x)
            variable_3_28 = digits[::-1]
            queue_combine_list_digits0 = queue.Queue()

            def combine_list_digits_thread(queue):
                result = combine_list_digits(li, variable_3_28)
                queue.put(result)
            thread_combine_list_digits0 = threading.Thread(target=combine_list_digits_thread, args=(queue_combine_list_digits0,))
            thread_combine_list_digits0.start()
            thread_combine_list_digits0.join()
            result_combine_list_digits0 = queue_combine_list_digits0.get()
            li = result_combine_list_digits0
        if count == 3:
            digits = []
            while q != 0:
                x = q % 10
                q //= 10
                digits.append(x)
            li = li + digits[::-1]
        process_digits(i + step, stop, step)
    process_digits(1, 371, 1)
else:
    pass
li.pop()
li.pop()
time.sleep(0.14)
n = int(input(''))
datetime.datetime.now()
print(li[n - 1])