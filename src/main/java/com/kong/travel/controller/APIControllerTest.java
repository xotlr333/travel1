package com.kong.travel.controller;


import com.kong.travel.dto.googleMapMemoDTO;
import com.kong.travel.service.googleMapService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

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

//    @ResponseBody
    @RequestMapping(value = "/helloworld", method = RequestMethod.GET)
    public String helloworld() {
        return "helloWorld";
    }
}
