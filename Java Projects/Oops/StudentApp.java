//Using Encapsulation Student Details .
import java.util.Scanner;

public class StudentApp
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);//creating a Scanner.
        StudentDetails s = null;

        int choice;

        do                                                                              //using do while loop. 
        {
            System.out.println("\n1.Create Record");
            System.out.println("2.Average Marks");
            System.out.println("3.Change Phone Number");
            System.out.println("4.Display Name and ID");
            System.out.println("5.Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch(choice)           //using switch case.
            {
                case 1:

                    sc.nextLine();

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();

                    int m[] = new int[5];

                    System.out.println("Enter 5 Marks:");

                    for(int i=0;i<5;i++)
                    {
                        m[i] = sc.nextInt();
                    }

                    System.out.print("Enter Phone Number: ");
                    long ph = sc.nextLong();

                    s = new StudentDetails(name,id,m,ph);

                    System.out.println("Record Created Sucessfully!");
                    break;

                case 2:
                    System.out.println("Average = " + s.avgMarks());
                    break;

                case 3:
				
                    System.out.print("Enter New Phone Number: ");
					long n=sc.nextLong();
                   // s.setPhno(sc.nextLong());
					if (n==s.getPhno())
					{
						System.out.println("Already Exist");
					}
					else{
				    int num=(int)(Math.random()*9999);//Creating a otp randomly by compiler
					System.out.println("Your otp is:"+num);
					System.out.print("Enter the opt");
					int otp=sc.nextInt();
					if (otp==num)
					{
						System.out.println("Sucessfully Changed");
					}
					else
						{
						System.out.println("Invalid otp!");
					}
					}
                    break;

                case 4:
                    System.out.println("Name: " + s.getName());
                    System.out.println("ID: " + s.getId());
                    break;

                case 5:
                    System.out.println("Thank you");
                    break;

                default:
                    System.out.println("Invalid Choice");
            }

        }while(choice!=5);
    }
}

/*Output

C:\Users\Bharath.S\OneDrive\Desktop\Java Projects>java StudentApp.java

1.Create Record
2.Average Marks
3.Change Phone Number
4.Display Name and ID
5.Exit
Enter choice: 1
Enter Name: Bharath
Enter ID: 105
Enter 5 Marks:
88
78
45
12
78
Enter Phone Number: 7695833428
Record Created Sucessfully!

1.Create Record
2.Average Marks
3.Change Phone Number
4.Display Name and ID
5.Exit
Enter choice: 2
Average = 60.2

1.Create Record
2.Average Marks
3.Change Phone Number
4.Display Name and ID
5.Exit
Enter choice: 3
Enter New Phone Number: 78945854
Your otp is:4498
Enter the opt
4498
Sucessfully Changed

1.Create Record
2.Average Marks
3.Change Phone Number
4.Display Name and ID
5.Exit
Enter choice: 4
Name: Bharath
ID: 105

1.Create Record
2.Average Marks
3.Change Phone Number
4.Display Name and ID
5.Exit
Enter choice: 5
Thank you
*/
