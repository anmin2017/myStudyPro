package com.it.singleton.study;

public class Test {
    private String name;

    private  void changeName(String name){
       this.name = name;
    }
    
    private void changeMoney(Double d){
    	d = 1.0;
    }
    
    public void changeStudengInfo(Student s){
    	s.setName("ls");
    	s.setSno("1");
    }
    
    public void changeAB(double a,double b){
    	double c = a;//2.0
    	a = b;//3.0
    	b = c;//2.0
    	System.out.println("a:" + a + "b:" + b);
    }
    
    
	/**
	 * @param args
	 */
	public static void main(String[] args) {
        Double money = 23d;
		Test test = new Test();
		test.changeMoney(money);
		System.out.println("money == " + money);
		
		
		test.name = "zs";
		test.changeName("ls");
		
		System.out.println("name == " + test.name);
		System.out.println("==================");
		
		Student s1 = new Student();
		s1.setName("zs");
		s1.setSno("123");
		
		
		Student s2 = new Student();
		s2.setName("ww");
		s2.setSno("1234");
		
		s1 = s2;
		s2.setName("mm");
		
		System.out.println("s1.info:"+ s1.getInfo());
		
		
		double a = 1.0;
		double b = 2.0;
		
		a = b;
		b = 3.0;
		System.out.println("a:"+ s1.getInfo());
		
		test.changeAB(a,b);
		
		System.out.println("aaaa\naaa");
	
		
		
		
		
		
		
	}

}

class Student{
	private String sno;
	private String name;
	
	public void setSno(String sno){
		this.sno = sno;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getInfo(){
		return sno + ":" + name;
	}
}
