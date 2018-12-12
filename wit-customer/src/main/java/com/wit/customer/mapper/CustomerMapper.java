package com.wit.customer.mapper;

import com.wit.customer.model.Customer;
import org.apache.ibatis.annotations.*;

public interface CustomerMapper {

    @Insert("INSERT INTO customer (name, email_address, password, mobile_number) " +
                    "VALUES (#{name}, #{emailAddress}, #{password}, #{mobileNumber})")
    Integer insert(Customer customer);

    @Select("SELECT * FROM customer WHERE id=#{id}")
    @Results(value = {
            @Result(property = "emailAddress", column = "email_address"),
            @Result(property = "mobileNumber", column = "mobile_number")
    })
    Customer getById(long id);

    @Select("SELECT * FROM customer WHERE email_address=#{emailAddress}")
    Customer getByEmail(String emailAddress);

    @Update("UPDATE customer " +
            "SET name=#{name}, email_Address=#{emailAddress}, mobile_number=#{mobileNumber} " +
            "WHERE id=#{id}")
    Integer update(Customer customer);

    @Delete("DELETE FROM customer WHERE id = #{id}")
    Integer delete(long id);
}
