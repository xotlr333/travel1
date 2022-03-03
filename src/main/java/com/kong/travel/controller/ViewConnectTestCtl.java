package com.kong.travel.controller;

import com.kong.travel.dto.TestDTO;
import com.kong.travel.dto.googleMapMemoDTO;
import com.kong.travel.mappers.TestDAOMapper;
import com.kong.travel.mappers.googleMapMemoDAOMapper;
import com.kong.travel.service.ViewService;
import com.kong.travel.service.googleMapService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class ViewConnectTestCtl {

    @Autowired
    private TestDAOMapper testDAOMapper;
    @Autowired
    private googleMapMemoDAOMapper googleMapMemoDAOMapper;

    @Autowired
    private ViewService viewService;
    @Autowired
    private googleMapService googleMapService;

//    @GetMapping("/list.do")
//    public String Hello(Model model) {
//        List<TestDTO> ls = testDAOMapper.getTestData();
//        model.addAttribute("ls","ls");
//        return "test_view";
//    }

//    @GetMapping("/write.do")
//    public String writeTest(Model model){
//        model.addAttribute("name", "하하");
//        return "test_view";
//    }

//    @RequestMapping("/list.do") //노테이션의 값으로 주소 지정
//    public ModelAndView List() throws Exception{
//        ModelAndView mv = new ModelAndView("/test_view");
//        List<TestDTO> list = viewService.getTestData();
//        mv.addObject("list", list);
//        return mv;
//    }

    @RequestMapping("/list.do") //노테이션의 값으로 주소 지정
    public String List(Model model) throws Exception{
        //ModelAndView mv = new ModelAndView("/test_view");
        List<TestDTO> list = viewService.getTestData();
        model.addAttribute("list",list);
        //mv.addObject("list", list);
        return "test_view";
    }

    @RequestMapping("/insert.do")
    public String insertTest(@ModelAttribute TestDTO testDTO) throws Exception {
        viewService.setTestData(testDTO);
        return "redirect:/list.do";
    }

    @RequestMapping("/modify.do")
    public String modifyTest(@ModelAttribute TestDTO testDTO) throws Exception {
        viewService.updateTestData(testDTO);
        return "redirect:/list.do";
    }

    @RequestMapping("/delete.do")
    public String deleteTest(@ModelAttribute TestDTO testDTO) throws Exception {
        viewService.deleteTestData(testDTO);
        return "redirect:/list.do";
    }

    @RequestMapping("/googleMapTest.do")
    public String googleMapView(Model model) throws Exception {
        List<googleMapMemoDTO> list = googleMapService.getGoogleMapMemoData();
        model.addAttribute("list",list);
        return "googleMapTest";
    }

    @RequestMapping("/googleMapInsert.do")
    public String googleMapInsert(@ModelAttribute googleMapMemoDTO googleMapMemoDTO) throws Exception {
        String position = googleMapMemoDTO.getPosition();
        position = googleMapMemoDTO.getPosition().substring((position.lastIndexOf("(")+1),position.lastIndexOf(")"));
        String[] positionArray = position.split(", ");
        String lat = positionArray[0];
        String lng = positionArray[1];
        googleMapMemoDTO.setLat(lat);
        googleMapMemoDTO.setLng(lng);

        googleMapService.insertGoogleMapMemoData(googleMapMemoDTO);
        return "redirect:/googleMapTest.do";
    }

    @RequestMapping("/googleMapUpdate.do")
    public String googleMapUpdate(@ModelAttribute googleMapMemoDTO googleMapMemoDTO) throws Exception {

        googleMapService.updateGoogleMapMemoData(googleMapMemoDTO);
        return "redirect:/googleMapTest.do";
    }

    @RequestMapping("/googleMapDelete.do")
    public String googleMapDelete(HttpServletRequest request) throws Exception {
        googleMapMemoDTO googleMapMemoDTO = new googleMapMemoDTO();
        int id = Integer.parseInt(request.getParameter("id"));
        googleMapMemoDTO.setId(id);
        googleMapService.deleteGoogleMapMemoData(googleMapMemoDTO);
        return "redirect:/googleMapTest.do";
    }

//    @RequestMapping("/memo_view.do")
//    public String memoView() throws Exception {
//        return "memo_view";
//    }
}
