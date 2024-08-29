
public class Training3_3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("じゃんけんゲーム");
		int wincount = 0;
	
		for(int i = 0; i < 3; i++) {
			System.out.println("[" + (i+1) + "回戦]");
			System.out.println("あなたの手を入力してください");
			System.out.println("0:グー 1:チョキ 2:パー");
			
			int you = new java.util.Scanner(System.in).nextInt();
			System.out.println("あなた:" + rockPaperScissors(you));
			
			// コンピュータの手をランダムに決める (0～2の乱数)
			int cp = new java.util.Random().nextInt(3);
			
			// コンピュータの手を表示する
			System.out.println("コンピュータ:" + rockPaperScissors(cp));
			
			// じゃんけんの判定をする
			if(hantei(you, cp) == 1) {
				wincount++;
			}
			
		}
		// 最終結果
		System.out.println("あなたの勝った回数：" + wincount);
		if(wincount >= 2) {
			System.out.println("おめでとう！あなたの勝ちです");
		}else {
			System.out.println("残念。あなたの負けです");
		}
		
		
	}
	
	//0～2の数値を受け取り、0ならグー、1ならチョキ、2ならパーを返すメソッド
	public static String rockPaperScissors(int te) {
		String strTe = "グー";
		
		// teはmainメソッド内のyou,cpの値を受け取る
		switch(te) {
			case 0 ->{
				strTe = "グー";
			}
			case 1 ->{
				strTe = "チョキ";
			}
			case 2 ->{
				strTe = "パー";
			}
		}
		
		return strTe;
	}
	
	//自分の手(you)と相手の手(cp)を受け取ってじゃんけんの勝敗判定をするメソッド
	//自分が勝ちなら1,あいこなら0、負けなら-1を返す
	public static int hantei(int you, int cp) {
		
		int kekka = 0;
		
		if((you == 0 && cp == 1) || (you == 1 && cp == 2) || (you == 2 && cp == 0)) {
			kekka = 1;
			System.out.println("勝ち");
		} else if(you == cp) {
			kekka = 0;
			System.out.println("あいこ");
		} else if((you == 1 && cp == 0) || (you == 2 && cp == 1) || (you == 0 && cp == 2)) {
			kekka = -1;
			System.out.println("負け");
		} 
		return kekka;

	}
	
	
}
