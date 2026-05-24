class Implementationarraylist
{
    public static void main(String[] args) {
        List<Integer>bag=new ArrayList();

       bag.add(1);
       bag.add(2);                      
         bag.add(3);
         bag.add(4);

            System.out.println(bag);
                bag.remove(2);
                System.out.println(bag);
    
                bag.add(5);
                    System.out.println(bag);
    
                    bag.remove(0);
                    System.out.println(bag);    

                    for(int i=0;i<bag.size();i++){
                        System.out.println(bag.get(i));
                    }   


        
    }
}