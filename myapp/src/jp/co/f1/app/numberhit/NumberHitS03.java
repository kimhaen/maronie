package jp.co.f1.app.numberhit;

import java.util.Scanner;

public class NumberHitS03 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int answerNum = 5;

		System.out.println("ゲーム開始(正解数字：" + answerNum + ")");
		System.out.println();
		while (true) {
			System.out.print("0から9まで予想の数字を入力＞＞");
			int playerNum = scn.nextInt();

			if (playerNum > answerNum) {
				System.out.println("→正解数字は" + playerNum + "より小さいです。");
			} else if (playerNum < answerNum) {
				System.out.println("→正解数字は" + playerNum + "より大きいです。");
			} else {
				System.out.println("→！！大当たり！！");
				break;
			}



		}
		System.out.println();
		System.out.println("ゲーム終了");
	}
}
