package services;

import data.*;

/**
* External service for sending mails
*/
public interface MailerService {
    void send(MailAddress address, DigitalSignature signature);
}