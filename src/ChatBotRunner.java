public class ChatBotRunner {
    public static void main(String[] args)
    {
        ChatBot joe = new ChatBot("Joe", 7);
        joe.greeting("Simon");
        joe.weather();
        System.out.println("Did you know that "+joe.convertFeetToMeters(1)+" meter is 1 foot?");
        System.out.println("Did you know that 213+32141+456 is "+joe.addNumbers(213, 32141, 456)+"?");
        joe.favoriteNumber(12);
        System.out.println(joe.goodbye());

    }
}
