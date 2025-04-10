def test(self):

        lemmatization = Lemmatization()
        result = lemmatization.lemmatize_sentence("Until the beating, Cantanco's eyesight had been weak, but adequate.")
        expected = ['Until', 'the', 'beating', 'Cantancos', 'eyesight', 'have', 'be', 'weak', 'but', 'adequate']
        return result,expected