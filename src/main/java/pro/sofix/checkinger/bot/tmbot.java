package pro.sofix.checkinger.bot;

import org.telegram.telegrambots.bots.DefaultBotOptions;
import org.telegram.telegrambots.bots.TelegramWebhookBot;
import org.telegram.telegrambots.meta.api.methods.BotApiMethod;
import org.telegram.telegrambots.meta.api.objects.Update;


public class tmbot extends TelegramWebhookBot {

    public tmbot (DefaultBotOptions botoptions){

    }


    @Override
    public BotApiMethod onWebhookUpdateReceived(Update update) {

            System.out.println("Text");

        return null;
    }

    @Override
    public String getBotUsername() {
        return null;
    }

    @Override
    public String getBotToken() {
        return null;
    }

    @Override
    public String getBotPath() {
        return null;
    }

    public void setUsername(String username) {
        this.setUsername(username);
    }

    public void setBottoken(String bottoken){
        this.setBottoken(bottoken);
    }

    public void setWebhook(String webhookUrl){
        this.setWebhook(webhookUrl);
    }


}
