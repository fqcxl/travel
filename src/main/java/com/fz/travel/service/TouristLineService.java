package com.fz.travel.service;

import com.fz.travel.bean.PageContainer;
import com.fz.travel.bean.TouristLine;

import java.io.Serializable;

/**
 * @author Shixiaodong
 * @date 2018/7/1 23:03
 */
public interface TouristLineService {

    Integer saveTouristLine(TouristLine touristLine);

    void updateTouristLine(TouristLine touristLine);

    void deleteTouristLine(TouristLine touristLine);

    TouristLine queryTouristLineById(Serializable touristLineId);

    PageContainer<TouristLine> queryTouristLineList(PageContainer<TouristLine> pageContainer);
}
