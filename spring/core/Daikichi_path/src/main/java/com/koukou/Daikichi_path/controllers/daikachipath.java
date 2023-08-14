package com.koukou.Daikichi_path.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class daikachipath {
	@RequestMapping("/daikichi/{var1}/{var2}")
	 public String main_daikichi(@PathVariable ("var1") String var1,
				@PathVariable ("var2") String var2) {
		return "Congratulations! You will soon " +var1 + " "+ "to" +" " +var2; 
	}
	@RequestMapping("/daikichi/lotto/{number}")
    public String getLottoFortune(@PathVariable int number) {
        String fortuneMessage;

        if (number % 2 == 0) {
            fortuneMessage = "You will take a grand journey in the near future, but be weary of tempting offers.";
        } else {
            fortuneMessage = "You have enjoyed the fruits of your labor but now is a great time to spend time with family and friends.";
        }

        return fortuneMessage;
    }
	
	
}
