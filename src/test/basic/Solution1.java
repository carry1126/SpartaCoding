package test.basic;

import java.util.Scanner;

/*
 * 두 수의 차
 */
public class Solution1 {
	public static int solution(int num1, int num2) {
		int answer = 0;
		answer = num1 - num2;
		return answer;
	}
	
	public static void main(String[] args) {
		int num1 = 0;
		int num2 = 0;
		
		try {
			Scanner in = new Scanner(System.in);
			num1 = in.nextInt();
			num2 = in.nextInt();
			in.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println(num1 + " - " + num2 + "=" + solution(num1, num2));
		
	}

}
