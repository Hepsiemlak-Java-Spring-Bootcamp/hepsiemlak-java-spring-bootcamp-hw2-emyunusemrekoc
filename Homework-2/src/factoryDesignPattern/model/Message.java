package factoryDesignPattern.model;

import factoryDesignPattern.factories.IMessage;

import java.util.Date;

public class Message implements IMessage {

	private String title;
	private String message;
	private Date sentDate;
	private Date readDate;
	private boolean statusOfRead;
	private User sender;
	private User receiver;

	public Message() {
	}


	public Message(String title, String message, User sender, User receiver) {
		this.title = title;
		this.message = message;
		this.sender = sender;
		this.receiver = receiver;
	}

	public Message(String title, String message, Date sentDate, Date readDate, boolean statusOfRead, User sender, User receiver) {
		this.title = title;
		this.message = message;
		this.sentDate = sentDate;
		this.readDate = readDate;
		this.statusOfRead = statusOfRead;
		this.sender = sender;
		this.receiver = receiver;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Date getSentDate() {
		return sentDate;
	}

	public void setSentDate(Date sentDate) {
		this.sentDate = sentDate;
	}

	public Date getReadDate() {
		return readDate;
	}

	public void setReadDate(Date readDate) {
		this.readDate = readDate;
	}

	public boolean isStatusOfRead() {
		return statusOfRead;
	}

	public void setStatusOfRead(boolean statusOfRead) {
		this.statusOfRead = statusOfRead;
	}

	public User getSender() {
		return sender;
	}

	public void setSender(User sender) {
		this.sender = sender;
	}

	public User getReceiver() {
		return receiver;
	}

	public void setReceiver(User receiver) {
		this.receiver = receiver;
	}
}
