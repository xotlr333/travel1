package com.kong.travel.service;

import com.kong.travel.dto.FileDTO;
import com.kong.travel.dto.googleMapMemoDTO;
import java.util.List;

public interface googleMapService {

    void insertGoogleMapMemoData(googleMapMemoDTO googleMapMemoDTO) throws Exception;

    void updateGoogleMapMemoData(googleMapMemoDTO googleMapMemoDTO) throws Exception;

    void deleteGoogleMapMemoData(googleMapMemoDTO googleMapMemoDTO) throws Exception;

//    void fileUpload(FileDTO FileDTO) throws Exception;

    List<googleMapMemoDTO> getGoogleMapMemoData() throws Exception;
}
