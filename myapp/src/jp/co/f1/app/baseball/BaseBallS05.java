package jp.co.f1.app.baseball;

import java.util.Scanner;

public class BaseBallS05 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		System.out.println("--野球ゲームプログラム開始--");
		System.out.println();

		int answer[] = new int[3];
		int[] playerNum = new int[3];

		// ランダム数字の出力、ユニーク数字が出るまで重複判断
		while (true) {

			for (int i = 0; i < answer.length; i++) {
				answer[i] = (int) (Math.random() * 10);
			}

			if (answer[0] == answer[1] || answer[1] == answer[2] || answer[0] == answer[2]) {
				continue;
			} else {
				System.out.println("３桁のランダム数字（正解数字）は" + answer[0] + answer[1] + answer[2] + "です。");
				System.out.println("=>ユニークです。");
				System.out.println();
				break;
			}
		}

		// 3桁数字を数字をキーボード入力（ユニーク数字が出るまで、繰り返し処理）
		while (true) {
			System.out.print("3桁の数字を入力してください＞＞");
			String inputNum = scn.nextLine();

			playerNum[0] = Integer.parseInt(inputNum.substring(0, 1));
			playerNum[1] = Integer.parseInt(inputNum.substring(1, 2));
			playerNum[2] = Integer.parseInt(inputNum.substring(2));

			// 入力数字の重複判断（ユニークなら繰り返し処理終了）
			if (playerNum[0] == playerNum[1] || playerNum[1] == playerNum[2] || playerNum[0] == playerNum[2]) {
				System.out.println("=>重複しています");
				break;

			} else {
				System.out.println("=>ユニークです。");
				break;
			}
		}
		// 正解数字と予想数字を比較して、桁と数字が同じ場合にカウントに+１
		int strikeCount = 0;
		for (int i = 0; i < playerNum.length; i++) {
			if (playerNum[i] == answer[i]) {
				strikeCount++;
			}
		}
		//ストライク数出力とゲーム終了
		System.out.println("判定：" + strikeCount + "ストライクです。");
		System.out.println();
		System.out.println("--野球ゲームプログラム終了--");
	}
}
