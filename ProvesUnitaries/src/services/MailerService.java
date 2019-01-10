package services;

import data.*;

/**
* External service for sending mails
*/
public interface MailerService {
    void send(MailAdress address, DigitalSignature signature);
}