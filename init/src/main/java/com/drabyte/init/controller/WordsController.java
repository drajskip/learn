package com.drabyte.init.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.drabyte.init.service.WordService;


@Controller
@RequestMapping("/words/")
public class WordsController {

	@Autowired
	private WordService wordService;

	@RequestMapping(method=RequestMethod.GET)
	public String get(Model model) {
		return get(3,model);
	}

	@RequestMapping(method=RequestMethod.GET, value="{size}")
	public String get(@PathVariable Integer size,Model model) {
		model.addAttribute("wordList", wordService.getWords(size));
		return "words";
	}

	@RequestMapping(method=RequestMethod.POST,value="verifyAll")
	public String verifyAll() {
		return null;
	}

	@RequestMapping(method=RequestMethod.POST,value="verify/{word}")
	public String verifyOne(@PathVariable String word, @RequestParam String translation) {
		return null;
	}

}
