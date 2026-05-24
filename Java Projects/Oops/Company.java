import java.util.Scanner;
class Employee
{
private	String ename;
private	int eid;
private	long phno;
private	double salary;     

Employee(String ename, int eid,long phno,double sal )
	{
		this. ename =ename;
     	this. eid=  eid;            
		this. phno=phno;      
		this. salary=salary;
	}
	void Displaydetails()
		{
			System.out.println("ename is"+getEname());
			System.out.println("eid is "+getEid());
			System.out.println("phone number"+getPhno());
			System.out.println("Salary "+getSalary());
		}
	public String getEname(){
		return ename;
	}
	public void  setEname(String ename)
	{
		this.ename=ename;
	}
	public int getEid()
	{
		return eid;
	}
	public void  setEid(int eid)
		{
			this.eid=eid;
		}
		public long getPhno()
	{
		return phno;
	}
	public void setPhno(long phno)
		{
			this.phno=phno;
		}
     public double getSalary()
	{
		return salary;
	}
	public void  setSalary(double salary)
		{
			this.salary=salary;
		}
}

class Developers extends Employee
{
	String skills[]=new String[3];
	Developers(String ename, int eid,long phno,double salary,String[] skills)
		{
			super( ename,  eid, phno, salary);
			for (int i=0; i<3;i++ )
			{
				this.skills[i]=skills[i];
			}
		}
			void displayskills(){
				System.out.println("The Skills are:");
				for (String skill:skills )
				{
					System.out.println(skill+" ");
				}
				{
					
				}
			}
		}
	

class TestEngineer extends Employee
{
	String Testingtools[]=new String[3];
	TestEngineer(String ename, int eid,long phno,double salary,String[] Testingtools)
		{
			super( ename,  eid, phno, salary);
			for (int i=0; i<3;i++ )
			{
				this.Testingtools[i]=Testingtools[i];
			}
		}
	
}

class Company 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		
		/*String arr[]={"Java","Sql","web"};
	  Employee d1=new Developers("Vikiram",01,784575L,5000.0,arr);
		d1.Displaydetails();
		*/
		System.out.println("1.Developer \n2.Test Engineer");
		System.out.println("Select any one option : ");
		int option=sc.nextInt();
		String ename;
		int eid;
		long phno;
		double salary;
		switch (option)
		  {
		case 1 :System.out.println("Enter the Employee name :");
				ename=sc.next();
				System.out.println("Enter the Employee id :");
				eid=sc.nextInt();
				System.out.println("Enter the Employee phone number :");
				phno=sc.nextLong();
				System.out.println("Enter the Employee salary :");
				salary=sc.nextDouble();
				String arr[]={"Java","Sql","web"};
	  Employee d1=new Developers(ename,eid,phno,salary,arr);
						d1.Displaydetails();
						break;

	  case 2 :System.out.println("Enter the Employee name :");
				ename=sc.next();
				System.out.println("Enter the Employee id :");
				eid=sc.nextInt();
				System.out.println("Enter the Employee phone number :");
				phno=sc.nextLong();
				System.out.println("Enter the Employee salary :");
				salary=sc.nextDouble();
				String arr1[]={"Selenium","QTP","LoadRunner"};
						Employee t1=new TestEngineer(ename,eid,phno,salary,arr1);
						t1.Displaydetails();
						break;
		   default:System.out.println("Invalid option");
						break;	
		}
		
		
	}
}