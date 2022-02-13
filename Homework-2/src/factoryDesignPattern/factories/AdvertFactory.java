package factoryDesignPattern.factories;

public class AdvertFactory {

    //Factory Method New Instance ile
    public static IAdvert createAdvert(Class advertClass) throws IllegalAccessException, InstantiationException {
        return (IAdvert) advertClass.newInstance();
    }
}
