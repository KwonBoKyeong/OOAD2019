package HW5;

import java.util.Scanner;

public class App {
	
	public static User[] user = new User[10];

	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("*** Welcome to BK's Train Reservation System ***\n");
		
		for(int i=0; i<10; i++)
		{
			user[i] = new User(); //유저 객체 생성
		}
		
		selectMenu();
	}
	
	public static void selectMenu() {
		int selectedNum;
		
		while(true) 
		{
			System.out.println("\n다음 보기 중 원하는 서비스를 선택하세요.");
			System.out.print("1. 기차표 예매하기 \n2. 예매내역 확인 \n3. 기차 관리하기(관리자만 접근가능)");
			
			selectedNum = scanner.nextInt();
			
			if(selectedNum == 1)
			{
				reservation();
				System.out.print("예약이 완료되었습니다. \n1. 처음으로 돌아가기 2. 종료하기 ");
				int num = scanner.nextInt();
				if(num == 1)
					continue;
				else if(num == 2)
					break;
			}
			
			else if(selectedNum == 2)
			{
				check();
			}
			
			else if(selectedNum == 3)
			{
				manage();
			}
			
			
		}
	}
	
	public static void reservation() {
		// 유저 정보 입력
		UserInfo.getUserName(user);
		UserInfo.getAcount(user);
		UserInfo.getUserId(user);
		
		// 출발지, 목적지 선택 
		LocationInfo.getLocation(user);
		
		// 출발 시간 선택
		TimeInfo.getTime(user);

		//좌석선택
		SeatInfo.getSeats(user);
		
		//결제
		Payment.getPayment(user);
		
	}
	
	public static void check() {
		CancelTicket.cancel(user);
	}
	
	public static void manage() {
		Manager.manage(SeatInfo.seatArray);
	}

}
