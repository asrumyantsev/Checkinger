package pro.sofix.checkinger.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import pro.sofix.checkinger.bot.Telegrambot;

@Controller
@RequestMapping (path = "/tm")

public class Apicontroller {

    private final Telegrambot telegramBot;

    public Apicontroller(Telegrambot telegramBot) {
        this.telegramBot = telegramBot;
    }

/*
    @RequestMapping(value = "/", method = RequestMethod.POST)
    public BotApiMethod<?> onUpdateReceived(@RequestBody Update update) {
        return telegramBot.onWebhookUpdateReceived(update);
    }

*/

    @PostMapping(value="/send")
    public @ResponseBody String sendMessage (@RequestParam String messageText) {

        System.out.println("Message send");
        System.out.println(messageText);

            telegramBot.sendMessageToBot("",messageText);
            return "Done";
    }
    
    
}
