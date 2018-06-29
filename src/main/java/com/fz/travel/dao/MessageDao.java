package com.fz.travel.dao;

import com.fz.travel.bean.Message;
import com.fz.travel.bean.PageContainer;

import javax.persistence.criteria.CriteriaBuilder;
import java.io.Serializable;
import java.util.Date;

public interface MessageDao {
    public void reply(Message message,String reply);

    public void insert(Message message);

    public void delete(Message message);

    public PageContainer<Message> selectAllMessage();

    public PageContainer<Message> selectByTime(Date time);
}