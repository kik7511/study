package com.mycompany.study.day1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Day1 {
	public static int getMaxium() throws IOException{
		List<String> LineList = Files.readAllLines(Paths.get("./input.txt"));
		System.out.println(LineList);
		
		return 0;
	}
	
	public static void main(String[] args) throws IOException {
		System.out.println(Day1.getMaxium());
	}
}
