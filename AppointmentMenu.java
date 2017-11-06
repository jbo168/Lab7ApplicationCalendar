import java.util.Scanner;
import java.util.ArrayList;


/**   A menu for the appointment calendar system.
*/
public class AppointmentMenu
{
   private Scanner in;

   /**      Constructs an AppointmentMenu object.
   */
   public AppointmentMenu()
   {
       in = new Scanner(System.in);
   }
   
   /**      Runs the system.
   */
   public void run()
   {         
      boolean more = true;
      AppointmentCalendar calendar = new AppointmentCalendar();
  
      while (more)
      {  
         System.out.println("A)dd  C)ancel  S)how  Q)uit");
         String command = in.nextLine().toUpperCase();

         if (command.equals("A"))
         {  
            System.out.println("Appointment (Description Date From To)");
            String line = in.nextLine();
            Appointment a = new Appointment(line);
            calendar.add(a);
         }
         else if (command.equals("C"))
         { 
            System.out.println("Appointment (Date From To)");
            String line = in.nextLine();
            AppointmentDate day = new AppointmentDate(line);
            Appointment a = getChoice(calendar.getAppointmentsForDay(day));
            if (a != null)
               calendar.cancel(a);
         }
         else if (command.equals("S"))
         { 
            System.out.println("Date");
            String line = in.nextLine();
            AppointmentDate day = new AppointmentDate(line);
            for (Appointment appt : calendar.getAppointmentsForDay(day))
               System.out.println(appt.toString());
         }
         else if (command.equals("Q"))
         { 
            more = false;
         }
      }      
   }

   private Appointment getChoice(ArrayList<Appointment> choices)
   {
      if (choices.size() == 0) return null;
      while (true)
      {
         char c = 'A';
         for (Appointment choice : choices)
         {
            System.out.println(c + ") " + choice.toString()); 
            c++;
         }
         String input = in.nextLine();
         int n = input.toUpperCase().charAt(0) - 'A';
         if (0 <= n && n < choices.size())
            return choices.get(n);
      }      
   }
}
