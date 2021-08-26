package dao;

import org.springframework.jdbc.core.JdbcTemplate;

import java.util.Map;

public class MangerDaoImpl implements MangerDao{
    JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDataSource());
    @Override
    public boolean login(Manger manger) {
        try{
            String sql = "SELECT * FROM mangerexer WHERE MName=? AND MPassword=?";
            Map<String, Object> map = template.queryForMap(sql,manger.getMName(),manger.getMPassword());
            return true;
        }catch (Exception  e){
            return false;
        }

    }
}
