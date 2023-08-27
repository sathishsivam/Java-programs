

class sample
 {
   String name="Vignesh";
 }


class democlass
 {
     public static void main(String asd[])
	{
	  sample ob=new sample(); // object creation
	  System.out.println("Name="+ob.name);

	   System.out.println(new sample().name);
	}
 }