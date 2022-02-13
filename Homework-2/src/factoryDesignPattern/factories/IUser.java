package factoryDesignPattern.factories;

import factoryDesignPattern.model.Message;

import java.util.List;

public interface IUser {

    public String getEmail();

    public void setEmail(String email);

    public String getPassword();

    public void setPassword(String password);

    public String getPhoto();

    public void setPhoto(String photo);

    public String getBiography();

    public void setBiography(String biography);

    public String getPhoneNumber();

    public void setPhoneNumber(String phoneNumber);

    public List<Message> getMessageBox();

    public void setMessageBox();
}
