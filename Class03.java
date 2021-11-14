
package Java10;
class nCaaa 
 { 
 public int num1; 
 public int num2; 
 
 public nCaaa() 
 { 
 num1=1; 
 num2=1; 
 } 
 public nCaaa(int a,int b) 
 { 
 num1=a; 
 num2=b; 
 } 
 } 
 
 class nCbbb extends nCaaa 
 { 
 public nCbbb() 
 {} 
 public nCbbb(int a,int b) 
 { 
 super(a,b); 
 } 
 public void show() 
 { 
 System.out.println("num1="+num1); 
 System.out.println("num2="+num2);
 } 
 } 


public class Class03 {

	
	public static void main(String[] args) {
		nCbbb b1=new nCbbb(); 
		 nCbbb b2=new nCbbb(10,100); 
		 b1.show(); 
		 b2.show(); 

	}

}
