package com.g6.onlineeyecare.test.dao;

import java.util.List;

import com.g6.onlineeyecare.exceptions.TestIdNotFoundException;
import com.g6.onlineeyecare.test.dto.Test;

public interface ITestRepository {
	Test addTest(Test test);

	Test updateTest(Test test);

	Test removeTest(int testId) throws TestIdNotFoundException;

	Test viewTest(int testId) throws TestIdNotFoundException;

	List<Test> viewAllTests();
}
