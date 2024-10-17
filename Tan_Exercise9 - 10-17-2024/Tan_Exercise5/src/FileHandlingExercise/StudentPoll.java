package FileHandlingExercise;

import java.util.Scanner;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Formatter;

public class StudentPoll {
	public static void main (String[] args) throws IOException {
		createNumbersTxt();
		createOutputTxt();
	}
	
	public static void createNumbersTxt() throws IOException {
		Formatter numbers = new Formatter(new FileWriter("numbers.txt"));
		System.out.println("WELCOME TO SURVEY RESPONSES");
		int surveyResponse = 0;
		do {
			surveyResponse = getSurveyResponses();
			if (surveyResponse > 10 || surveyResponse <= 0)
				break;
			numbers.format("%d\n", surveyResponse);
			
		} while (true);
		numbers.flush();
		numbers.close();
	}
	
	public static void createOutputTxt() throws IOException {
		Formatter output = new Formatter("output.txt");
		Scanner fileScan = new Scanner(new FileReader("numbers.txt"));
		
		while (fileScan.hasNextInt()) {
			int x = fileScan.nextInt();
			output.format("%d\n",x);
		}
		
		output.flush();
		output.close();
	}
	
	public static int getSurveyResponses() {
		Scanner scan = new Scanner(System.in);
		int response = 0;
		System.out.println("Enter survey response from 1-10:");
		response = scan.nextInt();
		return response;
	}

	
}
