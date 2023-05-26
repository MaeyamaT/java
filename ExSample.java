import java.util.*;
public class ExSample{
	public static void main(String[] args){
		Random rand=new Random();
		Scanner scan=new Scanner(System.in);
		System.out.print("何人>>");
		int nums=scan.nextInt();
		int[] score=new int[nums];
		for(int i=0;i<score.length;i++){
			score[i]=rand.nextInt(101);
		}
		System.out.println(Arrays.toString(score));
	}
}
