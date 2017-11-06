import java.io.IOException;

/**   A system to manage appointments.
*/
public class AppointmentSystem
{  
   public static void main(String[] args)
        throws IOException
   { 
      AppointmentMenu menu = new AppointmentMenu();
      menu.run();
   }
}
