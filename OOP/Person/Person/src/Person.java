public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public String getFirstName(){
        return this.firstName;
    }

    public String getLastName(){
        return this.lastName;
    }

    public Integer getAge(){
        return this.age;
    }

    public void setFirstName(String firstName){
        this.firstName=firstName;
    }

    public void setLastName(String lastName){
        this.lastName=lastName;
    }

    public void setAge(Integer age){
        this.age=age;
    }

    public boolean isTeen(){
        if ((this.age>12)&&(this.age<20)){
            return true;
        } else {
            return false;
        }
    }

    public String getFullName(){
        if (this.firstName.isEmpty()){
            this.firstName="";
        }
        if (this.lastName.isEmpty()){
            this.lastName="";
        }
        String fullName=this.firstName+" "+this.lastName;
        return fullName;
    }



}
