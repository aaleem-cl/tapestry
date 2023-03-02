package com.tapestry.myFirstTapestry.pages;

import java.util.Random;

import org.apache.tapestry5.annotations.InjectPage;
import org.apache.tapestry5.annotations.Log;

public class GuessTheNumber {
	private int randomNumber;
    @InjectPage
    private Guess guess;

	@Log
	Object onActionFromStart() {
		 randomNumber = new Random().nextInt(10);
		 int target = randomNumber+1;
	     guess.setup(target);
	     return guess;
	}
}
