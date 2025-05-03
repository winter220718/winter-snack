package jsj.store.winter_snack.controller;

import jsj.store.winter_snack.dto.CodeDto;
import jsj.store.winter_snack.dto.ItemDto;
import jsj.store.winter_snack.service.CodeService;
import jsj.store.winter_snack.service.ItemService;
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
    private final ItemService itemService;

    public HomeController(CodeService codeService, ItemService itemService) {
        this.codeService = codeService;
        this.itemService = itemService;
    }

    @GetMapping
    public String goHome(Model model) {
        List<String> category = codeService.getCodeDc("001"); // 카테고리
        model.addAttribute("category", category);
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


    @GetMapping("item")
    public List<ItemDto> selectItem(String codeDc) {
        return itemService.selectItembyCty(codeDc);
    }



}
