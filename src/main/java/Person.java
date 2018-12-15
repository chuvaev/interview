
public class Person {

    private String firstName;
    private String lastName;
    private String middleName;
    private String country;
    private String address;
    private String phone;
    private int age;
    private String gender;

    @Override
    public String toString() {
        return "Person: " +'\n'+
                "First name: " + firstName + '\n' +
                " Last name: " + lastName + '\n' +
                " Middle name: " + middleName + '\n' +
                " Country: " + country + '\n' +
                " Address: " + address + '\n' +
                " Phone: " + phone + '\n' +
                " Age: " + age + '\n' +
                " Gender: " + gender;
    }

    static class Builder{
        private Person person;

        Builder(){
            person = new Person();
        }

        Builder firstName(String firstName){
            person.firstName = firstName;
            return this;
        }

        Builder lastName(String lastName){
            person.lastName = lastName;
            return this;
        }

        Builder middleName(String middleName){
            person.middleName = middleName;
            return this;
        }

        Builder country(String country){
            person.country = country;
            return this;
        }

        Builder address(String address){
            person.address =  address;
            return this;
        }

        Builder phone(String phone){
            person.phone = phone;
            return this;
        }

        Builder age(int age){
            person.age = age;
            return this;
        }

        Builder gender(String gender){
            person.gender = gender;
            return this;
        }

        Person build(){
            return person;
        }
    }
}
