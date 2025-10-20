package iuh.fit.se.controllers;

import iuh.fit.se.services.NhaCungCapService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/nhacungcap")
public class NhaCungCapController {

    @Autowired
    private NhaCungCapService service;

    @GetMapping
    public String list(@RequestParam(value = "keyword", required = false) String keyword, Model model) {
        if (keyword != null && !keyword.isEmpty()) {
            model.addAttribute("dsNCC", service.search(keyword));
        } else {
            model.addAttribute("dsNCC", service.findAll());
        }
        model.addAttribute("keyword", keyword);
        return "listNCC";
    }
}
