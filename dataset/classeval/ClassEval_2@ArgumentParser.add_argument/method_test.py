def test(self):
        self.parser = ArgumentParser()
        self.parser.add_argument("name")
        self.parser.add_argument("age", required=False, arg_type=int)
        self.parser.add_argument("verbose", arg_type=bool)

        return self.parser.required,set(),self.parser.types