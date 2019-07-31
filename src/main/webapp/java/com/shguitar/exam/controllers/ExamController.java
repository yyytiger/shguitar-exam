package com.shguitar.exam.controllers;

import com.shguitar.exam.models.Student;
import com.shguitar.exam.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ExamController {

    @RequestMapping("/lookup")
    public String index(Model model){
        return "lookup";
    }

    @RequestMapping("/result")
    public ModelAndView index(){
        return new ModelAndView("result");
    }

    @RequestMapping(value = "/lookup", method = RequestMethod.POST)
    public ModelAndView submit(String studentName, String mobile){
        Student student = new Student();
        student.setName(studentName);
        student.setMobile(mobile);
        student.setLevel("十级");
        student.setMajority("钢琴");
        return new ModelAndView("result", "student", student);
    }
}
