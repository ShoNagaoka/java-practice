package jp.co.naga.practice;

public class Pracmain {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		introduceOneself();

		String title = "テストメッセージ";
		String text = "テストメッセージ";
		String address = "naga@naga.co.jp";
		email(title, address, text);
	}

	public static void introduceOneself(){
		String name = "naga";
		int age = 33;
		double height = 177.0;
		String sex = "m";

		System.out.println("名前；" + name);
		System.out.println("年齢；" + age);
		System.out.println("身長；" + height);
		System.out.println("性別；" + sex);
	}

	public static void email(String title,String address,String text){

		System.out.println("「" + address + "」");
		System.out.println("件名：" + title);
		System.out.println("本文：" + text);

	}


}
