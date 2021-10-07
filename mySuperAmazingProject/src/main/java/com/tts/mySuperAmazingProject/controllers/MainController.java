package com.tts.mySuperAmazingProject.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
//        import org.springframework.web.bind.annotation.RestController;

@Controller
public class MainController {

        @RequestMapping (value = "/", method = RequestMethod.GET)
        public String home() {
                return "homePage.html";
        }

        @RequestMapping (value = "/aboutMe", method = RequestMethod.GET)
        public String aboutMe() {
                return "aboutMe.html";
        }

        @RequestMapping(value = "/reachOut", method = RequestMethod.GET)
        public String reachOut() {
                return "reachOut.html";
        }

        @RequestMapping (value = "/yesPlease", method = RequestMethod.GET)
        public String yesPlease() {
                return "yesPlease.html";

                }
        }

