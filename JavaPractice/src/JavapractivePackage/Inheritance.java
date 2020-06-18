package JavapractivePackage;

class abc{
	int a = 100;
			
	abc(int a){
		System.out.println("abc first");
		System.out.println(+a);
		System.out.println(+this.a);
		this.a = a;
		System.out.println("abc second");
		System.out.println(+a);
		System.out.println(+this.a);
		}
}

class def extends abc{
	int a = 5000;
	def(int d, int e) {
		super(d);
		System.out.println("def second");
		System.out.println(+a);
		a = e;
		System.out.println(+a);
	}
	
	void msg() {
		System.out.println("msg first");
		System.out.println(+a);
		System.out.println(+super.a);
	}
}

public class Inheritance {

	public static void main(String[] args) {
		def ob = new def(10,20);
		ob.msg();

	}

}
