<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
100

Expected output:
4VC1!0

```
s = str(input())
print("ABC"+s)
```

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println("ABC"+s);
    }
}
```
"""

import unittest
from unittest.mock import patch

from tmc import points
from tmc.utils import load, load_module, reload_module, get_stdout, check_source
from functools import reduce
import os
import textwrap
from random import choice, randint

exercise ='src.abc_and_string'
function = "main"

def get_correct(test_case: list) -> str:
    return "ABC"+test_case[0]

@points('1.abc_and_string')
class AbcAndStringTest(unittest.TestCase):
    @classmethod
    def setUpClass(cls):
        with patch('builtins.input', side_effect=[AssertionError("Asking input from the user was not expected")]):
           cls.module = load_module(exercise, 'en')

    def test_0_main_program_ok(self):
        ok, line = check_source(self.module)
        message = """The code for testing the functions should be placed inside
if __name__ == "__main__":
block. The following row should be moved:
"""
        self.assertTrue(ok, message+line)

    def test_1_function_exists(self):
        try:
            from src.abc_and_string import main
        except:
            self.assertTrue(False, 'Your code should contain function named as main')
        try:
            main = load(exercise, function, 'en')
            main()
        except:
            self.assertTrue(False, 'Make sure, that function can be called as follows\nmain()')

    def test_2_type_of_return_value(self):
        main = load(exercise, function, 'en')
        val = main()
        self.assertTrue(type(val) == str, f"Function {function} does not return value of string type with parameter value '100'.")

    def test_3_uses_input(self):
        main = load(exercise, function, 'en')
        with patch('builtins.input', side_effect=["100"]):
            try:
                val = main()
            except:
                self.assertTrue(False, 'Make sure, that function can be called as follows\nmain()')

    def test_4_test_with_values_1(self):
        test_cases = ["100", "1000", "10000", "100000"]
        for test_case in test_cases:
            with patch('builtins.input', side_effect=[test_case]):
                reload_module(self.module)
                output_at_start = get_stdout()
                main = load(exercise, function, 'en')
                val = main()

                correct = get_correct(test_case)

                self.assertEqual(val, correct, f"The result {val} does not match with the model solution {correct} when calling main({test_case})")
                self.assertEqual(len(output_at_start), 0, f"Your program does not print out anything with the input {test_case}")

    def test_5_test_with_values_2(self):
        test_cases = ["1000000", "10000000", "100000000", "1000000000"]
        for test_case in test_cases:
            with patch('builtins.input', side_effect=[test_case]):
                reload_module(self.module)
                output_at_start = get_stdout()
                main = load(exercise, function, 'en')
                val = main()

                correct = get_correct(test_case)

                self.assertEqual(val, correct, f"The result {val} does not match with the model solution {correct} when calling main({test_case})")
                self.assertEqual(len(output_at_start), 0, f"Your program does not print out anything with the input {test_case}")

if __name__ == '__main__':
    unittest.main()<|endoftext|>
