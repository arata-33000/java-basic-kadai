package kadai_028;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter28 {
	//getMyChoiceメソッドの宣言
	public String getMyChoice() {
		//Scannerクラスのオブジェクトを生成する
		Scanner scanner = new Scanner(System.in);
		
		//自分の手を保存しておくため、whileの外で変数を用意しておく
		String choice = ""; 
		
		while(true) {
			//入力した内容を取得する
			choice= scanner.next();
			
			//入力した自分の手が正しい内容であるかを判定する
			if(choice.equals("p") || choice.equals("r") || choice.equals("s")) {
				//Scannerクラスのオブジェクトをクローズする
				scanner.close();
				//ループの終了
				break;
			}else {
				//正しい手でない場合はエラー文言を出力し、再度自分の手を入力する
				System.out.println("p,r,sのいずれかで入力してください");
			}
		}
		//保存した変数を戻り値として送る
		return choice;
	}
	
	//getRandomメソッドの宣言
	public String getRandom() {
		//じゃんけんの手を配列で定義
		String[] hands = {"p", "r", "s"};
		//乱数で0～2の数値を計算する
		int index = (int) Math.floor(Math.random() * 3);
		//計算した番号に対応する配列の中の手を返してメソッド終了
		return hands[index];
	}
	
	//playGameメソッドの宣言
	public void playGame(String myChoice, String opponentChoice) {
		//手の値を日本語名に変換する
		HashMap<String, String> handNameMap = new HashMap<>();
		handNameMap.put("r", "グー");
		handNameMap.put("s", "チョキ");
		handNameMap.put("p", "パー");
		
		//自分と対戦相手の手を出力する
		System.out.println("自分の手は" + handNameMap.get(myChoice) + ",対戦相手の手は" + handNameMap.get(opponentChoice));
		
		//勝敗の判定を行い、結果を出力する
		//あいこの場合
		if (myChoice.equals(opponentChoice)) {
			System.out.println("あいこです");
			}
		// 自分が勝つ場合
		else if ((myChoice.equals("r") && opponentChoice.equals("s")) ||
			(myChoice.equals("s") && opponentChoice.equals("p")) ||
			(myChoice.equals("p") && opponentChoice.equals("r"))) {
			System.out.println("自分の勝ちです");
        }
        // それ以外（負け）
        else {
            System.out.println("自分の負けです");
        }
    }
}