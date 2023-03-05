import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;
import java.util.Random;
public class Main
{
	private Scanner sc = new Scanner(System.in);

	int inputNum()
	{
		try{
			return Integer.parseInt(sc.next());

		}catch(NumberFormatException nfe){
			System.out.println("Not a valid number");
			return inputNum();
		}}
	public static void main(String[] args)
	{
		Main age = new Main();
System.out.println("Year: ");
		int year = age.inputNum();
		System.out.println("Month: ");
		int month = age.inputNum();
		System.out.println("Day: ");
		int day = age.inputNum();
		 Calendar Calender = Calendar.getInstance();
		 int nowyear = Calender.get(Calendar.YEAR);
		 int nowmonth = Calender.get(Calendar.MONTH)+1;
		 int nowday = Calender.get(Calendar.DAY_OF_MONTH);
		 int ageyear = nowyear-year;
		 int agemonth = nowmonth-month;
		 int ageday = nowday-day;
		if(ageday<0) {
			agemonth-=1;
			Calender.add(Calendar.MONTH, -1);
			ageday+=Calender.getActualMaximum(Calendar.DAY_OF_MONTH);
		}
		if(agemonth<0){
			ageyear-=1;
			agemonth+=12;
		}
		System.out.println("Your age is " + ageyear +" years "+ agemonth+ " months and " + ageday +" days.");
		Random r = new Random();
		int ry = r.nextInt(99)+1;
		int rm = r.nextInt(13);
		Calender.set (ry, rm, 0);
		int rd = r.nextInt(Calender.getActualMaximum(Calendar.DAY_OF_MONTH));
		System.out.println("Presumably you will die in " + ry + " years, " + rm + " months and " + rd + " days.");
	}}
