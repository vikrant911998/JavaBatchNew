package com.student.los.start;

import com.student.los.operation.LOSProcess;
import com.student.los.utils.Utility;

public class LOSApplication {

	public static void main(String[] args) {
		LOSProcess losprocess = new  LOSProcess();

		System.out.println("Do You have the applicaton number");
		int applicationNumber = Utility.scanner.nextInt();
		
		if(applicationNumber == -1) {
			System.out.println("Thanks for Using");
			System.exit(0);
		}
		if(applicationNumber == 0) {
//			losprocess.sourcing
		}
		else {
//			losProcess.checkStage(applicationNumber);
		}
		
		
	}

}
