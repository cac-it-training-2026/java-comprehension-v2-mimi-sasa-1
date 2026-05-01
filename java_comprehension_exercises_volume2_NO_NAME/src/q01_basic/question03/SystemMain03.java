package q01_basic.question03;

public class SystemMain03 {

	public static void main(String[] args) {
		//TODO ここから実装する
		Member member = new Member();

		Member miura = new Member("Miura Manabu", 28, 2);

		member.showMember();
		System.out.println("---SHOW DATA(Miura)---");
		miura.showMember();
	}

}
