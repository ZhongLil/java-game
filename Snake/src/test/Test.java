package test;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Test {

	// public class t {
	//
	// }

	public static void main(String[] args) {
		int[] intArr = new int[101];
		int index = 0;
		int start = 0;
		int end = intArr.length - 1;
		int num = 0;
		int sum = 0;
		boolean bol = false;

		Scanner input = new Scanner(System.in);
		Random rao = new Random();
		// Ϊ�������100�������
		for (int i = 0; i < intArr.length; i++) {
			// �����ȡֵ��ΧΪ0~99
			intArr[i] = rao.nextInt(100);
		}
		// ��ӡ��������
		for (int intArrs : intArr) {
			System.out.print(intArrs + "  ");
			index++;
			// ÿ��ӡʮ��������
			if (index % 10 == 0) {
				System.out.println();
			}
		}
		Arrays.sort(intArr);
		// ��ӡ����������
		// �±�reset
		System.out.println();
		System.out
				.println("====================================================");
		index = 0;
		for (int intArrs : intArr) {
			System.out.print(intArrs + "  ");
			index++;
			// ÿ��ӡʮ��������
			if (index % 10 == 0) {
				System.out.println();
			}
		}

		// ���ַ�����
		System.out.println();
		System.out
				.println("==================================================");
		System.out.print("��������Ҫ���ҵ���(0~99):");
		num = input.nextInt();
		for (; start != end + 1;) {
			// ���Ҵ���
			sum++;
			// ����
			if (intArr[((start + end) / 2)] < num) {
				start = (start + end) / 2 + 1;
			} else if (intArr[((start + end) / 2)] == num) {
				bol = true;
				break;
			} else {
				end = (start + end) / 2 - 1;
			}
		}
		// �ж��Ƿ���ҵ�
		if (bol) {
			System.out.print(num + "����,���ַ��ܹ�������" + sum + "��" + "��Ԫ���±�Ϊ:"
					+ ((start + end) / 2));
		} else {
			System.out.println("������" + num);
		}
	}
}
