package org.capsules;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CapsuleFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file =new File("src/main/resources/capsules.json");
		Scanner scan = null;
		try {
			scan = new Scanner(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		while(scan.hasNextLine())
		{
			System.out.println(scan.nextLine());
		}

	}

}
