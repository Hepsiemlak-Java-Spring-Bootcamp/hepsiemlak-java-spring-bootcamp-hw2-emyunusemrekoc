package factoryDesignPattern.factories;

public class MessageFactory {

    //Factory Method New Instance ile
    public static IMessage createMessage(Class messageClass) throws IllegalAccessException, InstantiationException {
        return (IMessage) messageClass.newInstance();
    }
}