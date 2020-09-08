package pro.sofix.checkinger.botconfig;


import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;

import org.telegram.telegrambots.bots.DefaultBotOptions;
import org.telegram.telegrambots.meta.ApiContext;
import pro.sofix.checkinger.bot.tmbot;


@Data
@Configuration
@ConfigurationProperties (prefix = "telegrambot")

public class botconfig {
    private String webHookPath;
    private String botUserName;
    private String botToken;

    private DefaultBotOptions.ProxyType proxyType;
    private String proxyHost;
    private int proxyPort;



    @Bean
    public tmbot TmWhBot(){
        DefaultBotOptions options = ApiContext.getInstance(DefaultBotOptions.class);

        options.setProxyHost(proxyHost);
        options.setProxyPort(proxyPort);
        options.setProxyType(proxyType);
            tmbot tmwebhookbot = new tmbot(options);

            tmwebhookbot.setWebhook(webHookPath);
            tmwebhookbot.setBottoken(botToken);
            tmwebhookbot.setUsername(botUserName);

        return tmwebhookbot;
    }


}
