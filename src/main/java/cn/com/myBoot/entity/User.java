package cn.com.myBoot.entity;



import javax.persistence.*;

/**
 * Created by t420 on 2017/5/17.
 */
@Entity
@Table(name = "userboot")
public class User {
    @Id
    @GeneratedValue
    private String id;
    @Column(name="user_name",nullable = false)
    private String userName;
    @Column(name="user_password",nullable = false)
    private String userPassword;

    public String getUserName() {
        return userName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }
}
