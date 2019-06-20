package HW5;

import java.util.Scanner;

public class SeatInfo{
	
	static Scanner scanner = new Scanner(System.in);
	
	public static int[][] seatArray = {{0,0},{0,0},{0,0},{0,0},{0,0},{0,0},{0,0},{0,0},{0,0},{0,0}}; //기차 좌석
	
	public static int seatX;
	public static int seatY;
	
	public static void getSeats(Object[] user){
		for(int i=0; i<10; i++)
		{	
			for(int j=0; j<2; j++)
				System.out.print(seatArray[i][j] + " ");
			System.out.println();
		}
		
		while(true)
		{
			System.out.print("원하는 좌석을 선택해주세요. ");
			
			seatX = scanner.nextInt();
			seatY = scanner.nextInt();
			if(seatX > 9 || seatY > 1)
			{
				System.out.println("좌석 선택이 잘못되었습니다. 다시 선택해주세요.");
				continue;
			}
				
			System.out.println("선택한 좌석은 (" +seatX +","+seatY+")입니다. 계속 진행하시겠습니까? 1. 예 2. 아니오");
			int num = scanner.nextInt();
			if(seatArray[seatX][seatY] == 0 && num == 1)
			{
				((User) user[User.getUserID()]).setSeat("["+seatX+","+seatY+"]");
				seatArray[seatX][seatY] = 1;
				break;
			}
			else continue;
		}
	}
	
	public static void reset(Object[] user)
	{
		seatArray[seatY][seatY] = 0;
		((User)user[User.userID]).seat = null;
	}
}
