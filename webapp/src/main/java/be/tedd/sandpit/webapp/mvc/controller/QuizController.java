package be.tedd.sandpit.webapp.mvc.controller;

import be.tedd.sandpit.webapp.mvc.form.QuizForm;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

/**
 */
@Controller
@RequestMapping("/quiz")
public class QuizController {

    private static final Logger logger = LoggerFactory.getLogger(QuizController.class);

    @RequestMapping(value = "/form", method = RequestMethod.GET)
    public String quizStart(QuizForm quizForm) {
        return "quiz/form";
    }


    @RequestMapping(value = "/form", method = RequestMethod.POST)
    public ModelAndView quizAttempt(@Valid @ModelAttribute QuizForm quizForm, BindingResult bindingResult) {
        ModelAndView mav;

        // Manually reject incorrect fields
        if (quizForm.getColour() != QuizForm.FAVOURITE_COLOUR) {
            bindingResult.rejectValue("colour", "quiz.error");
        }
        if (quizForm.getState() != QuizForm.CORRECT_STATE) {
            bindingResult.rejectValue("state", "quiz.error");
        }

        // validate
        if (bindingResult.hasErrors()) {
            logger.warn("errors: " + bindingResult.getAllErrors());
            mav = new ModelAndView("quiz/form");
            mav.addObject("quizForm", quizForm);
        } else {
            mav = new ModelAndView("redirect:quiz/passed");
        }

        return mav;
    }




}
