
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
	    
		
		
	}

}
