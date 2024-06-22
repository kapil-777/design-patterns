package dp.builder;



//builder DP : it is used when there are many parameter in the objects and bettern than factory dp
//mostly used for making immutable objects
public class User {

    private final String userId;
    private final String userName;
    private final String userEmail;

    private static int count = 0;

    private User(UserBuilder builder) {

        this.userId = builder.userId;
        this.userName = builder.userName;
        this.userEmail = builder.userEmail;

    }

    public String getUserId() {
        return userId;
    }


    public String getUserName() {
        return userName;
    }


    public String getUserEmail() {
        return userEmail;
    }





    @Override
    public String toString() {
        count++;
        return count+" : "+"userId = " + userId + ", userName = " + userName + ", userEmail = " + userEmail ;
    }





    static class UserBuilder{
        private String userId;
        private String userName;
        private String userEmail;



        public UserBuilder setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public UserBuilder setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public UserBuilder setUserEmail(String userEmail) {
            this.userEmail = userEmail;
            return this;
        }



        public User build() {
            return new User(this);
        }




    }


}
