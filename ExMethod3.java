import java.util.*;
public class ExMethod3{
	public static void main(String[] args){
		System.out.print("top>>");
		int userTop=new Scanner(System.in).nextInt();
		System.out.print("bottom>>");
		int userBottom=new Scanner(System.in).nextInt();
		System.out.print("height>>");
		int userHeight=new Scanner(System.in).nextInt();
		calcArea(userTop,userBottom,userHeight);
	}
	public static void calcArea(int top,int bottom,int height){
		System.out.printf("TOPが%d,BOTTOMが%d,HEIGHTが%dの台形の面積は%dです%n",top,bottom,height,(top+bottom)*height/2);
	}
}
