package org.vaibhao;
class Addition{
	int a,b,c;
	void setAddition(int a,int b) { //Parameterized Constructor
		this.a=a;
		this.b=b;
	}
	void calAddition() {
		c=a+b;
	}
	void showAddition() {
		System.out.println("Addition is " +c);
	}
}
public class ParameterizedContructor {

	public static void main(String[] args) {
		Addition a= new Addition();
		a.setAddition(100, 300);
		a.calAddition();
		a.showAddition();
		
	}

}
