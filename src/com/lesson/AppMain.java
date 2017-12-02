package com.lesson;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class AppMain {

	public static void main(String[] args) {
		 try {
		      File f = new File("C:\\Users\\higuchi0929\\Desktop\\data.csv");
		      BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(f),"SJIS"));

		      String line;
		      while ((line = br.readLine()) != null) {
		        String[] data = line.split(",", 0);

		        for (String elem : data) {
		          System.out.println(elem);
		        }
		      }
		      br.close();

		    } catch (IOException e) {
		      System.out.println(e);
		    }
}}