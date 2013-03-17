package com.drabyte.init.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.google.common.collect.ImmutableMap;


@Service
public class WordService {


	static final Map<String, String> dictionaryMap = ImmutableMap.of(
	        "haben", "miec",
	        "danke", "dziekowac",
	        "ab" , "od"
	);

	public List<String> getWords(int num) {
		List<String> words = new ArrayList<String>();
		if (num >3) {
			num = 3;
		}
		for (int i=0 ;i <num;i++) {
			Iterator<String> iter = dictionaryMap.keySet().iterator();
			words.add(iter.next());
		}
		return words;
	}


	public void verfyWords(Map<String,String> wordsToVerify) {
		for (String word : wordsToVerify.keySet()) {
			if (!wordsToVerify.get(word).equals(dictionaryMap.get(word))) {
				throw new WordVerificationException(word, wordsToVerify.get(word), dictionaryMap.get(word));
			}
		}
	}
}
