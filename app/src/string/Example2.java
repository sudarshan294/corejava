package string;

public class Example2 {
	
	public static void main(String[] args) {
		
		//   split
		
		 String frdnames = "Chandhu#Hari#Tejesh#Ravi#Chaithu#Dinesh#Kalyan";
				 
		String fn[] = frdnames.split("#");
		
	//stem.out.println(fn[0]);
	//stem.out.println(fn[1]);
	//stem.out.println(fn[2]);
		
		for(int i=0; i<=fn.length; i++)
		{
			System.out.println(fn[i]);
			
			
//			if(fn[i].startsWith("C"))
//			{
//				System.out.println(fn[i]);
//			}
//			if(fn[i].endsWith("h"))
//			{
//				System.out.println(fn[i]);
//			}
		}
	}
}
