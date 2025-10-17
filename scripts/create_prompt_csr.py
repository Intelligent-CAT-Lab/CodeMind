icl_example_method = """You are a Python programming expert and you are asked to simplify a piece of Python code.
Consider the following code:

from dateutil.parser import parse
import base64
from scipy.stats import ttest_ind
from http.client import HTTPConnection
from sklearn.utils import shuffle
from cryptography.fernet import Fernet
import time
import datetime

def newFunc_39010(arg0, arg1):
    return arg0 + arg1

def my_decorator(func):
    HTTPConnection('google.com', port=80)
    time.sleep(0.02)

    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    parse('2024-10-14 23:38:37')
    Fernet.generate_key()
    return dec_result

@my_decorator
def g(s):
    ttest_ind([30, 48, 71], [25, 63, 8])
    shuffle([31, 51, 97])
    datetime.datetime.now()
    base64.b64encode(b'10569528623851024700')
    try:
        return newFunc_39010(s, 'a')
    except:
        pass

Refactor the code and generate a shorter version of it.
The generated code should satisfy the following test:

def check(candidate):
    assert candidate("hi") == "hia"
    assert candidate("hello") == "helloa"

wrap your response with "$CODE_START$" and "$CODE_END$".
DO NOT generate any test in your response.

$CODE_START$
def g(s):
    return s + "a"
$CODE_END$
"""
icl_example_avatar = """
You are a Python programming expert and you are asked to simplify a piece of Python code.
Consider the following code:

from dateutil.parser import parse
import base64
from scipy.stats import ttest_ind
from http.client import HTTPConnection

def my_decorator(func):
    parse('2024-10-16 12:19:42')
    HTTPConnection('google.com', port=80)
    ttest_ind([17, 57, 68], [53, 28, 53])

    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    return dec_result

@my_decorator
def newFunc_BinOp0(a, b):
    base64.b64encode(b'72846955115789108619')
    return a * b
from sklearn.utils import shuffle
from cryptography.fernet import Fernet
Fernet.generate_key()
import time
datetime.datetime.now()
shuffle([55, 79, 7])
time.sleep(0.21)
import datetime
(a, newb_1) = input().split()
a = int(a)
newb_1 = int(newb_1)
print(newFunc_BinOp0(a, newb_1) // 100)

Refactor the code and generate a shorter version of it.
The generated code should satisfy the following input-output pairs:
Input: 10 20; Output: 2
Input: 13 6; Output: 0
Input: 25 16; Output: 4

wrap your response with "$CODE_START$" and "$CODE_END$".
DO NOT generate any test in your response.

$CODE_START$
a , b = input().split()
a = int(a)
b = int(b)
print (a*b//100)
$CODE_END$
"""

icl_example_classeval = """You are a Python programming expert and you are asked to simplify a piece of Python code.
Consider the following code:

from dateutil.parser import parse
import base64
from scipy.stats import ttest_ind
from http.client import HTTPConnection
from sklearn.utils import shuffle
from cryptography.fernet import Fernet
import time
import datetime

def newFunc_59245(arg0, arg1):
  ttest_ind([10, 32, 22], [30, 95, 77])
  return arg0 + arg1

def my_decorator(func):

  def dec_result(*args, **kwargs):
    res = func(*args, **kwargs)
    return res
  shuffle([58, 11, 2])
  HTTPConnection('google.com', port=80)
  return dec_result

class A:

  @my_decorator
  def __init__(self, x):
    datetime.datetime.now()
    self.x = x

  def f(self, y):
    time.sleep(0.15)
    Fernet.generate_key()
    base64.b64encode(b'45887157709808903867')
    parse('2024-10-14 23:36:46')
    return newFunc_59245(self.x, y)

Refactor the method ```f``` and generate a shorter version of it..
The generated code should satisfy the following test:

class TestA(unittest.TestCase):
    def test_f_1(self):
        a = A(3)
        self.assertEqual(a.f(5), 8)
    
    def test_f_2(self):
        a = A(-2)
        self.assertEqual(a.f(2), 0)
    
    def test_f_3(self):
        a = A(5.6)
        self.assertEqual(a.f(-1.6), 4)
        
Wrap your response with "$CODE_START$" and "$CODE_END$".
DO NOT generate any test in your response.

$CODE_START$
class A:
    def __init__(self, x):
        self.x = x
    def f(self, y):
        return self.x + y
$CODE_END$

"""


def prompt_constructor(dataset, code, tests, method_signature):
    if dataset in ["humaneval", "cruxeval"]:
        prompt = icl_example_method + "\n" + "Consider the following code:\n" + code +\
            "\nRefactor the code and generate a shorter version of it.\nThe generated code should satisfy the following test:\n"\
                + tests + '\nwrap your response with "$CODE_START$" and "$CODE_END$".\nDO NOT generate any test in your response.'
    elif dataset in ["Avatar"]:
        prompt = icl_example_avatar + "\n" + "Consider the following code:\n" + code +\
            "\nRefactor the code and generate a shorter version of it.\nThe generated code should satisfy the following input-output pairs:\n"\
                + tests + '\nwrap your response with "$CODE_START$" and "$CODE_END$".\nDO NOT generate any test in your response.'
    elif dataset in ['classeval']:
        prompt = icl_example_classeval + "\n" + "Consider the following code:\n" + code +\
            "\nRefactor the method ```" + method_signature +  "``` and generate a shorter version of it.\nThe generated code should satisfy the following test:\n"\
                + tests + '\nwrap your response with "$CODE_START$" and "$CODE_END$".\nDO NOT generate any test in your response.'
    return prompt

def create_prompt_gpt_gemini(prompt):
    start_code = "```python"
    end_code = "```"
    prompt = prompt.replace("$CODE_START$", start_code).replace("$CODE_END$", end_code)
    return prompt

def create_prompt_semcoder(prompt):
    start_code = "```python"
    end_code = "```"
    prompt = prompt.replace("$CODE_START$", start_code).replace("$CODE_END$", end_code)
    prompt = prompt + "\n[Solution]\n"
    return prompt

def create_prompt_codellama(prompt):
    start_code = "[PYTHON]"
    end_code = "[/PYTHON]"
    prompt = "[INST]" + prompt + "\n[\INST]"
    prompt = prompt.replace("$CODE_START$", start_code).replace("$CODE_END$", end_code)
    return prompt

def create_prompt_deepseekcoder(prompt):
    inst = "You are an AI programming assistant, utilizing the DeepSeek Coder model, developed by DeepSeek Company, and you only answer questions related to computer science. For politically sensitive questions, security and privacy issues, and other non-computer science questions, you will refuse to answer."
    start_code = "```python"
    end_code = "```"
    prompt = inst + "### Instruction" + prompt + "\n### Response"
    prompt = prompt.replace("$CODE_START$", start_code).replace("$CODE_END$", end_code)
    return prompt

def create_prompt_starcoder(prompt):
    start_code = "```python"
    end_code = "```"
    prompt = "<fim_prefix>" + prompt + "<fim_suffix><fim_middle>"
    prompt = prompt.replace("$CODE_START$", start_code).replace("$CODE_END$", end_code)
    return prompt

def create_prompt(dataset, model_id, code, tests, method_signature):
    prompt = prompt_constructor(dataset, code, tests, method_signature)
    
    if "gpt-4" in model_id or "gemini" in model_id:
        prompt = create_prompt_gpt_gemini(prompt)
    elif "semcoder" in model_id:
        prompt = create_prompt_semcoder(prompt)
    elif "CodeLlama" in model_id:
        prompt = create_prompt_codellama(prompt)
    elif "deepseek-coder" in model_id:
        prompt = create_prompt_deepseekcoder(prompt)
    elif "starcoder2" in model_id:
        prompt = create_prompt_starcoder(prompt)
    return prompt
    
