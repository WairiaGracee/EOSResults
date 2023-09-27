package semesterResults;

import java.util.Scanner;

public class Results {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter unit code1: ");
		System.out.println("Enter unit code2: ");
		System.out.println("Enter unit code3: ");
		System.out.println("Enter unit code4: ");
		Scanner scanString = new Scanner(System.in);
		String unitCode1=scanString.nextLine();	
		String unitCode2=scanString.nextLine();	
		String unitCode3=scanString.nextLine();	
		String unitCode4=scanString.nextLine();	
		System.out.println("Enter unit name1: ");
		System.out.println("Enter unit name2: ");
		System.out.println("Enter unit name3: ");
		System.out.println("Enter unit name4: ");
		String unitName1=scanString.nextLine();	
		String unitName2=scanString.nextLine();	
		String unitName3=scanString.nextLine();	
		String unitName4=scanString.nextLine();	
		System.out.println("Enter unit score1: ");
		System.out.println("Enter unit score2: ");
		System.out.println("Enter unit score3: ");
		System.out.println("Enter unit score4: ");
		int score1=scan.nextInt();
		int score2=scan.nextInt();
		int score3=scan.nextInt();
		int score4=scan.nextInt();
		
 System.out.println("                           Department of Computer Science                           ");
 System.out.println("                               End of Semester Results                              ");
 System.out.println("-------------------------------------------------------------------------------------");
 String name="Gracejane Wanjiku";
 String rollNo="C026-01-0959/2022";
 String semester="second";
 System.out.print("|Name:- "+name);
 System.out.print("\t|Roll_No: "+rollNo);
 System.out.println("\t Semester: "+semester);
 System.out.println("____________________________________________________________________________________");
 System.out.println("| Unit Code               | Unit Name:                  Score");
 System.out.println("--------------------------------------------------------------------------------------");
 System.out.print("|"+unitCode1);
 System.out.print("\t\t  |"+unitName1);
 System.out.println("\t\t\t|"+score1);
 System.out.print("|"+unitCode2);
 System.out.print("\t\t  |"+unitName2);
 System.out.println("\t\t\t|"+score2);
 System.out.print("|"+unitCode3);
 System.out.print("\t\t  |"+unitName3);
 System.out.println("\t\t\t|"+score3);
 System.out.print("|"+unitCode4);
 System.out.print("\t\t  |"+unitName4);
 System.out.println("\t\t\t|"+score4);
 System.out.println("----------------------------------------------------------------------------------------");
 int total=score1+score2+score3+score4;
 
 System.out.print("|Total");
 System.out.println("\t\t\t\t\t\t\t|"+total);
 System.out.println("-----------------------------------------------------------------------------------------");
 float avg=total/4;
 System.out.print("|Average");
 System.out.println("\t\t\t\t\t\t|"+avg);
 System.out.println("-----------------------------------------------------------------------------------------");
 System.out.print("|Grade");
 if(avg>=70  && avg<=100)
 {
     System.out.print("A");
 }
 else if(avg>=60 && avg<70)
 {
    System.out.print("B");
 } 
 else if(avg>=50 && avg<60)
 {
     System.out.print("C");
 }
 else if(avg>=40 && avg<50)
 {
     System.out.print("D");
 }
 else if(avg<40) {
	 System.out.print("F");
 }
 else {
	 System.out.print("Invalid marks!");
 }

 System.out.println("\t\t\t\t\t\t\t| ");
 System.out.println("-----------------------------------------------------------------------------------------");
 String recommend="Recommendation";
 System.out.print("\t\t\t\t\t  "+recommend);
 System.out.println("|");
 System.out.println("-----------------------------------------------------------------------------------------");
 System.out.println("Grading Criteria                         Overall Grade(A-D)              Recommend Pass");
 String critic1="70-100";
 String critic2="60-69";
 String critic3="50-59";
 String critic4="40-49";
 String critic5="Below 40";
 char grade1='A';
 char grade2='B';
 char grade3='C';
 char grade4='D';
 char grade5='F';
 System.out.print(""+critic1);
 System.out.println("\t\t"+grade1);
 System.out.print(""+critic2);
 System.out.println("\t\t"+grade2);
 System.out.print(""+critic3);
 System.out.println("\t\t"+grade3);
 System.out.print(""+critic4);
 System.out.println("\t\t"+grade4);
 System.out.print(""+critic5);
 System.out.println("\t"+grade5);
 System.out.println("-----------------------------------------------------------------------------------------");
     }
	
 }
