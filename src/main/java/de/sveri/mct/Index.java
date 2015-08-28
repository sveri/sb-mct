package de.sveri.mct;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by sveri on 27.08.2015.
 */
@Controller
public class Index {

    @RequestMapping("/")
    public String index() {
        return "index";
    }

    @RequestMapping("/foo")
    public String foo() {
        return "asdfasdf";
    }
}

