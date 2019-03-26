package com.xjt.graduate.service.Impl;

import com.xjt.graduate.service.MailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.stereotype.Component;

import javax.mail.MessagingException;

/**
 * @author xiongjieteng
 * @date 2019-03-06 - 10:25
 */
@Component
public class MailServiceImpl implements MailService {


    private JavaMailSender mailSender = new JavaMailSenderImpl();

    private String from = "elkxiong@163.com";

    @Override
    public void sendInlineResourceMail(String to, String subject, String content) throws MessagingException {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom(from);
        message.setTo(to);
        message.setSubject(subject);
        message.setText(content);
        mailSender.send(message);
    }

    @Override
    public void sendSimpleMail(String to,String subject, String text) {

        SimpleMailMessage mailMessage = new SimpleMailMessage();
        mailMessage.setFrom(from);
        mailMessage.setTo(to);

        mailMessage.setSubject(subject);
        mailMessage.setText(text);

        mailSender.send(mailMessage);

    }

}
