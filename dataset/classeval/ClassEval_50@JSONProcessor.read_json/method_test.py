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