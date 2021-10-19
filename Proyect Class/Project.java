public class Project {
    private String name;
    private String description;
    
    public Project() {
        this.name = "No name";
        this.description = "No description";
    }

    public Project(String name) {
        this.name = name;
        this.description = "No description";
    }

    public Project(String name, String description) {
        this.name = name;
        this.description = description;

    }

     // Getters
     public String getName(){
        return this.name;
    }

    public String getDesc(){
        return this.description;
    }

    // Setters
    public void setName( String name ){
        this.name = name;
    }

    public void setDesc( String description ){
        this.description = description;
    }


    public void print(){
        System.out.println( "Name: " + this.name );
        System.out.println( "Description: " + this.description );
    }

    public void elevatorPitch(){
        System.out.println( this.name +" : "+ this.description );
    }


}