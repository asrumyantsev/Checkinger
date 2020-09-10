package pro.sofix.checkinger.bot;

import org.telegram.telegrambots.bots.DefaultBotOptions;
import org.telegram.telegrambots.bots.TelegramWebhookBot;
import org.telegram.telegrambots.meta.api.methods.BotApiMethod;
import org.telegram.telegrambots.meta.api.objects.Update;


public class Telegrambot extends TelegramWebhookBot {
    private String webHookUrl;
    private String botToken;
    private String botUserName;

    public Telegrambot(DefaultBotOptions botOptions){
        super(botOptions);
    }

    @Override
    public BotApiMethod onWebhookUpdateReceived(Update update) {

            //System.out.println("Text");

        return null;
    }

    @Override
    public String getBotUsername() {
        return botUserName;
    }

    @Override
    public String getBotToken() {
        return botToken;
    }

    @Override
    public String getBotPath() {
        return webHookUrl;
    }

    public void setUsername(String botUserName) {
        this.botUserName = botUserName;
    }

    public void setBottoken(String botToken){
        this.botToken = botToken;
    }

    public void setWebhook(String webHookUrl){
        this.webHookUrl = webHookUrl;
    }


}
