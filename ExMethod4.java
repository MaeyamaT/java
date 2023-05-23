import java.util.*;
public class ExMethod4{
	public static void main(String[] args){
		System.out.print("税抜価格>>");
		int price=new Scanner(System.in).nextInt();
		System.out.print("税率>>");
		int taxRatio=new Scanner(System.in).nextInt();
		int p=calcPrice(price,taxRatio);
		System.out.println(p);

	}
	/*calcPriceメソッド
	 * 税抜き価格と、消費税率から税込み価格を求める
	 * 引数:price(int)税抜き価格,taxRatio(int)税率
	 * 戻り値:税込み価格(int)
	 */
	public static int calcPrice(int price,int taxRatio){
		price=(int)(price*(1+taxRatio/100.0));
		return price;
	}
}
