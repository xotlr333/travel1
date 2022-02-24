package com.kong.travel.service;

import com.kong.travel.dto.googleMapMemoDTO;
import java.util.List;

public interface googleMapService {

    void insertGoogleMapMemoData(googleMapMemoDTO googleMapMemoDTO) throws Exception;

    List<googleMapMemoDTO> getGoogleMapMemoData() throws Exception;
}
