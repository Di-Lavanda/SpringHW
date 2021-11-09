package ru.ibs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;

@org.springframework.stereotype.Controller
public class Controller {
    @Autowired
    @Qualifier("engineMapAdv")
    HashMap<String, Engine> engineMapAdv;

    @FuelExceptionHandle
    @GetMapping("/mvc/fuel/check")
    public String checkEngine(@RequestParam(name = "type", required = false) String type, Model model) throws Exception {
        model.addAttribute("name", engineMapAdv.get(type).powerUp());
        return "show";

    }

}
