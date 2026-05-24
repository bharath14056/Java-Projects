import java.util.Scanner;
class Ride
{
	String Pickup;
	String Drop;
	int Distance;
	Ride(String Pickup,String Drop,int Distance)
		{
		this.Pickup=Pickup;
	    this.Drop=Drop;
        this.Distance=Distance;
	   }
	void Ridedetails()
		{
		System.out.println("Pickup location is :"+Pickup);
		System.out.println("Drop location is :"+Drop);
	     }
}
class Auto extends Ride
{
	String Drivername;
	int price=40;
	Auto(/*String Drivername,*/String Pickup,String Drop,int Distance)
		{
		super( Pickup, Drop,Distance);//super calling statement
		this. Drivername=Drivername;
	    }
		void autodetails()
			{
				//System.out.println("Drivername "+Drivername);
				System.out.println("Total ride cost "+(Distance*price));
			}
}
class Bike extends Ride
{
	String Drivername;
	int price=10;
	Bike(/*String Drivername*/String Pickup,String Drop,int Distance)
		{
		super( Pickup, Drop,Distance);//super calling statement
		//this. Drivername=Drivername;
	    }
		void bikedetails()
			{
				//System.out.println("Drivername "+Drivername);
				System.out.println("Total ride cost "+(Distance*price));
			}
}
class Car extends Ride
{
	String Drivername;
	int price=70;
	Car(/*String Drivername*/String Pickup,String Drop,int Distance)//super calling statement
	{
		super( Pickup, Drop,Distance);
		//this. Drivername=Drivername;
	    }
		void cardetails()
			{
				//System.out.println("Drivername "+Drivername);
				System.out.println("Total ride cost "+(Distance*price));
			}
}
class Usermain 
{
    static Scanner sc=new Scanner(System.in);//used for getting a deatils from user
	public static void main(String[] args) 
	{
		System.out.println("1.Auto \n2.Bike \n3.Car");
		int option=sc.nextInt();//getting the option from user 
		Ride r=null;
		
		switch(option){//using switch case
			case 1:r= new Auto("Alamthi","Redhills",12);
			            break;
			case 2:r= new Bike("Redhills","Alamathi",12);
			            break;
			case 3:r= new Car("Madurai","Thiruvallur",450);
			            break;
						
					default: System.out.println("Wrong option");
		}
		r.Ridedetails();//upcasting 
		if (r instanceof Auto )// 1.here using this it wll avoid the classcast exception,2.here we doing downcast
		{
			Auto a=(Auto) r;
			a.autodetails();
		}
		else if (r instanceof Bike)//here we doing downcast
		{
			Bike b=(Bike)r;
			b.bikedetails();
		}
		else if (r instanceof Car)//here we doing downcast
		{
			Car c=(Car)r;
			c.cardetails();
		}	
	}
}