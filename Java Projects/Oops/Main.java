final class Animal
           {
             void eat(){

            
            System.out.println("Eat");
           }
           }
           class  Dog extends Animal // Not possible for the final,here inheritance not support the final class.
           {
           
            void eat(){

            
            System.out.println("Eat");
           }            
           }
           class Main{
			   public static void  main (String args[]){
            Animal a1=new Animal();
            a1.eat();
            Dog d1=new Dog();
            d1.eat();
           }
		   }
		   /* Output
		   
C:\Users\Bharath.S\Desktop\Java Projects>java Main.java
Main.java:9: error: cannot inherit from final Animal
           class  Dog extends Animal // Not possible for the final,here inheritance not support the final class.
                              ^
1 error
error: compilation failed
*/