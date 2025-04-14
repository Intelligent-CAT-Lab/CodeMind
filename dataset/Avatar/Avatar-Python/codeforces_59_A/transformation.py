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
shuffle([39, 55, 53])

def my_decorator(func):

    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    return dec_result
HTTPConnection('google.com', port=80)
datetime.datetime.now()
base64.b64encode(b'48679996085916466679')

@my_decorator
def Func_newFunc0_11_0(cl, variable_3_11):
    try:
        return cl + variable_3_11
    except BaseException:
        pass
ConditionChecker112 = [747][0]
ConditionChecker212 = 618
time.sleep(0.29)
Fernet.generate_key()
txt = input()
cu = 0
parse('2024-10-12 06:27:23')
cl = 0
ttest_ind([12, 47, 44], [66, 4, 85])
LoopChecker14 = 462
LoopChecker24 = 461

def loop_13_0(LoopIndexOut, stop, step):
    global variable_3_11, cl, cu
    if step == 0 or (step > 0 and LoopIndexOut >= stop) or (step < 0 and LoopIndexOut <= stop):
        return
    for newz_1 in txt:
        if newz_1.islower():
            variable_3_11 = 1
            queue_Func_newFunc0_11_00 = queue.Queue()

            def Func_newFunc0_11_0_thread(queue):
                result = Func_newFunc0_11_0(cl, variable_3_11)
                queue.put(result)
            thread_Func_newFunc0_11_00 = threading.Thread(target=Func_newFunc0_11_0_thread, args=(queue_Func_newFunc0_11_00,))
            thread_Func_newFunc0_11_00.start()
            thread_Func_newFunc0_11_00.join()
            result_Func_newFunc0_11_00 = queue_Func_newFunc0_11_00.get()
            cl = result_Func_newFunc0_11_00
        else:
            cu = cu + 1
    loop_13_0(LoopIndexOut + step, stop, step)
loop_13_0(0, LoopChecker14 // LoopChecker24, 1)
if ConditionChecker112 & ConditionChecker212:
    if cu > cl:
        out = txt.upper()
    else:
        out = txt.lower()
print(out)