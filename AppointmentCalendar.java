import java.util.*;

/**   An appointment calendar.
*/
public class AppointmentCalendar
{  
   private ArrayList<Appointment> appointments;

   public AppointmentCalendar()
   {
   		appointments = new ArrayList<Appointment>();
   }

   public void add(Appointment a)
   {
   		appointments.add(a);
   }

   public ArrayList<Appointment> getAppointmentsForDay(AppointmentDate d)
   {
   		ArrayList<Appointment> apptList = new ArrayList<Appointment>();
   		for(int i=0; i<appointments.size(); i++)
   		{
   			if(appointments.get(i).getAppointmentDate().isDateEqual(d))
   				apptList.add(appointments.get(i));
   		}

   		return apptList;
   }

   public void cancel(Appointment a)
   {
   		for(int i=0; i<appointments.size(); i++)
   		{
   			if(appointments.get(i).isDateEqual(a))
   				appointments.remove(i);
   		}
   }
}
