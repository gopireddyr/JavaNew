package logics;

import java.util.ArrayList;

public class TutionCalculator {
	
	
	String name;
	int student_id;
	char student_level;
	int residancy_status;
	int credit_hours;
	
	public TutionCalculator() {
		super();
	}

	public TutionCalculator(String name, int student_id, char student_level, int residancy_status, int credit_hours) {
		super();
		this.name = name;
		this.student_id = student_id;
		this.student_level = student_level;
		this.residancy_status = residancy_status;
		this.credit_hours = credit_hours;
	}
	
	
	public static void main(String[] args) {
		TutionCalculator[] s=new TutionCalculator[5];
		s[0]=new TutionCalculator("Rahul",1,'G',10,30);
		s[1]=new TutionCalculator("Gopi",2,'B',11,50);
		s[2]=new TutionCalculator("Krishna",3,'G',20,60);
		s[3]=new TutionCalculator("Thrived",4,'B',15,10);
		s[4]=new TutionCalculator("Rakesh",5,'G',25,33);
		tutionCalculator(s);
	}

	private static void tutionCalculator(TutionCalculator[] s) {
		ArrayList<TutionCalculator> Gstudents=new ArrayList<>();
		ArrayList<TutionCalculator> Bstudents=new ArrayList<>();
		float[] tutionfee=new float[s.length];
		//printing all students
		System.out.println("1.printing all students");
		for(int i=0;i<s.length;i++)
		{
		System.out.println("Student name : "+s[i].name +" , Study level : "+s[i].student_level+" , Study level : "+s[i].residancy_status+" , Study level : "+s[i].credit_hours);
		if(s[i].student_level=='G')
		{
			Gstudents.add(s[i]);
		}
		if(s[i].student_level=='B')
		{
			Bstudents.add(s[i]);
		}
		tutionfee[i]=(float) (185.5*s[i].credit_hours*s[i].residancy_status);
		}
		System.out.println("\n"+"2. Printing only undergraduate students");
		for(int i=0;i<Bstudents.size();i++)
		{
			System.out.println("Student name : "+Bstudents.get(i).name+" , Study level : "+Bstudents.get(i).student_level);	
		}
		
		System.out.println("\n"+"3. Printing only graduate students");
		for(int i=0;i<Gstudents.size();i++)
		{
			System.out.println("Student name : "+Gstudents.get(i).name+" , Study level : "+Gstudents.get(i).student_level);	
		}
		System.out.println("\n"+"3. Printing students tution");
		for(int i=0;i<s.length;i++)
		{
		System.out.println("Student name : "+s[i].name+", Tution fee : "+tutionfee[i]);
		}
		
		
	}

}
