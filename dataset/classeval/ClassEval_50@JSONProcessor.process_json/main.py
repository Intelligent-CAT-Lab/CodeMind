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
                json.dump(self.test_data, file)
            remove_key = "nonexistent_key"
            self.processor.process_json(self.file_path, remove_key)
            with open(self.file_path, 'r') as file:
                processed_data = json.load(file)
            return processed_data,self.test_data