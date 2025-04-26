package jsj.store.winter_snack.controller;

import jsj.store.winter_snack.dto.CodeDto;
import jsj.store.winter_snack.service.CodeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/")
public class HomeController {

    private final CodeService codeService;

    public HomeController(CodeService codeService) {
        this.codeService = codeService;
    }

    @GetMapping
    public String goHome() {
        return "home/home";
    }

    @GetMapping("/code/list")
    public String makeCode(Model model) {
        List<CodeDto> code = codeService.getCodes();
        model.addAttribute("code", code);
        return "code";
    }

    @PostMapping("/code/insert")
    public String insertCode(CodeDto codeDto) {
        codeService.insertCode(codeDto);
        return "redirect:/code/list";

    }

}
