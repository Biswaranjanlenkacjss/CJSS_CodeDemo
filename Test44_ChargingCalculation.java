package com.app_partice;

import java.util.Scanner;

public class Test44_ChargingCalculation {

	public static void main(String[] args) {
	 Scanner scanner=new Scanner(System.in);
	 System.out.print("Enter the Battery capacity(In KW): ");
	 double bCapacity=scanner.nextDouble();
	 System.out.print("Enter the Fan capacity(In KWH): ");
	 double fCapacity=scanner.nextDouble();
	 System.out.print("Enter the Fan RPM(Potation Per Minute : ");
	 double fRpm=scanner.nextDouble();
	 System.out.print("Enter the Total No of Rotation Done By Fan: ");
	 double tRpm=scanner.nextDouble();
	 
	 double totaltime=tRpm/fRpm;//Total no of Time fan rotate
	 double hours=totaltime/60;
	 double powerConsume=hours*fCapacity;
	 double charRemainBat=bCapacity-powerConsume;
	 System.out.println("Charching Present in Battery is:"+charRemainBat+" KW");
	 
	 System.out.print("You Want to add Additinal Charge to Battery:[yes/no]:");
	 String status=scanner.next();
	 
	 if(status.equals("yes")) {
	 System.out.print("Enter the Addition Charged to the Bateery (In KW) :");
	 double addChargeBa=scanner.nextDouble();
	 double newChargeBa=charRemainBat+addChargeBa;
	
	 double fRemainRun=newChargeBa/fCapacity;
	 System.out.println("With Remaining Charge, The Fan Can be Run for:"+fRemainRun+" Hours");
	 }else {
		 double fOldRemainRun=charRemainBat/fCapacity;
		 System.out.println("With Remaining Charge, The Fan Can be Run for:"+fOldRemainRun+" Hours");
	 }
	
	}

}
