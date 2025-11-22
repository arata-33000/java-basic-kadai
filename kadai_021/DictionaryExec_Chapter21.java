package kadai_021;

public class DictionaryExec_Chapter21 {

	public static void main(String[] args) {
		//実行クラスで単語を指定し、マッピングされた指定の単語を含んだ文言を出力する	
		//クラスのインスタンス化
		Dictionary_Chapter21 dictionary = new Dictionary_Chapter21();
		//指定の単語を作る
		String[] word = new String[] {"apple","pear","mikan"};
		//指定の単語を検索して戻す
		String[] result = dictionary.referer(word);
		//戻ってきた値を出力する
		int cnt = 0;
		for(String str:result) {
			if(str == null) {
				System.out.println(word[cnt] + "は辞書に存在しません");	
			}else {
				System.out.println(word[cnt] + "の意味は" + str);
			}
			cnt++;
		}
	}

}
//