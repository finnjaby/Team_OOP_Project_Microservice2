package ie.atu.team_oop_project_microservice2.Repository;


import ie.atu.oopgroupproject.model.SwimmerProfile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SwimmerProfileRepo extends JpaRepository<SwimmerProfile,Integer> {

}
