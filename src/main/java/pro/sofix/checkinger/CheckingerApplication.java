package pro.sofix.checkinger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.telegram.telegrambots.ApiContextInitializer;

@SpringBootApplication
public class CheckingerApplication {

    public static void main(String[] args) {
        ApiContextInitializer.init();
        SpringApplication.run(CheckingerApplication.class, args);
    }

}
