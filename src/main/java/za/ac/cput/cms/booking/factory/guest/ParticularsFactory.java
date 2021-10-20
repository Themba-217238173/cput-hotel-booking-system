package za.ac.cput.cms.booking.factory.guest;
/**
        * Author: Themba Khanyile 217238173
        * Factory class for creating instances of Guest.Class
        * Created: 19/10/2021
 * */

        import za.ac.cput.cms.booking.entity.guest.Guest;
        import za.ac.cput.cms.booking.entity.guest.Particulars;

public class ParticularsFactory
{

    public static Particulars buildParticulars(int idNo, String firstName,String lastName,String dateOfBirth )

    {
        Particulars particulars= new Particulars.Builder()
                .setidNo("860601084")
               .setfirstName("Sharon")
                .setlastName("Smith")
                .setdateOfBirth("1986 June 1").build();
        return particulars;
    }
}
