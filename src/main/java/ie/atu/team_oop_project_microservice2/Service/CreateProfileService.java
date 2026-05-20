package ie.atu.team_oop_project_microservice2.Service;

import ie.atu.team_oop_project_microservice2.Model.SwimmerProfile;
import ie.atu.team_oop_project_microservice2.Repository.SwimmerProfileRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CreateProfileService{
    private final SwimmerProfileRepo swimmerProfileRepo;
    public CreateProfileService(SwimmerProfileRepo swimmerProfileRepo) {
        this.swimmerProfileRepo = swimmerProfileRepo;
    }
    public SwimmerProfile createProfile(SwimmerProfile swimmer) {
        if(swimmer.getMemberStatus() && !swimmer.getMedClearance()) {
            throw new RuntimeException("Can't be an active swimmer without medical clearance");
        }
        return swimmerProfileRepo.save(swimmer);
    }
    public List<SwimmerProfile> getAllSwimmerProfiles() {
        return swimmerProfileRepo.findAll();
    }
    public SwimmerProfile getSwimmerById(int id) {
        return swimmerProfileRepo.findById(id).orElseThrow(() -> new RuntimeException("Swimmer Profile with id " + id + " not found"));
    }
    public void deleteSwimmerProfileById(int id) {
        swimmerProfileRepo.deleteById(id);
    }
}