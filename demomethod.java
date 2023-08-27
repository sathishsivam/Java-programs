

class sample
  {
     public void getdata(int x, int y)
	{
	  int sum=x+y;
	  System.out.println("Addition="+sum);
	}

     public void getstring(String name,int age)
	{
	  System.out.println("Name of the student="+name);
	  System.out.println("Age="+age);
	}
 }

class demomethod
 {
    public static void main(String asd[])
	{
	    sample obj=new sample();
	    obj.getdata(10,12);
	    obj.getstring("Vignesh",12);
	}
 }

