
package assimg_lab5_q1;

public class MemeberFactory 
{
    public Staff getmemeber(String MemeberName)
    {
        
        if(MemeberName==null)
        {
            return null;
        }
        if(MemeberName.equalsIgnoreCase("TEACHINGASSISTANT"))
        {
            return new TeachingAssistant();
        }
        if(MemeberName.equalsIgnoreCase("DOCTOR"))
        {
            return new Doctor();
        }
        return null;
        
    }
}
