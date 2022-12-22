package grafana_data_feeder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class GrafanaDataFeederApplication {

    public static void main(String[] args) {
        SpringApplication.run(GrafanaDataFeederApplication.class, args);

        System.out.println("Are we good to go?");
    }

}
