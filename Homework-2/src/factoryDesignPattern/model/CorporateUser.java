package factoryDesignPattern.model;


import factoryDesignPattern.factories.IUser;

import java.util.List;

public class CorporateUser extends User implements IUser {

    private String companyName;
    private String taxNumber;
    private String adress;
    private String[] advisors;
    private List<Advertisement> postedAdvertisement;

    public CorporateUser() {
    }

    public CorporateUser(String email, String password, String photo, String biography, String phoneNumber, List<Message> messageBox, String companyName, String taxNumber, String adress, String[] advisors, List<Advertisement> postedAdvertisement) {
        super(email, password, photo, biography, phoneNumber, messageBox);
        this.companyName = companyName;
        this.taxNumber = taxNumber;
        this.adress = adress;
        this.advisors = advisors;
        this.postedAdvertisement = postedAdvertisement;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getTaxNumber() {
        return taxNumber;
    }

    public void setTaxNumber(String taxNumber) {
        this.taxNumber = taxNumber;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String[] getAdvisors() {
        return advisors;
    }

    public void setAdvisors(String[] advisors) {
        this.advisors = advisors;
    }

    public List<Advertisement> getPostedAdvertisement() {
        return postedAdvertisement;
    }

    public void setPostedAdvertisement(List<Advertisement> postedAdvertisement) {
        this.postedAdvertisement = postedAdvertisement;
    }

    @Override
    public void setMessageBox() {

    }
}
