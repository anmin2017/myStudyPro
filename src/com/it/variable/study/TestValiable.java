package com.it.variable.study;

public class TestValiable {
	
	TestValiable(){}
	
	private void testVariable(int ... args){
		for(int temp: args){
			System.out.println(temp);
		}
	}

	/**
	 * @param args
	 */
	public static int printMin(int...number){
		int result=number[0];
		for(int i=1;number[i]<number.length;i++){
			if(number[i]<result){
				number[i]=result;
			}
		}
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//TestValiable testValiable = new TestValiable();
		//testValiable.testVariable(new int[]{1,2,3,4,5});
		int result=printMin(new int[]{-1,-2,7,8,9,10});
		System.out.println(result);
	}

}
