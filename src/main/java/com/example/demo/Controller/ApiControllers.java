package com.example.demo.Controller;

import com.example.demo.Models.Payment_Record;
import com.example.demo.Models.Profile;
import com.example.demo.Repo.Payment_RecordRepo;
import com.example.demo.Repo.ProfileRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ApiControllers {

    @Autowired
    private ProfileRepo profileRepo;
    @Autowired
    private Payment_RecordRepo payment_recordRepo;



//    @GetMapping("api/v1/test")
//    public String getPage() {
//        return "Welcome";
//    }

    @GetMapping("api/v1/payment_record")
    public List<Payment_Record> getPayment_Record() {
        return payment_recordRepo.findAll();
    }

    @GetMapping("api/v1/profiles")
    public List<Profile> getProfiles() {
        return profileRepo.findAll();
    }

//    @PostMapping("api/v1/save")
//    public String saveUser(@RequestBody Profile profile){
//        userRepo.save(profile);
//        return "saved....";
//    }

//    @PutMapping("api/v1/update/{id}")
//    public String updateUser(@PathVariable long id, @RequestBody Profile profile){
//        Profile updatedProfile = userRepo.findById(id).get();
//        updatedProfile.setFirstname(profile.getFirstname());
//        updatedProfile.setLastname(profile.getLastname());
//        updatedProfile.setOccupation(profile.getOccupation());
//        updatedProfile.setAge(profile.getAge());
//        userRepo.save(updatedProfile);
//        return "Updated...";
//    }

//    @DeleteMapping("api/v1/delete/{id}")
//    public String deleteUser(@PathVariable long id){
//        Profile deleteProfile = userRepo.findById(id).get();
//        userRepo.delete(deleteProfile);
//        return "Delete user by id : " + id;
//    }

}
