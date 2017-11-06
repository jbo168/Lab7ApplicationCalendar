import java.util.*;

/** An appointment date.
   */
public class AppointmentDate
{  
	private int year;
	private int month;
	private int day;

	public AppointmentDate(String line)
	{
			String [] str = line.split("/");
			this.day = Integer.parseInt(str[0]);
			this.month = Integer.parseInt(str[1]);
			this.year = Integer.parseInt(str[2]);
	}

	public boolean isDateEqual(AppointmentDate d)
	{
		boolean equal = false;
		if(d.year == this.year && d.month == month && d.day == day)
		return true;
		else 
		return equal;
	}

	public String toString()
	{
			String date = "";
			date += day + "/" + month + "/" + year;
			return date;
	}
}