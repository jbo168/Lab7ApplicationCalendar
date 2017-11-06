import java.util.StringTokenizer;

/**   An appointment.
*/
public class Appointment
{ 
   private String description;
   private AppointmentDate day;
   private AppointmentTime from;
   private AppointmentTime to;

   public Appointment(String line)
   {
   		String [] str = line.split("\\s");
   		if(str.length >4)
   		{
   			for(int i=0; i<str.length-3; i++)
   			{
	   			this.description += str[i];
	   		}	   		
	   	}
		this.day = new AppointmentDate(str[str.length-3]);
		this.from = new AppointmentTime(str[str.length-2]);
		this.to = new AppointmentTime(str[str.length-1]);
   }


   public String toString()
   {
   		String format = "";
   		format += description + "\n";
   		format += "Date" + day.toString() + "\n";
   		format += "From" + from.toString() + "To" + to.toString() + "\n"; 
   		return format;
   }

   public boolean isDateEqual(Appointment appt)
   {
   		return day.isDateEqual(appt.day);
   }

   public AppointmentDate getAppointmentDate()
   {
   		return day;
   }
}
