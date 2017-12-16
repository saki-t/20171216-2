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
			BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(f), "SJIS"));

			String line;
			while ((line = br.readLine()) != null) {
				String[] data = line.split(",", 0);
				String code = data[3];
				System.out.println(code);



//				if(code.equals("1")){
//					System.out.println("社員コード："+data[0]+"，社員名："+data[1]+"，部門名："+data[2]+"，採用担当です");
//				};
//
//				if(code.equals("2")){
//					System.out.println("社員コード："+data[0]+"，社員名："+data[1]+"，部門名："+data[2]+"，総務担当です");
//				};
//
//				if(code.equals("3")){
//					System.out.println("社員コード："+data[0]+"，社員名："+data[1]+"，部門名："+data[2]+"，開発担当です");
//				};


				/*
				 * for (String elem : data) { System.out.println(elem); }
				 */
			}
			br.close();

		} catch (IOException e) {
			System.out.println(e);
		}
	}
}