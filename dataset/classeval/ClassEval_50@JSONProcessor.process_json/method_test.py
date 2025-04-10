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