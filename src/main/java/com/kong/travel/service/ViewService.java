package com.kong.travel.service;

import com.kong.travel.dto.TestDTO;

import java.util.List;

public interface ViewService {

    List<TestDTO> getTestData() throws Exception;

    void setTestData(TestDTO testDTO) throws Exception;

    void updateTestData(TestDTO testDTO) throws Exception;
    void deleteTestData(TestDTO testDTO) throws Exception;

}
