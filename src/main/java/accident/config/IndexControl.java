package accident.config;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class IndexControl {

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("users", List.of(
                "Ivanov",
                "Petrov",
                "Sidorov"
        ));
        return "index";
    }
}
