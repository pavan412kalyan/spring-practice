package com.spring.springdemo;

import java.awt.List;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	//private String[] quotes = {"QUOTE1","QUOTE2","QUOTE3"};
	
	private Random random = new Random();
	private StringBuilder quote;
	private ArrayList<String> quotes = new ArrayList<String>();
    private String fileName = "C:\\Users\\vikky\\Desktop\\quote.txt";
    		
	
	
	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		
		int index = random.nextInt(quotes.size());
		return quotes.get(index);
	}
	
	
	
	 @PostConstruct
	 void initOfBean() throws IOException
	 {
		 File file = new File(fileName); 
		  
		  BufferedReader br = new BufferedReader(new FileReader(file)); 
		  
		  String st; 
			while ((st = br.readLine()) != null) 
				quotes.add(st);
		  
		 
		} 
		   

}
