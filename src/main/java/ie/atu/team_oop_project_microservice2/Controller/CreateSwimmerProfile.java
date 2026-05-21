package ie.atu.team_oop_project_microservice2.Controller;

import ie.atu.team_oop_project_microservice2.Model.SwimmerProfile;
import ie.atu.team_oop_project_microservice2.Service.CreateProfileService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/profiles")

public class CreateSwimmerProfile {
    private final CreateProfileService profileService;

    public CreateSwimmerProfile(CreateProfileService profileService) {
        this.profileService = profileService;
    }

    @PostMapping
    public SwimmerProfile createProfile(@RequestBody SwimmerProfile swimmer){
        return profileService.createProfile(swimmer);
    }

    @GetMapping
    public List<SwimmerProfile> getAllProfiles(){
        return profileService.getAllSwimmerProfiles();
    }

    @GetMapping("/{id}")
    public SwimmerProfile getProfile(@PathVariable int id){
        return profileService.getSwimmerById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteProfile(@PathVariable int id){
        profileService.deleteSwimmerProfileById(id);
    }
}
