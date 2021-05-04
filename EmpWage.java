
public class EmpWage
{
	public static void main(String[] args)
	{
		System.out.println("welcome");
		//UC1
		int IS_FULL_TIME=1;
		double empCheck=Math.floor(Math.random() *10 ) %2;
		if(empCheck==IS_FULL_TIME)
		{
			System.out.println("emp is present");
		}
		else
		{
			System.out.println("employee is abscent");
		}
		
		//UC2
	    int empWage=20;
	    int empHr=8;
	    int salary=0;
	    if(empCheck==IS_FULL_TIME)
	    {
	    	salary=empWage*empHr;
	    	System.out.println("salary is " +salary);
	    	
	    }
	    else
	    {
	    	System.out.println("employee is abscent");
	    }
	    
		//UC3
	    
	    double empCheck1=Math.round(Math.random()*10)%3;
	    int IS_PART_TIME=2;
	    if (empCheck1==IS_FULL_TIME)
	    {
	    	empHr=8;
	    }
	    else if(empCheck1==IS_PART_TIME)
	    {
	    	empHr=4;
	    }
	    else
	    {
	    	empHr=0;
	    	System.out.println("employee is abscent");
	    }
		salary=empWage*empHr;
		System.out.println("salary depending on part time full time is "+salary);
		
		//UC4
		int empCheck2=(int)empCheck1;
		switch( empCheck2 )
		{
		case 1 :
			 empHr=8;
			 break;
		case 2 :
			empHr=4;
			break;
		default:
			empHr=0;
			System.out.println("employee is abscent");
			break;
		}
		
		System.out.println("salary of employee using switch case "+(empHr*empWage));
		
		//UC5
		int totalsalary =0;
		salary=0;
		for(int i =1 ; i<=20 ; i++)
		{
			 double empCheck3=Math.round(Math.random()*10)%3;
			 if (empCheck3==IS_FULL_TIME)
			    {
			    	empHr=8;
			    }
			    else if(empCheck3==IS_PART_TIME)
			    {
			    	empHr=4;
			    }
			    else
			    {
			    	empHr=0;
			    	System.out.println("employee is abscent");
			    }
			
			   salary=empHr*empWage;
			   totalsalary=salary+totalsalary;
			
		}
		System.out.println("total salary for 20 days "+totalsalary);
		
		}
	

}
