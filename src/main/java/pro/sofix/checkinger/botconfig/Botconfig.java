package pro.sofix.checkinger.botconfig;


import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.telegram.telegrambots.bots.DefaultBotOptions;
import org.telegram.telegrambots.meta.ApiContext;
import pro.sofix.checkinger.bot.Telegrambot;


@Getter
@Setter
@Configuration
@ConfigurationProperties (prefix = "telegrambot")

public class Botconfig {
    private String webHookPath;
    private String botUserName;
    private String botToken;

    private DefaultBotOptions.ProxyType proxyType;
    private String proxyHost;
    private int proxyPort;

    @Bean
    public Telegrambot TmWhBot() {
        DefaultBotOptions options = ApiContext.getInstance(DefaultBotOptions.class);

            Telegrambot tmWebhookBot = new Telegrambot(options);
            tmWebhookBot.setUsername(botUserName);
            tmWebhookBot.setBottoken(botToken);
            tmWebhookBot.setWebhook(webHookPath);

        return tmWebhookBot;
    }

}
