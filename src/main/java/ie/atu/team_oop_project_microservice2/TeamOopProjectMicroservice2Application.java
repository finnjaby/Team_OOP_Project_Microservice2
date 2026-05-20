package ie.atu.team_oop_project_microservice2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class TeamOopProjectMicroservice2Application {

    public static void main(String[] args) {
        SpringApplication.run(TeamOopProjectMicroservice2Application.class, args);
    }

}
