def test(self):
        self.parser = ArgumentParser()
        self.parser.arguments = {"name": "John", "age": 25}
        result = self.parser.get_argument("age")
        return result