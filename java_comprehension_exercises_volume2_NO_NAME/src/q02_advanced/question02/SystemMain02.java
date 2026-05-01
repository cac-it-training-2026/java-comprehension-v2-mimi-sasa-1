package q02_advanced.question02;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SystemMain02 {

	public static void main(String[] args) {

		//TODO ここから実装する
		ConsoleReader consoleReader = new ConsoleReader();
		Member member1 = Member.getInstance(1, "Passw0rd", "Miura Manabu", 28, 2);
		Member member2 = Member.getInstance(2, "aaaAAA", "Sato Kensuke", 43, 1);

		List<Member> members = new ArrayList<>();
		members.add(member1);
		members.add(member2);
		MemberManager.showAllMembers(members);

		System.out.println("===パスワードを変更します===");
		int targetId;
		String newpass;

		try {
			System.out.print("input target id>>");
			targetId = consoleReader.inputNumber();

			System.out.print("input new password>>");
			newpass = consoleReader.inputString();
		} catch (IOException e) {
			e.printStackTrace();
			return;
		} catch (NumberFormatException e) {
			e.printStackTrace();
			return;
		}

		MemberManager.updatePassword(members, targetId, newpass);
		MemberManager.showAllMembers(members);
	}

}
