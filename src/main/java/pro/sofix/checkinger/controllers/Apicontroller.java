package pro.sofix.checkinger.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import pro.sofix.checkinger.bot.Telegrambot;

@Controller
@RequestMapping (path = "/tm")

public class Apicontroller {

    @Autowired
    Telegrambot telegramBot;

    public Apicontroller() {

    }
//    public Apicontroller(Telegrambot telegramBot) {
//        this.telegramBot = telegramBot;
//    }

    @PostMapping(value="/send")
    public @ResponseBody String sendMessage (@RequestParam String messageText) {

        System.out.println("Message send");
        System.out.println(messageText);

            telegramBot.sendMessageToBot("129767120",messageText);
            return "Done";
    }

}
