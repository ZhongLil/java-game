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
		// 为数组存入100个随机数
		for (int i = 0; i < intArr.length; i++) {
			// 随机数取值范围为0~99
			intArr[i] = rao.nextInt(100);
		}
		// 打印无序数组
		for (int intArrs : intArr) {
			System.out.print(intArrs + "  ");
			index++;
			// 每打印十个数换行
			if (index % 10 == 0) {
				System.out.println();
			}
		}
		Arrays.sort(intArr);
		// 打印升序后的数组
		// 下标reset
		System.out.println();
		System.out
				.println("====================================================");
		index = 0;
		for (int intArrs : intArr) {
			System.out.print(intArrs + "  ");
			index++;
			// 每打印十个数换行
			if (index % 10 == 0) {
				System.out.println();
			}
		}

		// 二分法查找
		System.out.println();
		System.out
				.println("==================================================");
		System.out.print("请输入需要查找的数(0~99):");
		num = input.nextInt();
		for (; start != end + 1;) {
			// 查找次数
			sum++;
			// 查找
			if (intArr[((start + end) / 2)] < num) {
				start = (start + end) / 2 + 1;
			} else if (intArr[((start + end) / 2)] == num) {
				bol = true;
				break;
			} else {
				end = (start + end) / 2 - 1;
			}
		}
		// 判断是否查找到
		if (bol) {
			System.out.print(num + "存在,二分法总共查找了" + sum + "次" + "该元素下标为:"
					+ ((start + end) / 2));
		} else {
			System.out.println("不存在" + num);
		}
	}
}
