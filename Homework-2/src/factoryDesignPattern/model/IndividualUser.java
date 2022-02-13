package factoryDesignPattern.model;


import factoryDesignPattern.factories.IUser;

import java.util.List;
import java.util.Set;

public class IndividualUser extends User implements IUser {


    private String firstName;
    private String lastName;
    private String savedSearches;
    private Set<Advertisement> favouriteAdvertisements;
    private List<Advertisement> postedAdvertisement;

    public IndividualUser() {
    }

    public IndividualUser(String email, String password, String photo, String biography, String phoneNumber, List<Message> messageBox) {
        super(email, password, photo, biography, phoneNumber, messageBox);
    }

    public IndividualUser(String email, String password, String photo, String biography, String phoneNumber, List<Message> messageBox, String firstName, String lastName, String savedSearches, Set<Advertisement> favouriteAdvertisements, List<Advertisement> postedAdvertisement) {
        super(email, password, photo, biography, phoneNumber, messageBox);
        this.firstName = firstName;
        this.lastName = lastName;
        this.savedSearches = savedSearches;
        this.favouriteAdvertisements = favouriteAdvertisements;
        this.postedAdvertisement = postedAdvertisement;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSavedSearches() {
        return savedSearches;
    }

    public void setSavedSearches(String savedSearches) {
        this.savedSearches = savedSearches;
    }

    public Set<Advertisement> getFavouriteAdvertisements() {
        return favouriteAdvertisements;
    }

    public void setFavouriteAdvertisements(Set<Advertisement> favouriteAdvertisements) {
        this.favouriteAdvertisements = favouriteAdvertisements;
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
