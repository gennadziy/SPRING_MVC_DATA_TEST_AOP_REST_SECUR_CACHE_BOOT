package gennadziy;

import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
public class HelloContr {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String name () {
        return "index";
    }

    @GetMapping(value = "/1")
    public String name1 () {
        return "in";
    }

    @GetMapping(value = "/pass")
    public String passData () {
        return "pass";
    }

    @PostMapping(value = "/pass")
    public ModelAndView passData( @ModelAttribute("user") User user, ModelAndView modelAndView ) {
        System.out.println ( user );
        modelAndView.setViewName ( "redirect:/summary" );
        modelAndView.addObject ( "user", user );
        return modelAndView;
    }


    @GetMapping(value = "/greeting/{userName}")
    public ModelAndView passData( @PathVariable String userName, ModelAndView modelAndView ) {
        modelAndView.setViewName ( "redirect:/greeting" );
        modelAndView.addObject ( "userName", userName );
        return modelAndView;

    }
    }
