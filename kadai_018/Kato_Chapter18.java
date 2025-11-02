package kadai_018;

abstract public class Kato_Chapter18 {
	//姓を表すフィールドの宣言
	public String familyName = "加藤";
	//名を表すフィールドの宣言
	public String givenName = "";
	//住所を表すフィールドの宣言
	public String address = "東京都中野区〇×";

	//共通の紹介を出力するメソッドの宣言
	public void commonIntroduce() {
		System.out.println("名前は" + this.familyName + this.givenName + "です");
		System.out.println("住所は" + this.address + "です");
	}
	//個別の紹介を出力するメソッドの宣言
	abstract public void eachIntroduce();
	//紹介を実行するメソッドの宣言
	public void execIntroduce() {
		this.commonIntroduce();
		this.eachIntroduce();
		System.out.println();
	} 
}