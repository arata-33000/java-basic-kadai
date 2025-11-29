package kadai_028;

public class JyankenExec_Chapter28 {
	public static void main(String[] args) {
		//指定の文言を出力する（ユーザーへの案内）
		System.out.println("自分のじゃんけんの手を入力しましょう");
		System.out.println("グーはrockのrを入力しましょう");
		System.out.println("チョキはscissorsのsを入力しましょう");
		System.out.println("パーはpaperのpを入力しましょう");
		
		//じゃんけんクラスを準備（インスタンス化）する
		Jyanken_Chapter28 janken = new Jyanken_Chapter28();
		
		//自分の手を決める（入力処理の実行）
		// getMyChoiceメソッドを呼び出し、戻り値（入力結果）を受け取る
		String myChoice = janken.getMyChoice();
		
		//相手の手を決める（乱数処理の実行）
		// getRandomメソッドを呼び出し、戻り値（相手の手）を受け取る
		String opponentChoice = janken.getRandom();
		// 手の強弱の判定を行う（判定処理の実行）@
		// 用意した「自分の手」と「相手の手」を渡して、playGameメソッドを呼ぶ
		janken.playGame(myChoice, opponentChoice);
	}
}