package com.codecool.havszab.codenames.controller;


import com.codecool.havszab.codenames.model.Info;
import com.codecool.havszab.codenames.repository.InfoRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import java.util.List;

@Controller
public class IndexController {

    private InfoRepository infoRepository;

    public IndexController(InfoRepository service) {
        this.infoRepository = service;
    }

    public List<Info> getAllInfo() {
        return infoRepository.findAll();
    }

    public String add(Info info) {
        infoRepository.save(info);
        return "index";
    }

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String showInfo(Model model){
        model.addAttribute("index", getAllInfo());
        return "index";
    }
}
