import java.util.List;

class User {
    String username;
    String password;
    String email;

    public User(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username){
        this.username=username;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }
}

public class SILab2 {

    public static boolean function (User user, List<User> allUsers) {
        if (user==null || user.getPassword()==null || user.getEmail()==null){//1
            throw new RuntimeException("Mandatory information missing!");//2
        }

        if (user.getUsername()==null){//3
            user.setUsername(user.getEmail());//4
        }//5

        int same = 1;//6
        if (user.getEmail().contains("@") && user.getEmail().contains(".")) {//7
            same = 0;//8
            for (int i=0;i<allUsers.size();i++) {//9
                User existingUser = allUsers.get(i);//10
                if (existingUser.getEmail() == user.getEmail()) {//11
                    same += 1;//12
                }//13
                if (existingUser.getUsername() == user.getUsername()) {//14
                    same += 1;//15
                }//16
            }//17
        }//18

        String specialCharacters="!#$%&'()*+,-./:;<=>?@[]^_`{|}";//19
        String password = user.getPassword();//20.
        String passwordLower = password.toLowerCase();//21

        if (passwordLower.contains(user.getUsername().toLowerCase()) || password.length()<8) {//22
            return false;//23
        }
        else {//24
            if (!passwordLower.contains(" ")) {//25
                for (int i = 0; i < specialCharacters.length(); i++) {//26
                    if (password.contains(String.valueOf(specialCharacters.charAt(i)))) {//27
                        return same == 0;//28
                    }//29
                }//30
            }//31
        }//32
        return false;//33
    }//34

}
