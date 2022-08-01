package builder.userBuilder;

public class Main {
    public static void main(String[] args) {
        User user = new User.UserBuilder()
                .nameBuilder("John")
                .lastNameBuilder("Smith")
                .mailBuilder("JohnSmith@gmail.com")
                .build();
        System.out.println(user);

        User user1 = new User.UserBuilder()
                .nameBuilder("Elizabeth")
                .lastNameBuilder("Kowalski")
                .build();


        System.out.println(user1);
    }
}
