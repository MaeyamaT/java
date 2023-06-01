import java.util.*;
public class Youkoso{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("年齢>>");
		int age=sc.nextInt();sc.nextLine();
		System.out.print("名前>>");
		//nextIntの次にnextLineをする際は一度nextLineで空読みしておく
		String name=sc.nextLine();
		System.out.printf("ようこそ%s(%d)!%n",name,age);
	}
}
