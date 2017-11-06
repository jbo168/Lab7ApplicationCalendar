import java.util.StringTokenizer;

/**   An appointment time.
*/
public class AppointmentTime
{ 
   private int hours;
   private int minutes;

   public AppointmentTime(String line)
   {
   		String [] str = line.split(":");
   		this.hours = Integer.parseInt(str[0]);
   		this.minutes = Integer.parseInt(str[1]);
   }

   public String toString()
   {
   		String time = "";
   		time += hours + ":" + minutes;
   		return time;
   }
}