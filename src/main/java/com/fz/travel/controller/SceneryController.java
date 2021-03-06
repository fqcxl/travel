package com.fz.travel.controller;

import com.fz.travel.bean.PageContainer;
import com.fz.travel.bean.Scenery;
import com.fz.travel.service.SceneryService;

import com.opensymphony.xwork2.Action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @author: jiangjaimin
 * @date :  2018/6/30.
 */
@Controller
public class SceneryController extends BaseController {

    private String jsonResult = "";

    private Scenery scenery;

    private PageContainer<Scenery> pageContainer;

    @Autowired
    private SceneryService sceneryService;

    //添加景点信息
    public String createScenery(){
        sceneryService.addScenery(scenery);
        return Action.SUCCESS;
    }

    //删除酒店信息
    public String deleteSceneryBySceneryId(){
        sceneryService.deleteSceneryBySceneryId(scenery.getSceneryId());
        return Action.SUCCESS;
    }

    //修改酒店信息
    public String updateSceney(){
        sceneryService.updateScenery(scenery);
        return Action.SUCCESS;
    }

    //根据景点编号查询景点信息
    public String querySceneryBySceneryId(){
        scenery = sceneryService.querySceneryBySceneryId(scenery.getSceneryId());
        return Action.SUCCESS;
    }

    //根据景点名称查询景点
    public String querySceneryBySceneryName() {
        pageContainer = sceneryService.querySceneryBySceneryName(pageContainer, scenery.getSceneryName());
        jsonResult = pageContainer.toJson("lineScenerySet");
        return Action.SUCCESS;
    }

    //查询所有景点信息
    public String queryAllScenery(){
        pageContainer = sceneryService.queryAllScenery(pageContainer);
        jsonResult = pageContainer.toJson("lineScenerySet");
        return Action.SUCCESS;
    }

    public String getJsonResult() {
        return jsonResult;
    }

    public void setJsonResult(String jsonResult) {
        this.jsonResult = jsonResult;
    }

    public Scenery getScenery() {
        return scenery;
    }

    public void setScenery(Scenery scenery) {
        this.scenery = scenery;
    }

    public PageContainer<Scenery> getPageContainer() {
        return pageContainer;
    }

    public void setPageContainer(PageContainer<Scenery> pageContainer) {
        this.pageContainer = pageContainer;
    }
}
