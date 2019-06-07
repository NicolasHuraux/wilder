class Wilder{

    //attributs
    private String firstname;
    private boolean aware;

    //constructeurs

    public Wilder (String firstname, boolean aware) {
        this.firstname = firstname;
        this.aware = aware;
    }
    //geteur
    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public boolean isAware() {
        return aware;
    }

    public void setAware(boolean aware) {
        this.aware = aware;
    }
    
        
    
   
    //methode
    public String whoAmI() {
        if (aware){
            return "Je m'appelle "+this.getFirstname()+" et je suis aware";
        }
        else {
        
            return "Je m'apelle "+this.getFirstname()+" et je ne suis pas aware";
        }
       
    }

}


