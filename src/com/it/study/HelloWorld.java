package com.it.study;


public class HelloWorld {
	
	private boolean flag;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//lastIndexOf
		//replace
		//substring
		//toCharArray
		//toLowerCase
		//toUpperCase
		//trim
		
		
		String str2 = "helloWorld";
		String str1 = "hello";
		
		
		
//		for(int i = 0; i < aa.length; i++){
//			System.out.println(aa[i]);
//		}
		
		/*char[] str3 = str2.toCharArray();
		for(int i=0;i<str3.length;i++){
			System.out.println(str3[i]);	
			
		}*/
//	    byte[] str3=str2.getBytes();
//		for(int i=0;i<str3.length;i++){
//			System.out.println(str3[i]);
//		}
		
//		double[] dArray = new double[10];
//		for(int i = 0;i < dArray.length ;i++){
//			System.out.println(dArray[i]);
//		}
		
//		String[] sArray = new String[10];
//		
//		for(int i = 0;i < sArray.length ;i++){
//			System.out.println(sArray[i]);
//		}
		
//		HelloWorld h = new HelloWorld();
//		System.out.println(h.flag);
		
		
		// 数组大小
	      int size = 10;
	      // 定义数组
	      double[] myList = new double[size];
	      myList[0] = 5.6;
	      myList[1] = 4.5;
	      myList[2] = 3.3;
	      myList[3] = 13.2;
	      myList[4] = 444.0;
	      myList[5] = 34.33;
	      myList[6] = 34.0;
	      myList[7] = 45.45;
	      myList[8] = 9;
	      myList[9] = 10;
	      // 计算所有元素的总和
	      
         double max=myList[0];
//         for(int i=0;i<size;i++){
//        	 if(max<myList[i]){
//        		 max=myList[i];
//        	 }
//         }
//         
//         int count = 0;
//         while(count < myList.length){
//        	 if(max<myList[count]){
//        		 max=myList[count];
//        	 }
//        	 count++;
//         }
         
//         for(double temp: myList){
//        	 if(max<temp){
//        		 max=temp;
//        	 }
//         }
//         System.out.println(max);
         
         //int intArray[] = {3, 1, 2, 6, 4, 2};
         //printArray(new int[]{3, 1, 2, 6, 4, 2});
         
         HelloWorld helloWorld = new HelloWorld();
         int aa[] = helloWorld.reverse(new int[]{3, 1, 2, 6, 4, 2});
         for(int temp: aa){
        	 System.out.println(temp);
         }
         
	}
	
	
	public static void printArray(int[] array) {
	  for (int i = 0; i < array.length; i++) {
	    System.out.print(array[i] + " ");
	  }
	}
	
	private int[] reverse(int[] args){
		int[]result = new int[args.length];
		
		for(int i = 0; i< args.length; i++ ){
			result[args.length - i -1] = args[i];
		}
		return result;
	}
	

}
