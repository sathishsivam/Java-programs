class sample
 {
    public void getdata(long price)
	{
	  System.out.println(""+price);
	}

 }

class demodatatyperange
 {
    public static void main(String asd[])
	{
	   sample obj=new sample();
 	   obj.getdata(9223372036854775808l);
	}
 }