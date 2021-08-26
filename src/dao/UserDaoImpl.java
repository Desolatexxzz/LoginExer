package dao;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;


import java.util.List;


public class UserDaoImpl implements UserDao{
    public UserDaoImpl(){};
    JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDataSource());
    @Override
    public List findAll() {
        String sql = "SELECT * FROM userexer";
        List<User> users = template.query(sql,new BeanPropertyRowMapper<User>(User.class));
        return users;
    }

    @Override
    public void addUser(User user) {
        String sql = "INSERT INTO userexer VALUES (NULL,?,?,?,?,?,?)";
        template.update(sql,user.getUname(),user.getUgender(),user.getUage(),user.getUaddress(),user.getUqq(),user.getUemail());
    }

    @Override
    public void deleteUser(int uid) {
            String sql = "DELETE FROM userexer WHERE uid=?";
            template.update(sql,uid);

    }

    @Override
    public void updateUser(int uid, User user) {
        String sql = "UPDATE userexer SET ugender=?,uage=?,uaddress=?,uqq=?,uemail=? WHERE uid=?";
        template.update(sql,user.getUgender(),user.getUage(),user.getUaddress(),user.getUqq(),user.getUemail(),uid);
    }
}
