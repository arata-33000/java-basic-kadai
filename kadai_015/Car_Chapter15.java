package kadai_015;

public class Car_Chapter15 {
	//	フィールドの宣言
	private int gear = 1;
	private int speed = 10;

	//	changeGeaメソッドの宣言
	public void changeGear(int afterGear) {
		System.out.println("ギア" + gear +"から" + afterGear +"に切り替えました");
		//	ギアの値に応じて速度を決定
		switch(afterGear){
		case 1   -> speed = 10;
		case 2   -> speed = 20;
		case 3   -> speed = 30;		
		case 4   -> speed = 40;		
		case 5   -> speed = 50;		
		default  -> speed = 10;	
		}
	}
	//	runメソッドの宣言
		public void run() {
		//	指定の文言を出力	
		System.out.println("速度は時速" + speed + "kmです");
	}
}