package za.ac.cput.cms.booking.controller.guest;
/**
 * @Author: Themba Khnayile 217238173
 * REST Controller which  exposing business layer of Particulars Entity
 * Created: 19/10/2021
 * */


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.cms.booking.entity.guest.Guest;
import za.ac.cput.cms.booking.entity.guest.Particulars;
import za.ac.cput.cms.booking.service.guest.impl.ParticularsService;

@RestController
@RequestMapping("/za.ac.cput.hotelbookingservice/api/guest")

public class ParticularsController
{

    @Autowired
    private ParticularsService particularsService;

    @RequestMapping("")
    public String guestParticulars() {
        return "Particulars for Guest Service requests";
    }

    @PostMapping("/create")
    public Particulars createParticulars(@RequestBody Particulars particulars){

        Particulars newParticulars = new Particulars.Builder().copy(particulars).build();
        return this.particularsService.create(newParticulars);
    }

    @GetMapping("/read/{idNo}")
    public Particulars readParticulars(@PathVariable String idNo) {
        return this.particularsService.read(idNo);
    }

    @PutMapping("/update")
    public Particulars updateParticulars(@RequestBody Particulars particulars) {

        Particulars updatedParticulars = new Particulars.Builder().copy(particulars).build();
        return this.particularsService.update(updatedParticulars);
    }

    @DeleteMapping("/delete/{idNo}")
    public Boolean deleteParticulars(@PathVariable String idNo) {
        return this.particularsService.delete(idNo);
    }
}
