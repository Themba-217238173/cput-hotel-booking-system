package za.ac.cput.cms.booking.repository.guest;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.cms.booking.entity.guest.Particulars;

public interface IParticularsRepository  extends JpaRepository<Particulars,Integer>
{

}

