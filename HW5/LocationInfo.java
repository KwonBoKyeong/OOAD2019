package HW5;

import java.util.Scanner;

public class LocationInfo{

	static Scanner scanner = new Scanner(System.in);
	
	public static String[] locationArray = {"서울","수원","천안","대전","광주","경주","울산","공주","부산","대구"};
	
	public static void getLocation(Object[] user)
	{
		
		for(int i=0; i<locationArray.length; i++)
		{
			System.out.println((i+1) + " : " + locationArray[i]);
		}
		System.out.print("출발지를 선택하세요. : ");
		int num = scanner.nextInt();
		((User) user[User.getUserID()]).setOrigin(locationArray[num-1]); 
		System.out.print("도착지를 선택하세요. : ");
		while(true)
		{
			num = scanner.nextInt();
			if(locationArray[num-1] != ((User)user[User.getUserID()]).getOrigin())
			{
				((User) user[User.getUserID()]).setDestination(locationArray[num-1]);
				break;
			}
			else {
				System.out.println("출발지와 목적지가 같습니다. 목적지를 다시 선택해주세요. :");
				
			}
		}
	}
}
