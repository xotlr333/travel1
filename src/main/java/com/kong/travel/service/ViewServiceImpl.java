package com.kong.travel.service;

import com.kong.travel.dto.TestDTO;
import com.kong.travel.mappers.TestDAOMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ViewServiceImpl implements ViewService{

    @Autowired //Mapper와 연결
    private TestDAOMapper testDAOMapper;

    @Override
    public List<TestDTO> getTestData() throws Exception{
        return testDAOMapper.getTestData();
    }

    @Override
    public void setTestData(TestDTO testDTO) throws Exception{
        testDAOMapper.setTestData(testDTO);
    }

    @Override
    public void updateTestData(TestDTO testDTO) throws Exception {
        testDAOMapper.updateTestData(testDTO);
    }

    @Override
    public void deleteTestData(TestDTO testDTO) throws Exception {
        testDAOMapper.deleteTestData(testDTO);
    }
}
