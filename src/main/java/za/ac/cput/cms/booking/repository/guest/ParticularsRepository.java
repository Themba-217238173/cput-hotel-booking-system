package za.ac.cput.cms.booking.repository.guest;
import org.springframework.data.jpa.repository.JpaRepository;
import za.ac.cput.cms.booking.entity.guest.Particulars;
import org.springframework.stereotype.Repository;
import java.util.Optional;

import java.util.Set;

@Repository
public interface ParticularsRepository extends JpaRepository <Particulars, String> {


}
