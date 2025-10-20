package iuh.fit.se.controllers;

import iuh.fit.se.entities.Employee;
import iuh.fit.se.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService service;

    @GetMapping
    public String list(Model model, @RequestParam(value = "keyword", required = false) String keyword) {
        List<Employee> employees = (keyword == null) ? service.getAll() : service.search(keyword);
        model.addAttribute("list", employees);
        return "list";
    }

    @GetMapping("/add")
    public String addForm(Model model) {
        model.addAttribute("employee", new Employee());
        return "register";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute Employee employee) {
        service.save(employee);
        return "redirect:/employees";
    }

    @GetMapping("/edit/{id}")
    public String edit(@PathVariable Long id, Model model) {
        model.addAttribute("employee", service.getById(id));
        return "update";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Long id) {
        service.delete(id);
        return "redirect:/employees";
    }
}

