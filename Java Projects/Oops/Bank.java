import java.util.Scanner;
class Accounts
{
	String BankName;
	String AccountHolder;
	long acNo;
	long phNo;
   double balance=100;
	int pin ;
	
	Accounts(String BankName,String AccountHolder,long acNo,long phNo,int pin )
		{
		this. BankName=BankName;
	    this. AccountHolder=AccountHolder;
        this. acNo=acNo;
        this. phNo=phNo;
        this. pin =pin;
	    }
		
		void DisplayBalance()
			 {
			
		  System.out.println("Enter account number:");
        int ac = sc.nextInt();  
			if (ac==acNo)
			{
			
			    System.out.println(this.AccountHolder+"you have "+this.balance+" Rs in your Account !");
			}
			        
		     }
			 void Deposit(int money)
				 {
					this.balance+=money;
					System.out.println("Deposit Succesfully!");
				 }
			void Withdrawl(int money)
			    {	
				if (balance>=money)
				{
					balance -=money;
					System.out.println("Withdrawl done succesfully");
				}
				else{
					System.out.println("Insufficient Balance");
				}
		       	}
		   void userDetails()
			   {
			      System.out.println("The Bank Name "+BankName);
				  System.out.println("The Account Holder Name is "+AccountHolder);
		          System.out.println("The Account Number is :"+acNo);
				  System.out.println("Your Balance is : "+balance);
	
			   }
}


class Bank
{
    static Scanner sc=new Scanner(System.in);
    
    
    public static void main(String args[]){
        Accounts user1=new Accounts("ICIC","Bharath",8020116045867L,897594745L,4587);

        int option;   // declare here

        do{
        System.out.println("1.Display Balance\n2.Display userDetails \n3.Display Deposit \n4.Withdrawl \n0.Exit");
        System.out.print("Enter any one option: ");
        option=sc.nextInt();
        int amount;

        switch(option)
        {
            case 1:System.out.println("Enter the Acoount Number: "); 
			    int ac=nextInt();      
			user1.DisplayBalance();
				break;
			case 2: user1.userDetails();
				break;

            case 3:
                System.out.print("Enter the Deposit amount: ");
                amount=sc.nextInt();
                user1.Deposit(amount);
                break;

            case 4:
                System.out.print("Enter Withdrawl Amount: ");
                amount=sc.nextInt();
                user1.Withdrawl(amount);
                break;

            case 0:
                System.out.println("Thank you");
                break;

            default:
                System.out.println("Invalid option");
        }

        }while(option!=0);   // correct exit condition
    }
}


	
