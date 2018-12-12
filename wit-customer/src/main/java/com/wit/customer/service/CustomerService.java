package com.wit.customer.service;

import com.wit.customer.mapper.CustomerMapper;
import com.wit.customer.mapper.MyBatisUtil;
import com.wit.customer.model.Customer;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    private SqlSession sqlSession;
    private CustomerMapper customerMapper;

    private static final int SUCCESSFUL = 1;

    public CustomerService() {
        this(MyBatisUtil.openSqlSession());
    }

    private CustomerService(SqlSession sqlSession) {
        this.sqlSession = sqlSession;
        this.customerMapper = sqlSession.getMapper(CustomerMapper.class);
    }

    public Customer get(long id) {
        return customerMapper.getById(id);
    }

    public Customer getByEmail(String email) {
        sqlSession.clearCache();
        return customerMapper.getByEmail(email);
    }

    public Customer create(Customer customer) {
        customerMapper.insert(customer);
        sqlSession.commit();
        return customer;
    }

    public boolean update(Customer customer) {
        int result = customerMapper.update(customer);
        sqlSession.commit();
        return result == SUCCESSFUL;
    }

    public boolean delete(long id) {
        int result = customerMapper.delete(id);
        sqlSession.commit();
        return result == SUCCESSFUL;
    }
}
