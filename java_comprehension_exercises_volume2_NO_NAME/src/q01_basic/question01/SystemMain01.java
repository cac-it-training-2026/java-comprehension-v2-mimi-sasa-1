package q01_basic.question01;

/**
 * question01出力例
 * 詳細は問題ドキュメントを参照すること

---SHOW DATA---
***MEMBER DATA***
name:Miura Manabu
age:24
rank:1
*****************
***MEMBER DATA***
name:Sato Kensuke
age:36
rank:2
*****************

 * 
 */
public class SystemMain01 {

	public static void main(String[] args) {
		//TODO ここから実装する
		Member miura = new Member();
		Member satou = new Member();

		miura.name = "Miura Manabu";
		miura.age = 30;
		miura.rank = 1;

		satou.name = "Satou Kensuke";
		satou.age = 36;
		satou.rank = 2;

		miura.showMember();
		satou.showMember();
	}

}
