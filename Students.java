import java.io.*;
import java.util.Scanner;
import java.lang.String;

class Students
{
	
	public static void main(String[] args)throws Exception

	{
		String name;
		String roll;
	   String kannada; 
		String english;
   	String maths;
 		String java;
		String choice;
		
		Scanner SC=new Scanner(System.in);

		System.out.println("enter name");
		name=SC.nextLine();
		System.out.println("enter roll number");
		roll=SC.nextLine();
		System.out.println("enter markes in kannada,english,maths,java");
		kannada=SC.nextLine();
		english=SC.nextLine();
		maths=SC.nextLine();
		java=SC.nextLine();
		
		File f=new File("STUDENT___DETIALS.txt");
		f.createNewFile();

		FileWriter writer=new FileWriter(f);
		writer.write("STUDENTS NAME IS=		  "+name);
		writer.write("\nSTUDENTS ROOLNUMBER IS="+roll);
		writer.write("\nKANNADA MARKS IS=		 "+kannada);
		writer.write("\nENGLISH MARKS IS=		 "+english);
		writer.write("\nMATHS MARKS IS=		 "+maths);
		writer.write("\nJAVA MARKS IS=			 "+java);
		writer.close();
		
		System.out.println("1. VIEW IN PREVIOUS STUDENTS DETIALS");
		System.out.println("2.DISPLAY STUDENS DTIAILS");

		System.out.println("******ENTER YOUR CHOICE******");
		
		Scanner Sc=new Scanner(System.in);
		choice=Sc.nextLine();
		for(int i=1;i<3;i++)
			switch(i)
			{
				case 1:	      
							  FileReader reader = new FileReader(f);
							  int c;
						     c=reader.read();
							  break;
				
				case 2:	System.out.println("STUDENT DETAILS IS :");
						System.out.println("***********************");
						System.out.println("student name is     ="+name);
						System.out.println("ROLL NUMBER IS      ="+roll);				
  					 	System.out.println("KANNADA MARK'S IS   ="+kannada);
						System.out.println("ENGLISH MARK'S IS   ="+english);
						System.out.println("MATHS MARK'S IS\t    ="+maths);
						System.out.println("JAVA MARK'S IS\t    ="+java);
						break;
						
			}
	
	
	}
}