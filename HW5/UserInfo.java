package HW5;

import java.util.Random;
import java.util.Scanner;

public class UserInfo{

	static Scanner scanner = new Scanner(System.in);
	
	public static int id = 0;
	public static int count;
	public static String name;
	
	public static void getUserName(Object[] user)
	{
		System.out.print("이름을 입력해주세요 : ");
		name = scanner.next();
		((User) user[id]).setuserName(name);
	}
	
	public static void getUserId(Object[] user)
	{
		((User) user[id]).setUserID(id);
		id++;
	}
	
	public static void getAcount(Object[] user)
	{

		Random random = new Random();
		count = random.nextInt(50);

		((User) user[id]).setAmount(count);
	}
}
