package com.kong.travel.mappers;

import com.kong.travel.dto.TestDTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.tomcat.websocket.server.WsRemoteEndpointImplServer;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface TestDAOMapper {
    List<TestDTO> getTestData();

    void setTestData(TestDTO testDTO);

    void updateTestData(TestDTO testDTO);
    void deleteTestData(TestDTO testDTO);

}
