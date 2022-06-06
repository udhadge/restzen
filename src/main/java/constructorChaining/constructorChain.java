package constructorChaining;

public class constructorChain {

	String str;
	int value;
	
	constructorChain(){
		str = "utk";
		value = 10;
	}
	
	constructorChain(String str){
		this();
		this.str = str;
	}

	constructorChain(String str,int value){
		this(str);
		this.value = value;
	}
	
	public static void main(String args[]) {
		constructorChain c = new constructorChain();
		
		constructorChain c1 = new constructorChain("jai");
		
		constructorChain c2 = new constructorChain("ram",90);
		
		System.out.println(c);
		System.out.println(c1);
		System.out.println(c2);
		
		/////////////////////////////////////////
		constructorChain cc = new constructorChain();
		
		constructorChain cc1 = new constructorChain("roy");
		
		constructorChain cc2 = new constructorChain("alex",40);
		
		System.out.println(cc);
		System.out.println(cc1);
		System.out.println(cc2);
	}

	@Override
	public String toString() {
		return "constructorChain [str=" + str + ", value=" + value + "]";
	}
	
}

class constructorChain2 extends constructorChain{
	
	constructorChain2(){
		super();
	}
	
	constructorChain2(String str){
		super(str);
	}
	
	constructorChain2(String str,int value){
		super(str,value);
	}
}
