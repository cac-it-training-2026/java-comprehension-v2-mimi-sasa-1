package q01_basic.question05;

public class SystemMain05 {

	public static void main(String[] args) {

		AbstMember[] members = new AbstMember[2];
		//TODO ここから実装する
		NonMember sato = new NonMember("Sato Kensuke");

		Member miura = new Member(1, "Passw0rd", "Miura Maabu", 28, 2);

		members[0] = sato;
		members[1] = miura;

		MemberManager.showAllMembers(members);

		System.out.println("---BUY ITEM--- ");
		sato.buyItem();
		miura.buyItem();
	}

}
