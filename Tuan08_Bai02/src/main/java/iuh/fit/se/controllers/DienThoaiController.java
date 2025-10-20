package iuh.fit.se.controllers;

import iuh.fit.se.entities.DienThoai;
import iuh.fit.se.services.DienThoaiService;
import iuh.fit.se.services.NhaCungCapService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.*;

@Controller
@RequestMapping("/dienthoai")
public class DienThoaiController {

    @Autowired
    private DienThoaiService dienThoaiService;

    @Autowired
    private NhaCungCapService nhaCungCapService;

    @GetMapping
    public String list(Model model) {
        model.addAttribute("dsDienThoai", dienThoaiService.findAll());
        return "listDienThoai";
    }

    @GetMapping("/add")
    public String addForm(Model model) {
        model.addAttribute("dienThoai", new DienThoai());
        model.addAttribute("dsNCC", nhaCungCapService.findAll());
        return "addDienThoai";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute DienThoai dt,
                       @RequestParam("imageFile") MultipartFile file) throws IOException {

        if (!file.isEmpty()) {
            String filename = file.getOriginalFilename();
            Path uploadDir = Paths.get("src/main/webapp/images");
            if (!Files.exists(uploadDir)) Files.createDirectories(uploadDir);
            Files.copy(file.getInputStream(), uploadDir.resolve(filename),
                    StandardCopyOption.REPLACE_EXISTING);
            dt.setHinhAnh(filename);
        }
        dienThoaiService.save(dt);
        return "redirect:/dienthoai";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable("id") String id) {
        dienThoaiService.delete(id);
        return "redirect:/dienthoai";
    }
}
