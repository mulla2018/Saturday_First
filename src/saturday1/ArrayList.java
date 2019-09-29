package saturday1;

public class ArrayList {
static int a=10, b=20; // static variables
int c=30, d=40; // non-static variables

//static method with returning a value
public static int add(){
	int result=a+b;
	return result;
}
 
//static method without returning a value
public static void multiply(){
	System.out.println(a*b);
	
}

//non-static method with returning a value
public int add2(){
	int res =c+d;
	return res;
}

//non-static method without returning a value
public void multiply2(){
	System.out.println(c*d);
	
}

public static void main(String [] args){
//Access static method (using Class name)
	int x =ArrayList .add();//static method with returning a value
	System.out.println(x);
	System.out.println(ArrayList .a);//Access variables
	
	ArrayList.multiply();//static method without returning a value
	

//Access non-static method (using object)
	ArrayList object = new ArrayList();//create object 
	int y =object.add2();
	System.out.println(y);//non-static method with returning a value
	System.out.println(object.c);// non-static variables
	object.multiply2();//non-static method without returning a value
	
	
	
	
	
}


}



  
  
 

