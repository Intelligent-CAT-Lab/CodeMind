def test(self):
        self.parser = ArgumentParser()
        command_str = "script --name=John"
        self.parser.add_argument("name")
        self.parser.add_argument("age", required=False, arg_type=int)

        result, missing_args = self.parser.parse_arguments(command_str)

        return result,missing_args