package q02_advanced.question02;

import java.util.ArrayList;
import java.util.List;

public class Member {

	private int age;
	private int rank;
	private String password;
	private int id;
	private String name;

	//nullにする（箱は作らない）
	private List<Coupon> coupons;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Coupon> getCoupons() {
		return coupons;
	}

	public void setCoupons(List<Coupon> coupons) {
		this.coupons = coupons;
	}

	public Member() {

	}

	public Member(int id, String password, String name, int age, int rank) {
		this.id = id;
		this.password = password;
		this.name = name;
		this.age = age;
		this.rank = rank;
		this.coupons = new ArrayList<>();
	}

	public String toString() {
		return "Coupon [id=" + id
				+ ", password =" + password
				+ ", name =" + name
				+ ", age =" + age
				+ ", rank =" + rank
				+ ", coupons = " + coupons + "]";
	}

	public void showMember() {
		System.out.println(toString());
		System.out.println("******************");
	}

	public static Member getInstance(int id, String password, String name, int age, int rank) {
		Member member = new Member(id, password, name, age, rank);

		Coupon coupon1 = Coupon.getInstance(1, 0.5, "最初の特典");
		Coupon coupon2 = Coupon.getInstance(2, 0.25, "今月の特典");
		member.coupons = new ArrayList<>();
		member.coupons.add(coupon1);
		member.coupons.add(coupon2);

		return member;
	}

}
