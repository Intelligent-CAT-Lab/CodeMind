def test(self):

        cs = ChandrasekharSieve(15)
        cs.generate_primes()
        res = cs.get_primes()
        return res