package com.shguitar.exam.controllers;

import com.shguitar.exam.models.Student;
import com.shguitar.exam.repositories.StudentRepository;
import com.shguitar.exam.viewModels.LookupViewModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ExamController {

    @Autowired
    private StudentRepository studentRepository;

    @RequestMapping("/lookup")
    public ModelAndView lookup(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("lookup");
        return modelAndView;
    }

    @RequestMapping("/result")
    public ModelAndView result(){
        return new ModelAndView("result");
    }

    @RequestMapping(value = "/lookup", method = RequestMethod.POST)
    public ModelAndView submit(String studentName, String mobile) {
        if (studentName != null || mobile != null) {
            Student student = studentRepository.getStudent(studentName.trim(), mobile.trim());
            if (student != null) {
                return new ModelAndView("result", "student", student);
            }
        }


        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("lookup");
        modelAndView.getModel().put("NotFoundMessage", "信息不正确！");
        modelAndView.getModel().put("aaa", "123！");
        return modelAndView;

//        LookupViewModel viewModel = new LookupViewModel();
//        viewModel.setNotFoundMessage("信息不正确！");
//        return new ModelAndView("lookup", "vm", viewModel);
    }
}
