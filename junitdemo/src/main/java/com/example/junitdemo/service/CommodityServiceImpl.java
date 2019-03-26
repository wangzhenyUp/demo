package com.example.junitdemo.service;

import com.example.junitdemo.entity.Commodity;
import org.springframework.stereotype.Service;
import java.util.List;

public class CommodityServiceImpl{

    public List<Commodity> getALLCommodityInfo(List<Commodity> commodityList){
        if(commodityList!=null){
            return commodityList;
        }else{
            Commodity commodity = new Commodity(0,"error:List=null","",0);
            commodityList.add(commodity);
            return commodityList;
        }
    }

    public Commodity getCommodityInfoById(int id,List<Commodity> commodityList){
        if(commodityList != null){
            for (Commodity commodity: commodityList) {
                if (commodity.getId()==id){
                    return commodity;
                }else{
                    Commodity commodity1 = new Commodity(0,"error:Noid","",0);
                    return commodity1;
                }
            }
        }
            return new Commodity(0,"error:List=null","",0);
    }

}
