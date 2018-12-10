package com.codecool.havszab.codenames.api;

import com.codecool.havszab.codenames.model.Info;
import com.codecool.havszab.codenames.repository.InfoRepository;
import com.codecool.havszab.codenames.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Use code like this to make an API, for e.g. mobile clients, AJAX calls,..

// A @Controller where requests return plain strings.
// This is a "subannotation" of @Controller.
@RestController
@Component
public class IndexPageREST {

    @Autowired
    private InfoRepository infoRepository;

    @Autowired
    private UserRepository userRepository;


    public IndexPageREST(InfoRepository infoRepository) {
        this.infoRepository = infoRepository;
    }

    @RequestMapping(value = "/{username}", method = RequestMethod.GET, produces = "application/json")
    @ResponseBody
    public Map getIndexPageWithLoggedInUser(@PathVariable String username) {
        Map result = new HashMap();
        result.put("info", infoRepository.findAll());
        result.put("current_user", userRepository.getByUsername(username));
        return result;
    }

    @GetMapping("/")
    public Map getIndexPage() {
        Map result = new HashMap();
        result.put("info", infoRepository.findAll());
        return result;
    }

}
