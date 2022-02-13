package factoryDesignPattern.factories;

import factoryDesignPattern.model.CorporateUser;
import factoryDesignPattern.model.IndividualUser;
import factoryDesignPattern.model.User;

public class UserFactory {


    public static IUser createUser(String userType) {

        IUser user;

        if (userType.equals("Individual")) {
            user = new IndividualUser();
        }
        else if (userType.equals("Corporate")) {
            user = new CorporateUser();
        }
        else if (userType.equals("User")) {
            user = new User();
        } else {
            throw new RuntimeException(userType + " factory did not work");
        }
        return user;
    }
}