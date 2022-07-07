package com.kong.travel.controller;


import com.kong.travel.dto.googleMapMemoDTO;
import com.kong.travel.service.googleMapService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Iterator;
import java.util.List;

//@Controller
@RestController
public class APIControllerTest {

    @Autowired
    private googleMapService googleMapService;

    @RequestMapping("/api/list.do")
    public ResponseEntity<List<googleMapMemoDTO>> List() throws Exception {
        List<googleMapMemoDTO> list = googleMapService.getGoogleMapMemoData();
        return ResponseEntity.status(HttpStatus.OK).body(list);
    }

    @RequestMapping("/api/update.do")
    public ResponseEntity<String> Update(@RequestBody googleMapMemoDTO dto) throws Exception {
        googleMapService.updateGoogleMapMemoData(dto);
        return new ResponseEntity<>("success", HttpStatus.OK);
    }

}
