package pro.sofix.checkinger.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.telegram.telegrambots.meta.api.methods.BotApiMethod;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import pro.sofix.checkinger.bot.Telegrambot;

@Controller
@RequestMapping (path = "/tm")

public class apicontroller {

    private final Telegrambot telegramBot;

    public apicontroller(Telegrambot telegramBot) {
        this.telegramBot = telegramBot;
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public BotApiMethod<?> onUpdateReceived(@RequestBody Update update) {
        return telegramBot.onWebhookUpdateReceived(update);
    }

    @PostMapping(value="/send")
    public @ResponseBody String sendMessage (@RequestParam String messageText) {
        //TODSomeEnityDataOentity: process POST request
        System.out.println("Message send");
        System.out.println(messageText);
            telegramBot.sendMessageToBot("",messageText);
            return "Done";
    }
    
    
}
