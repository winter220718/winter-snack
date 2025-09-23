package jsj.store.winter_snack.controller;

import jsj.store.winter_snack.dto.CodeDto;
import jsj.store.winter_snack.service.CodeService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static jsj.store.winter_snack.util.ResponseUtil.getResponseOk;

@Controller
public class CodeController {


    private final CodeService codeService;

    public CodeController(CodeService codeService) {
        this.codeService = codeService;
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

    @PostMapping("/code/delete")
    public ResponseEntity<Map<String, Object>> deleteCode(String codeSeq) {
        codeService.deleteCode(codeSeq);
        return getResponseOk();
    }

    @PostMapping("/code/update")
    public ResponseEntity<Map<String, Object>> updateCode(CodeDto codeDto) {
        codeService.updateCode(codeDto);
        return getResponseOk();
    }

}
