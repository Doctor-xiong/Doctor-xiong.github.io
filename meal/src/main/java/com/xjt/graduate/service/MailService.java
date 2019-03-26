package com.xjt.graduate.service;

import org.springframework.stereotype.Component;

import javax.mail.MessagingException;

/**
 * @author xiongjieteng
 * @date 2019-03-06 - 10:23
 */
@Component
public interface MailService {
    public void sendInlineResourceMail(String to, String subject, String content) throws MessagingException;
    public void sendSimpleMail(String to,String subject, String text);
}
