package test;

import java.util.Scanner;

public class ArraySample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double sum = 0;
		System.out.print("입력할 최대 실수의 갯수를 입력하세요. >> ");
		Scanner input = new Scanner(System.in); // 입력할 최대의 실수 갯수
		Scanner input2 = new Scanner(System.in); // 입력한 실수
		int size = input.nextInt(); // 최대 실수의 갯수
		double[] x = new double[size]; // 입력받을 배열
		System.out.println("\n중간에 0을 입력하면 이전 입력자료로 계산하고 종료합니다.");
		System.out.print("실수 " + size + "개를 입력하세요. >> ");
		for (int j = 0; j < size; j++) {
			x[j] = input2.nextDouble();
			if (x[j] == 0) {
				size = j; // 0입력시 현재까지 입력한 갯수
				break;
			}
		}
		for (int i = 0; i <= size; i++) {
			sum += x[i]; // 입력한 실수의 합
		}
		System.out.println("합: " + sum + ", 평균: " + sum / size);
	}
}
