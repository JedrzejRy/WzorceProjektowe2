package builder.userBuilder;

public class User {
    private String name;
    private String lastName;
    private String mail;

    private User(UserBuilder userBuilder){
        this.name = userBuilder.name;
        this.lastName = userBuilder.lastName;
        this.mail = userBuilder.mail;
    }

    public static class UserBuilder{
        private String name;
        private String lastName;
        private String mail;

        public User build(){
            return new User(this);
        }

        public UserBuilder nameBuilder(String name){
            this.name = name;
            return this;
        }

        public UserBuilder lastNameBuilder(String lastName){
            this.lastName = lastName;
            return this;
        }

        public UserBuilder mailBuilder(String mail){
            this.mail = mail;
            return this;
        }
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", mail='" + mail + '\'' +
                '}';
    }
}
