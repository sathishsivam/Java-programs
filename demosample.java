
class sample1
 {
     public void displayme()
	{
	   System.out.println("My city is salem");
	}

     public void displayme1()
	{
	   System.out.println("My name is vignesh");
	}
 }

class demosample
 {
    static public void main(String[] s)
	{
	 sample1 obj= new sample1();	// object created for sample1 class
	   obj.displayme();
	   obj.displayme1();
	}
 }