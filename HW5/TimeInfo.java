package HW5;

import java.util.Random;
import java.util.Scanner;

public class TimeInfo {
	static Scanner scanner = new Scanner(System.in);
	
	public static int[] timeArray = {8,9,10,11,12,13,14,15,16,17,18};
	
	public static void getTime(Object[] user)
	{
		Random random = new Random();
		for(int k=0; k<timeArray.length; k++)
		{
			if(timeArray[k] > 12) System.out.print((k+1) + " : 오후 ");
			else  System.out.print((k+1) + " : 오전 ");
			System.out.println(timeArray[k] + "시 " + random.nextInt(60) + "분");
		}
		System.out.println();
		
		while(true)
		{
			System.out.print("출발시간을 선택하세요. : ");
			int num = scanner.nextInt();
			((User) user[User.getUserID()]).setDepartureTime((timeArray[num]));
			System.out.println("도착시간은 " + (timeArray[num]+2) + "시 " + random.nextInt(60) + "분입니다. 선택을 완료하시겠습니까? \n 1.예 2.아니오");
			num = scanner.nextInt();
			if(num == 1) {
				((User) user[User.getUserID()]).setArriveTime((timeArray[num]+2));
				break;
			}
			else continue;
		}
		
		System.out.println("시간 선택이 정상적으로 처리되었습니다.");
	}
}
