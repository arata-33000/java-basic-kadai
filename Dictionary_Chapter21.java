package kadai_021;
import java.util.HashMap;

public class Dictionary_Chapter21 {
//	メソッドの宣言
	public String[] referer(String[] word) {
		HashMap<String,String> dictionary = new HashMap<String,String>();
		dictionary.put("apple","りんご");
		dictionary.put("peach","桃");
		dictionary.put("banana","バナナ");
		dictionary.put("lemon","レモン");
		dictionary.put("pear","梨");
		dictionary.put("kiwi","キウィ");
		dictionary.put("strawberry","いちご");
		dictionary.put("grape","ぶどう");
		dictionary.put("muscat","マスカット");
		dictionary.put("cherry","さくらんぼ");

//		resultを配列として宣言
		String[] result = new String[word.length]; 
//		dictionaryから引数の値を検索
		for( int i = 0;i < word.length;i++) {
			result[i] = dictionary.get(word[i]);
		}
//		結果配列を戻す
		return result;
	}
}