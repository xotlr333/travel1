package com.kong.travel.controller;

import com.kong.travel.mappers.TestDAOMapper;
import com.kong.travel.dto.TestDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
//@RequestMapping("/api")
public class DBConnectTestCtrl {

    @Autowired
    private TestDAOMapper testDAOMapper;

    @GetMapping("/hello")
    public List<TestDTO> HelloWorld() {
        return testDAOMapper.getTestData();
    }

//    @GetMapping("/write.do")
//    public String writeTest(Model model){
//        return "test_view";
//    }

//    @PostMapping("/insert.do")
//    public String insertTest(TestDTO testDTO){
//        testDAOMapper.setTestData(testDTO);
//        return "redirect:/write.do";
//    }
}


