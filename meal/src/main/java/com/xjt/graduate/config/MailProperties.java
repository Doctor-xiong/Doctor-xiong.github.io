package com.xjt.graduate.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author xiongjieteng
 * @date 2019-03-06 - 10:54
 */
@Component
@ConfigurationProperties(prefix = "mail")
public class MailProperties {
    private String from;

    private String to;

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }
}
