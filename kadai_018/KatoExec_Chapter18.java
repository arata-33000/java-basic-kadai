package kadai_018;

public class KatoExec_Chapter18 {	
	public static void main(String[] args) {
	//太郎クラス
	KatoTaro_Chapter18 Taro = new KatoTaro_Chapter18();
		//太郎クラスの名をset
		Taro.setGivenName();
		//紹介の実行
		Taro.execIntroduce();

	//一郎クラス	
	KatoIchiro_Chapter18 Ichiro = new KatoIchiro_Chapter18();
		//一郎クラスの名をset
		Ichiro.setGivenName();
		//紹介の実行
		Ichiro.execIntroduce();

	//花子クラス
	KatoHanako_Chapter18 Hanako = new KatoHanako_Chapter18();
		//花子クラスの名をset
		Hanako.setGivenName();
		//紹介の実行
		Hanako.execIntroduce();
	}
}
