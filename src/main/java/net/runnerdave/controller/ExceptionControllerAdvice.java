package net.runnerdave.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * Created by runnerdave on 26/06/17.
 */
@ControllerAdvice
public class ExceptionControllerAdvice {
    private static final String GLOBAL_EXCEPTION_TEMPLATE = "views/globalControllerHandler";

    @ExceptionHandler(Exception.class)
    public String exception(Exception exception, Model model) {
        model.addAttribute("exception", exception);
        return GLOBAL_EXCEPTION_TEMPLATE;
    }
}
