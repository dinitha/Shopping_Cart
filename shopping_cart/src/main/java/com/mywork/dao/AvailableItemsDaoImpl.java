package com.mywork.dao;

import com.mywork.model.AvailableItems;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;


import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;



/**
 * Created by D on 3/25/2017.
 */
public class AvailableItemsDaoImpl implements AvailableItemsDao {
    private JdbcTemplate jdbcTemplate;
   //TODO : new key word remove??
    public AvailableItemsDaoImpl(DataSource dataSource) {
            jdbcTemplate=new JdbcTemplate(dataSource);
    }

    @Override
    public void saveOrUpdateItem(AvailableItems availableItems) {
        //TODO
    /* if(availableItems.getId()>0){
         String sql = "UPDATE contact SET name=?, email=?, address=?, "
                 + "telephone=? WHERE contact_id=?";
         jdbcTemplate.update(sql, contact.getName(), contact.getEmail(),
                 contact.getAddress(), contact.getTelephone(), contact.getId());
     } else {
         // insert
         String sql = "INSERT INTO contact (name, email, address, telephone)"
                 + " VALUES (?, ?, ?, ?)";
         jdbcTemplate.update(sql, contact.getName(), contact.getEmail(),
                 contact.getAddress(), contact.getTelephone());
     }*/

    }

    @Override
    public void deleteItem(int itemId) {
    //TODO:

    }

    @Override
    public AvailableItems getItem(int itemId) {
        //TODO
        return null;
    }

    @Override
    public List<AvailableItems> viewItems() {
        String sql="select * from available_items";
        List<AvailableItems> listItems = jdbcTemplate.query(sql, new RowMapper<AvailableItems>() {


            public AvailableItems mapRow(ResultSet rs, int rowNum) throws SQLException {
                AvailableItems availableItems = new AvailableItems();

                availableItems.setId(rs.getInt("item_id"));
                availableItems.setItemName(rs.getString("item_name"));
                availableItems.setItemDescription(rs.getString("item_description"));
                availableItems.setItemImage(rs.getBlob("item_image"));
                availableItems.setAvailableQuantity(rs.getInt("item_available_quantity"));
                availableItems.setItemPrice(rs.getInt("item_price"));

                return availableItems;
            }

        });

        return listItems;
    }


}
