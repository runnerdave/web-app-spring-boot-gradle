package net.runnerdave.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.web.ErrorAttributes;
import org.springframework.boot.autoconfigure.web.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * Created by runnerdave on 26/06/17.
 */
@Controller
public class CustomErrorHandler {
    private static final String CONTACT_US_ERROR_PATH = "/contactUsError";
    private static final String NOT_FOUND_ERROR_PATH = "/404";
    private static final String CONTACT_US_ERROR_TEMPLATE = "views/contactUsError";
    private static final String NOT_FOUND_ERROR_TEMPLATE = "views/404";

    private final ErrorAttributes errorAttributes;

    @Autowired
    public CustomErrorHandler(ErrorAttributes errorAttributes) {
        this.errorAttributes = errorAttributes;
    }

    @RequestMapping(CONTACT_US_ERROR_PATH)
    public String getContactUsErrorPath(Model model, HttpServletRequest request) {
        Map<String, Object> error = getErrorAttributes(request, true);

        model.addAttribute("timestamp", error.get("timestamp"));
        model.addAttribute("status", error.get("status"));
        model.addAttribute("error", error.get("error"));
        model.addAttribute("message", error.get("message"));
        model.addAttribute("path", error.get("path"));
        return CONTACT_US_ERROR_TEMPLATE;
    }

    @RequestMapping(NOT_FOUND_ERROR_PATH)
    public String getNotFoundErrorPath(Model model,HttpServletRequest request) {
        model.addAttribute("error", getErrorAttributes(request,true));
        return NOT_FOUND_ERROR_TEMPLATE;
    }

    private Map<String, Object> getErrorAttributes(HttpServletRequest request, boolean includeStackTrace) {
        RequestAttributes requestAttributes = new ServletRequestAttributes(request);
        return this.errorAttributes.getErrorAttributes(requestAttributes, includeStackTrace);
    }
}
