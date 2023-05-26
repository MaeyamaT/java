public class Ex5_2{
	public static void main(String[] args){
		email("メールのタイトル","123456789@gmail.com","ああああああああああ");
		email("987654321@gmeil.com","いいいいいいいいいいいいいいいい");
	}
	public static void email(String title,String address,String text){
		System.out.println(address+"に以下のメールを送信しました");
		System.out.println("件名:"+title);
		System.out.println("本文:"+text);
	}
	public static void email(String address, String text){
		email("無題",address,text);
	}
}
