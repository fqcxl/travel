package com.fz.travel.dao;

import com.fz.travel.bean.PageContainer;
import com.fz.travel.bean.TouristNote;

import javax.security.auth.callback.TextOutputCallback;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * @author Shixiaodong
 * @date 2018/6/29 8:42
 */
public interface TouristNoteDao extends PageDao<TouristNote> {

    void insertTouristNote(TouristNote touristNote);

    void deleteTouristNote(TouristNote touristNote);

    void updateTouristNote(TouristNote touristNote);

    TouristNote selectTouristNoteById(Serializable touristNoteId);

    PageContainer<TouristNote> selectTouristNoteList();

    PageContainer<TouristNote> selectTouristNoteListByHeadLine(String headLine);

    PageContainer<TouristNote> selectTouristNoteListByDate(Date date);

    PageContainer<TouristNote> selectTouristNoteListByVisitorId(Integer visitorId);

    PageContainer<TouristNote> selectTouristNoteListByVisitorIdAndDate(Integer visitorId, Date date);

}
