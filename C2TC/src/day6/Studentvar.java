package day6;

class Studr {
		   int rollno;
		   String name;  
		   static String college ="IFET";
	
		   Studr(int r, String n){  
		   rollno = r;  
		   name = n;  
		   }  
		   
		   void display (){System.out.println(rollno+" "+name+" "+college);}  
		}  
		 
		public class Studentvar{  
		 public static void main(String args[]){  
		 Studr s1 = new Studr(111,"JayamRavi");  
		 Studr s2 = new Studr(222,"Vijay");  
		 
		 s1.display();  
		 s2.display();  
		 }  
		}
		