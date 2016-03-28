package org.scc

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping

@Controller
class Index {
    @RequestMapping("/")
    public String index() {
        return "/pages/about/welcome.html";
    }
}
