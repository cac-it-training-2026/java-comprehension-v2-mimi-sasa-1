package q01_basic.question04;

public class SystemMain04 {

	public static void main(String[] args) {

		Member[] members = new Member[2];
		//TODO ここから実装する
		Member miura = new Member(1, "Passw0rd", "Miura Manabu", 28, 2);
		Member satou = new Member(2, "aaaAAA", "Sato Kensuke", 43, 1);

		members[0] = miura;
		members[1] = satou;

		MemberManager.showAllMembers(members);
	}

}
