package com.java.exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import com.java.ScannerUtils;

public class ExceptionExample1 {

	public static void main(String[] args) {
		String path = "/home/burak/git/JavaOOP/src/test.odt";
		String path_1 = ScannerUtils.read("File okundu...");
		openFile(path_1);
		openAndClosedFile(path);
	}

	public static void openAndClosedFile(String path) {
		File file = new File(path);
		
		try {
			InputStream inputStream = new FileInputStream(file);
			System.out.println("File Opened");
			inputStream.close();
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

	public static void openFile(String path_1) {
		File file = new File(path_1);
		
		try {
			InputStream in = new FileInputStream(file);
			System.out.println("Opened File... ");
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}
}
