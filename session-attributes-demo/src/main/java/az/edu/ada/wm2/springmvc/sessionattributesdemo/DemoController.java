package az.edu.ada.wm2.springmvc.sessionattributesdemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

public class DemoController {


    @Controller
    @RequestMapping("/demo")
    public class DemoController {

        @GetMapping("/test1")
        public String testEndpoint(Model model) {
            model.addAttribute("object", "Welcome!");
            return "redirect:/demo/test2";
        }

        @GetMapping("/test2")
        public String test2Endpoint() {
            return "demo/list";
        }

    }
}