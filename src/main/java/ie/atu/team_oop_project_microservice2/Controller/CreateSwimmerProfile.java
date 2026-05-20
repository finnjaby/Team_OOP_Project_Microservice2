package ie.atu.team_oop_project_microservice2.Controller;

import ie.atu.team_oop_project_microservice2.Model.SwimmerProfile;
import ie.atu.team_oop_project_microservice2.Service.CreateProfileService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
