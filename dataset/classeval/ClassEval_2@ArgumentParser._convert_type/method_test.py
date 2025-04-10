def test(self):
        self.parser = ArgumentParser()
        self.parser.types = {"age": int, "verbose": bool}
        result = self.parser._convert_type("verbose", "False")
        return result