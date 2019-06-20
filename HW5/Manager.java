package HW5;

public class Manager extends App{
	
	public static int managerCode = 123;
	public static void manage(int[][] seatArray) {
		System.out.print("관리자 코드를 입력하세요. (종료는 1을 입력하세요.)");
		
		while(true)
		{
			int code = scanner.nextInt();
			if(checkManager(code)) 
			{
				System.out.print("관리자 모드로 접근하셨습니다. 자리 정보를 초기화하시겠습니까? 1. 예 2. 아니오 ");
				code = scanner.nextInt();
				if(code == 1)
				{
					for(int i=0; i<10; i++)
					{	
						for(int j=0; j<2; j++)
							seatArray[i][j] = 0;
					}
					
					System.out.println("초기화가 성공적으로 완료되었습니다.");
				}
				System.out.println("처음으로 돌아가시겠습니까? 1. 예 ");
				code = scanner.nextInt();
				if(code == 1) break;
				else if(code == 2) break;
					
			}
			else if(code == 1) break;
			else
				System.out.println("올바르지 않은 코드입니다. 다시 입력하세요.");
			
		}
		
	}
	
	public static boolean checkManager(int code) {
		if(code == managerCode)
			return true;
		else
			return false;
	}

}
