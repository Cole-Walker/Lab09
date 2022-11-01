public class User 
{ 
    private String name;
    private String location;
    private boolean locationSet;

    public boolean isLocationSet() 
    {
        return locationSet;
    }

    public String getName() 
    {
        return name;
    }

    public String getLocation() 
    {
        return location;
    }

    public void setName(String name) 
    {
        this.name = name;
    }

    public void setLocation(String location) 
    {
        this.location = location;
    }
    
    public User(String name, String location) 
    {
        this.name = name;
        this.location = location;
        this.locationSet = true;
    }
    
    public User(String name)
    {
        this.name = name;
        this.location = "No location provided!";
        this.locationSet = false;
    }
    
    public Tweet tweet(String text)
    {
        Tweet newTweet = new Tweet(text, this);
        return newTweet;
    }
}
