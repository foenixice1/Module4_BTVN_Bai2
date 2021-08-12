package controller;

import models.HocVien;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import service.CRUDHocVien;

import javax.servlet.http.HttpServletRequest;

@Controller
public class HocVienServlet {
    CRUDHocVien crudHocVien = new CRUDHocVien();

    @RequestMapping("/show")
    public String show(HttpServletRequest request) {
        request.setAttribute("list",crudHocVien.list);
        return "index.jsp";
    }

    @GetMapping("/edit")
    public String showEdit(HttpServletRequest request, @RequestParam int index){
        request.setAttribute("hocVien",crudHocVien.list.get(index));
        return "edit.jsp";
    }
    @GetMapping("/create")
    public String showCreate() {
        return "create.jsp";
    }

    @GetMapping("/delete")
    public String delete(@RequestParam int index) {
        crudHocVien.delete(index);
        return "redirect:/show";
    }

    @PostMapping("/edit")
    public String edit(@RequestParam int index,@ModelAttribute HocVien hocVien) {
        crudHocVien.edit(hocVien, index);
        return "redirect:/show";
    }

    @PostMapping("/create")
    public String creaate(@ModelAttribute HocVien hocVien) {
        crudHocVien.save(hocVien);
        return "redirect:/show";
    }
}
