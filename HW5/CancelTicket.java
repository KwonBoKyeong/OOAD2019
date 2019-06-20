package HW5;

import java.util.Scanner;

public class CancelTicket {
	
	static Scanner scanner = new Scanner(System.in);
	
	public static void cancel(Object[] user) {
		System.out.print("이름을 입력해주세요 : ");
		String name = scanner.next();
		int isTrue = 0;
		for(int i=0; i<10; i++) 
		{
			if(name.equals(((User)user[i]).userName))
			{
				System.out.println(user[i].toString());
				
				
				System.out.println("\n1. 승차권 반환하기 2. 처음으로 돌아가기" );
				System.out.print("");
				int selectNum = scanner.nextInt();
				if(selectNum == 1)
				{
					((User)user[i]).reset();
					Payment.resetPayment(user);
					System.out.println("승차권 반환이 정상적으로 처리되었습니다.");
				}
					
				else if(selectNum == 2)
				{
					isTrue=1;
					break;
				}
					
				
				isTrue = 1; 
			}
			
		}
		if(isTrue == 0)
			System.out.println("해당 예약자가 존재하지 않습니다.");
		
	}
}
