package com.student.los.utils;

import java.util.Scanner;

public class Utility implements StageConstants{
	public static int applicationId = 130;
	
	private Utility() {
		
	}
	
	public static String getStageName(int stageid) {
		
		switch(stageid) {
			
			case SOURCING:return "SOURCING";
				
			case QDE: return "QDE";
				
			case DEDUPE: return "DEDUPE";
				
			case SCORING: return "SCORING";
				
			case APPROVAL: return "APPROVAL";
				
			case REJECT: return "REJECT";
				
			default: return "INVALID STAGE";
		}
	}
	
	public static Scanner scanner = new Scanner(System.in);
}
