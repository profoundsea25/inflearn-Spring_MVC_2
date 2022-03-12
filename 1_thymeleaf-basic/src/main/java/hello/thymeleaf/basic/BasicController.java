package hello.thymeleaf.basic;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/basic")
public class BasicController {

    @GetMapping("/text-basic")
    public String textBasic(Model model) {
        model.addAttribute("data", "Hello Spring!");
        // Spring을 굵게 표현하고 싶어서 <b></b>태그를 넣으면 html에서 그대로 출력된다. (escape)
        // 이를 방지하고 싶으면 타임리프에서 utext를 사용한다.
        return "basic/text-basic";
    }

    @GetMapping("/text-unescape")
    public String textUnescape(Model model) {
        model.addAttribute("data", "Hello <b>Spring</b>");
        return "basic/text-unescape";
    }
}
