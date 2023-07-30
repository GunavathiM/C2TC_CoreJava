package Day3;

public class Test {
	int id;  
    String name;  
    //creating a parameterized constructor  
    Test(int i,String n){  
    id = i;  
    name = n;  
    }  
    //method to display the values  
    void display(){System.out.println(id+" "+name);}  
   
    public static void main(String args[]){  
    //creating objects and passing values  
    Test s1 = new Test(111,"Ragul");  
    Test s2 = new Test(222,"Aryan");  
    //calling method to display the values of object  
    s1.display();  
    s2.display();  
   }  	
	  }

	 

	   


