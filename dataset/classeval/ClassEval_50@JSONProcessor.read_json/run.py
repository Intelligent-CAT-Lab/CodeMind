import os
import unittest
import json
import os


class JSONProcessor:
    def read_json(self, file_path):
        if not os.path.exists(file_path):
            return 0
        try:
            with open(file_path, 'r') as file:
                data = json.load(file)
            return data
        except:
            return -1

    def write_json(self, data, file_path):
        try:
            with open(file_path, 'w') as file:
                json.dump(data, file)
            return 1
        except:
            return -1

    def process_json(self, file_path, remove_key):
        data = self.read_json(file_path)
        if data == 0 or data == -1:
            return 0
        if remove_key in data:
            del data[remove_key]
            self.write_json(data, file_path)
            return 1
        else:
            return 0
class Test(unittest.TestCase):
    def test(self):
            self.processor = JSONProcessor()
            self.test_data = {
                "key1": "value1",
                "key2": "value2",
                "key3": "value3"
            }
            self.file_path = "test.json"
            with open(self.file_path, 'w') as file:
                file.write("Invalid JSON")
            result = self.processor.read_json(self.file_path)
            return result
t=Test()
a=t.test()
with open('/home/changshu/CODEMIND/dataset/classeval/ClassEval_50@JSONProcessor.read_json/output.txt', 'w') as wr:
    wr.write(str(a))
        