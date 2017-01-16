package com.xiao.loghttpinfo.bean;

import java.util.List;

/**
 * Created by XiaoJianjun on 2017/1/16.
 */

public class Kuaidi {

    /**
     * message : ok
     * nu : 3912540893693
     * ischeck : 1
     * condition : F00
     * com : yunda
     * status : 200
     * state : 3
     * data : [{"time":"2017-01-15 12:45:45","ftime":"2017-01-15 12:45:45","context":"[四川成都青羊区西门三公司]快件已被 已签收 签收","location":"四川成都青羊区西门三公司"},{"time":"2017-01-15 09:23:22","ftime":"2017-01-15 09:23:22","context":"[四川成都青羊区西门三公司]进行派件扫描；派送业务员：王占义；联系电话：13678009778","location":"四川成都青羊区西门三公司"},{"time":"2017-01-15 08:27:51","ftime":"2017-01-15 08:27:51","context":"[四川成都青羊区西门三公司]到达目的地网点，快件将很快进行派送","location":"四川成都青羊区西门三公司"},{"time":"2017-01-14 15:12:02","ftime":"2017-01-14 15:12:02","context":"[四川成都分拨中心]从站点发出，本次转运目的地：四川成都青羊区西门三公司","location":"四川成都分拨中心"},{"time":"2017-01-14 14:50:25","ftime":"2017-01-14 14:50:25","context":"[四川成都分拨中心]在分拨中心进行卸车扫描","location":"四川成都分拨中心"},{"time":"2017-01-12 02:27:11","ftime":"2017-01-12 02:27:11","context":"[浙江金华永康武义直跑中心]进行装车扫描，即将发往：四川成都分拨中心","location":"浙江金华永康武义直跑中心"},{"time":"2017-01-11 19:12:45","ftime":"2017-01-11 19:12:45","context":"[浙江云和县公司]进行下级地点扫描，将发往：四川成都网点包","location":"浙江云和县公司"},{"time":"2017-01-11 18:28:28","ftime":"2017-01-11 18:28:28","context":"[浙江云和县公司]进行揽件扫描","location":"浙江云和县公司"}]
     */

    private String message;
    private String nu;
    private String ischeck;
    private String condition;
    private String com;
    private String status;
    private String state;
    private List<Data> data;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getNu() {
        return nu;
    }

    public void setNu(String nu) {
        this.nu = nu;
    }

    public String getIscheck() {
        return ischeck;
    }

    public void setIscheck(String ischeck) {
        this.ischeck = ischeck;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public String getCom() {
        return com;
    }

    public void setCom(String com) {
        this.com = com;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public List<Data> getData() {
        return data;
    }

    public void setData(List<Data> data) {
        this.data = data;
    }

    public static class Data {
        /**
         * time : 2017-01-15 12:45:45
         * ftime : 2017-01-15 12:45:45
         * context : [四川成都青羊区西门三公司]快件已被 已签收 签收
         * location : 四川成都青羊区西门三公司
         */

        private String time;
        private String ftime;
        private String context;
        private String location;

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }

        public String getFtime() {
            return ftime;
        }

        public void setFtime(String ftime) {
            this.ftime = ftime;
        }

        public String getContext() {
            return context;
        }

        public void setContext(String context) {
            this.context = context;
        }

        public String getLocation() {
            return location;
        }

        public void setLocation(String location) {
            this.location = location;
        }
    }
}
