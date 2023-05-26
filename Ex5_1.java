public class Ex5_1{
	public static void main(String[] args){
		introduceOneself();
	}
	public static void introduceOneself(){
		String name="Maeyama";
		int age=74;
		double height=176.0;
		char eto='猿';
		System.out.printf("名前:%s%n",name);
		System.out.printf("年齢:%d%n",age);
		System.out.printf("身長:%.1f%n",height);
		System.out.printf("干支:%s%n",eto);
	}
}
