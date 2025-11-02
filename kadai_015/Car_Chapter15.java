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
		case 1:
			speed = 10;
			break;
		case 2:
			speed = 20;
			break;
		case 3:
			speed = 30;
			break;
		case 4:
			speed = 40;
			break;
		case 5:
			speed = 50;
			break;
		default:
			speed = 10;
			break;
		}
		//フィールドのgearをafterGearの値に更新する
		this.gear = afterGear;
	}
	//	runメソッドの宣言
		public void run() {
		//	指定の文言を出力	
		System.out.println("速度は時速" + speed + "kmです");
	}
}