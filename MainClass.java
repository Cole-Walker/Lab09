public class MainClass 
{
    public static void main(String[] args)
    {
        User user01 = new User("Cole", "Peoria");
        user01.tweet("Hi, this is my first tweet!").display();
        
        User user02 = new User("Joe");
        user02.tweet("Hi, this is Joe!").display();
        
        User user03 = new User("Emily", "NYC");
        user03.tweet("SO beautiful in NYC today!").display();
        
        user02.tweet("I wish I could get some pizza!").display();
    }
}
