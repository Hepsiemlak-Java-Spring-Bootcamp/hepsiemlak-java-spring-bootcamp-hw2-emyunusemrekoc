package factoryDesignPattern.factories;

import factoryDesignPattern.model.User;

import java.util.Date;

public interface IMessage {

    String getTitle();

    void setTitle(String title);

    String getMessage();

    void setMessage(String message);

    Date getSentDate();

    void setSentDate(Date sentDate);

    Date getReadDate();

    void setReadDate(Date readDate);

    boolean isStatusOfRead();

    void setStatusOfRead(boolean statusOfRead);

    User getSender();

    void setSender(User sender);

    User getReceiver();

    void setReceiver(User receiver);
}
