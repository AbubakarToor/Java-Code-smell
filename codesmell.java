public class NullCheckExample {
    public static void main(String[] args) {
        User user = new User(null, null);
        
        // Null check code smell: checking for nulls everywhere
        if (user.getName() != null) {
            System.out.println("User's name: " + user.getName());
        } else {
            System.out.println("User's name is not provided.");
        }

        if (user.getEmail() != null) {
            System.out.println("User's email: " + user.getEmail());
        } else {
            System.out.println("User's email is not provided.");
        }
    }
}

class User {
    private String name;
    private String email;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
}
