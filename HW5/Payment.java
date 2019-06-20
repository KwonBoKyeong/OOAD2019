package HW5;

import java.util.Random;
import java.util.Scanner;

public class Payment{
	
	static Scanner scanner = new Scanner(System.in);
	
	public static int price; //표 가격
	
	
	public static void getPayment(Object[] user) {
		System.out.println("현재 예약자의 잔액은 " + ((User)user[User.getUserID()]).getAmount() + "만원입니다. ");
		System.out.print("결제를 계속 하시겠습니까? 1. 예 2. 아니요");
		int num = scanner.nextInt();
		
		if(num == 1)
		{
			Random random = new Random();
			
			price = random.nextInt(4)+1;
			((User)user[User.userID]).amount -= price;
			System.out.println("기차표 가격은 " + price + "만원으로, 결제 후 예약자의 잔액은 " + ((User)user[User.userID]).amount + "만원 입니다.");
			
		}
		else
			System.out.println("예약이 취소되었습니다.");
	}
	
	public static void resetPayment(Object[] user) {
		((User)user[User.userID]).amount += price;
		System.out.println("반환 후 잔액은 " + ((User)user[User.userID]).amount + "만원 입니다.");
	}
	
}
