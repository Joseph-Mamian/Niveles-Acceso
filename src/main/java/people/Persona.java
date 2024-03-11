package people;

public class Persona {
  private String name;
  private int age;
  private String fullName;
  private String lastname;
  
    public Persona(String name,String lastname, int age) {
        this.name = name;
        this.lastname = lastname;
        this.age = age;
        createFullName(name, lastname);
    }

    public int getAge() {
        return age;
    }
    
    private void createFullName(String name, String lastname){
        this.fullName = name + " " + lastname;
    }

    public String getFullName() {
        return this.fullName;
    }
    
    
  
   
    
}
