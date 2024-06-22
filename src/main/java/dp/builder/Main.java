package dp.builder;



public class Main {

    public static void main(String[] args) {

        User user = new User.UserBuilder().setUserId("1").setUserName("raman").setUserEmail("raman@12.com").build();
        System.out.println(user.hashCode());

    }

}
