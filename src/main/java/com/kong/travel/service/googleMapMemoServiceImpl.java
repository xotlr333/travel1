package com.kong.travel.service;

import com.kong.travel.dto.googleMapMemoDTO;
import com.kong.travel.mappers.googleMapMemoDAOMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class googleMapMemoServiceImpl implements googleMapService{

    @Autowired //Mapper와 연결
    private googleMapMemoDAOMapper googleMapMemoDAOMapper;

    @Override
    public List<googleMapMemoDTO> getGoogleMapMemoData() throws Exception {
        return googleMapMemoDAOMapper.getGoogleMapMemoData();
    }

    @Override
    public void insertGoogleMapMemoData(googleMapMemoDTO googleMapMemoDTO) throws Exception {
        googleMapMemoDAOMapper.insertGoogleMapMemoData(googleMapMemoDTO);
    }
}