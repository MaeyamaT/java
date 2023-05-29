import java.util.*;
public class Method6{
	public static void main(String[] args){
    int ret=method(3);
		System.out.println(ret);
    ret=method(-5);
		System.out.println(ret);

		System.out.println(method1(2,5,3));//5
																			 
		double ave=method2(2.3,3.5,4.1);
		System.out.printf("%.1f%n",ave);

		String str3=method3("Hello","World");
		System.out.println(str3);

		System.out.println(method4(10));
		if(method4(10)){
			System.out.println("偶数");
		}else{
			System.out.println("奇数");
		}

		int[] num={2,4,6};
		method5(num);
		System.out.println(Arrays.toString(num));

		int[] num1={3,5,7};
		int[] arr1=method6(num1);
		System.out.println(Arrays.toString(arr1));
	}
	public static int method(int n){
		int num=n*(-1);
		return num;
	}
	public static int method1(int x,int y,int z){
		int max=x;
		if(y>max){
			max=y;
		}
		if(z>max){
			max=z;
		}
		return max;
	}
	public static double method2(double n1,double n2,double n3){
		double ave=(n1+n2+n3)/3;
		return ave;
	}
	public static String method3(String str1,String str2){
		return str1+str2;
	}
	public static boolean method4(int n){
    return n%2==0;
		/*
		 boolean isEven;
		 if(n%2==0){
		   isEven=true;
		 }else{
		 isEven=false;
		 }
		 return isEven;
		 
		 if(n%2==0){
		   return true;
		 }else{
       return false;
		 }
 
     return n%2==0 ? true:false;
		 */
	}
	public static void method5(int[] arr){
		for(int i=0;i<arr.length;i++){
			arr[i]*=2;
		}
	}
	public static int[] method6(int[] arr){
		int[] arr1=new int[arr.length]; 
		for(int i=0;i<arr.length;i++){
			arr1[i]=arr[i]*2;
		}
		return arr1;
	}
}
