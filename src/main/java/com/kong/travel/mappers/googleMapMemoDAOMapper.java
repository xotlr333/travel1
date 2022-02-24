package com.kong.travel.mappers;

import com.kong.travel.dto.googleMapMemoDTO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface googleMapMemoDAOMapper {

    void insertGoogleMapMemoData(googleMapMemoDTO googleMaoMemoDTO);

    List<googleMapMemoDTO> getGoogleMapMemoData();

}
