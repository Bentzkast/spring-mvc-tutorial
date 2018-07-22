package com.example.mvctutorial;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;


// step 1 : define controller
@Controller
public class HomeController {

    // step 2 : define routes
    @RequestMapping("/")
    public String index() {
        return "main";
    }

    @RequestMapping("/processReq")
    public String processReq(HttpServletRequest request, Model model) {
        // read the request paramater from html form
        String name = request.getParameter("playerName");
        // modify the name
        name = name.toUpperCase();
        // add the message to the model
        model.addAttribute("playerName",name);
        return "greeting";
    }

}
