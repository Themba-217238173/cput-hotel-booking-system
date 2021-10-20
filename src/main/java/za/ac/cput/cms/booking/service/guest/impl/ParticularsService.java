package za.ac.cput.cms.booking.service.guest.impl;


import za.ac.cput.cms.booking.entity.guest.Particulars;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.cms.booking.repository.guest.ParticularsRepository;
import za.ac.cput.cms.booking.service.guest.IParticularsService;


import java.util.Set;
import java.util.stream.Collectors;
@Service
public class ParticularsService implements IParticularsService
{
    private static  ParticularsService service = null;

    @Autowired
    private ParticularsRepository repository = null;


    @Override
    public Particulars create(Particulars particulars) {
        return this.repository.save(particulars);
    }


    public Particulars read(Integer integer) {
        return null;
    }

    @Override
    public Particulars read(String idNo ) {
        return this.repository.findById(idNo).orElse(null);
    }

    @Override
    public Particulars update(Particulars particulars) {
        if (this.repository.existsById(particulars.getidNo()))
            return this.repository.save(particulars);
        return null;
    }


    public boolean delete(Integer integer) {
        return false;
    }

    @Override
    public boolean delete(String idNo) {

        this.repository.deleteById(idNo);
        if (this.repository.existsById(idNo))
            return false;
        else
            return true;
    }

    public Set<Particulars> getAll() {
        return this.repository.findAll().stream().collect(Collectors.toSet());
    }


}
