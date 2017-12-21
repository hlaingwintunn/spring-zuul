package com.hlaing.springzuulfoosresource;

import static org.apache.commons.lang3.RandomStringUtils.randomAlphabetic;
import static org.apache.commons.lang3.RandomStringUtils.randomNumeric;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class FooController {
	
	@RequestMapping(value= "/foo/{id}", method= RequestMethod.GET)
	@ResponseBody
	public Foo findById(@PathVariable long id, HttpServletRequest req, HttpServletResponse res) {
		// System.out.println(req.getHeaderNames());
        // System.out.println("------" + req.getHeader("Test"));
        if (req.getHeader("Test") != null) {
            res.addHeader("Test", req.getHeader("Test"));
        }
        return new Foo(Long.parseLong(randomNumeric(2)), randomAlphabetic(4));
		
	}

}
