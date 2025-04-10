def test(self):

        jobMarketplace = JobMarketplace()
        jobMarketplace.submit_resume("Tom", ['skill1', 'skill2'], "experience")
        return jobMarketplace.resumes