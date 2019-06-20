package HW5;

import java.util.Calendar;

public class User {

	
	/* Attributes */
	public String userName; //예약자
	public Calendar today; //예약 날짜 
	public String origin; //출발지 
	public String destination; //도착지 
	public int departureTime; //출발시간 
	public int arriveTime; //도착시간
	public String seat; //좌석 
	public static int userID;
	public int amount; //잔액 
	
	
	/* Constructor */
	public User()
	{
		userName = "Someone";
		today = Calendar.getInstance();
		origin = null;
		destination = null;
		departureTime = 0;
		arriveTime = 0;
		userID = 0;
		seat = null;
		amount = 0;
	}
	
	public User(Calendar today, String origin, String destination, int departureTime, int arriveTime, int userID, String userName, String seat, int amount)
	{
		this.userName = userName;
		this.today = today;
		this.origin = origin;
		this.destination = destination;
		this.departureTime = departureTime;
		this.arriveTime = arriveTime;
		this.userID = userID;
		this.seat = seat;
		this.amount = amount;
	}
	
	public void reset() {
		userName = "Someone";
		today = Calendar.getInstance();
		origin = null;
		destination = null;
		departureTime = 0;
		arriveTime = 0;
		userID = 0;
		seat = null;
		amount = 0;
		
		
	}

	/* getter & setter methods */
	public String getuserName() {
		return userName;
	}

	public void setuserName(String userName) {
		this.userName = userName;
	}
	
	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public int getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(int departureTime) {
		this.departureTime = departureTime;
	}

	public int getArriveTime() {
		return arriveTime;
	}

	public void setArriveTime(int arriveTime) {
		this.arriveTime = arriveTime;
	}
	
	public static int getUserID() {
		return userID;
	}
	
	public void setUserID(int userID) {
		this.userID = userID;
	}

	public String getSeat() {
		return seat;
	}

	public void setSeat(String seat) {
		this.seat = seat;
	}
	

	public Calendar getToday() {
		return today;
	}

	public void setToday(Calendar today) {
		this.today = today;
	}
	
	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}


	@Override
	public String toString() {
		return "[ " + userName + "님의 예매 내역 ]\n예약한 날짜 : " + today.get(Calendar.MONTH) + "월 " + today.get(Calendar.DAY_OF_MONTH) + "일 " + "\n출발지 : " + origin + "\n도착지 : " + destination
				+ "\n출발 시간 : " + departureTime + "시	\n도착 시간 : " + arriveTime + "시\n좌석 : " + seat + "\n카드 잔액 : " + amount 
				+ "만원\n---------------------------";
	}

	
	


	
	
}
