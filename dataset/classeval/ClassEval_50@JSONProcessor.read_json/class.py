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