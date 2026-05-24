
class Bird {

    void m1() {
        System.out.println("Bird class method");
    }
}

class Fish {

    void m2() {
        System.out.println("Fish class method");
    }
}



class Multipleinheritance extends Bird


{
    public static void main(String[] args) {
        Multipleinheritance obj = new Multipleinheritance();
        obj.m1();
        // obj.m2();
        // Multipleinheritance obj1 = Fish(); not possibel.
        // obj1.m2(); 
    }
}
/*PS C:\Users\Bharath.S\Desktop\Java Projects> java Multipleinheritance.java
Multipleinheritance.java:18: error: '{' expected
class Multipleinheritance extends Bird,Fish
                                      ^
1 error
error: compilation failed
PS C:\Users\Bharath.S\Desktop\Java Projects> java Multipleinheritance.java
Multipleinheritance.java:18: error: '{' expected
class Multipleinheritance extends Bird,Fish
                                      ^
1 error
error: compilation failed
PS C:\Users\Bharath.S\Desktop\Java Projects> java Multipleinheritance.java
Bird class method
PS C:\Users\Bharath.S\Desktop\Java Projects>  */