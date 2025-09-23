package jsj.store.winter_snack.controller;

import jsj.store.winter_snack.dto.CodeDto;
import jsj.store.winter_snack.dto.ItemDto;
import jsj.store.winter_snack.service.CodeService;
import jsj.store.winter_snack.service.ItemService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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
        // 카테고리
        model.addAttribute("category", codeService.getCodeDc("001"));
        return "home/home";
    }
    @GetMapping("item")
    public List<ItemDto> selectItem(ItemDto itemDto) { // json을 객체로 변환
        System.out.println("itemDto = " + itemDto);
        return itemService.selectItembyCty(itemDto);
    }



}
