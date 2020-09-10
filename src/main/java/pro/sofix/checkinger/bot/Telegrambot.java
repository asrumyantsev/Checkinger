package pro.sofix.checkinger.bot;

import org.telegram.telegrambots.bots.DefaultBotOptions;
import org.telegram.telegrambots.bots.TelegramWebhookBot;
import org.telegram.telegrambots.meta.api.methods.BotApiMethod;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;


public class Telegrambot extends TelegramWebhookBot {
    private String webHookUrl;
    private String botToken;
    private String botUserName;

    public Telegrambot(DefaultBotOptions botOptions){
        super(botOptions);
    }



    @Override
    public BotApiMethod onWebhookUpdateReceived(Update update) {

            if (update.getMessage() != null && update.getMessage().hasText()) {
                long chat_id = update.getMessage().getChatId();

                try {
                    execute(new SendMessage(chat_id, "Hi " + update.getMessage().getText()));
                    System.out.println(chat_id);
                } catch (TelegramApiException e) {
                    e.printStackTrace();
                }
            }

        return null;
    }

    public SendMessage sendMessageToBot(String chatId, String messageText){
        try {
            execute(new SendMessage("129767120", messageText));
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }

        System.out.println("Сообщение в бота");
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
