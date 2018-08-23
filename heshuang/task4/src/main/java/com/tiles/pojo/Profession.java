package com.tiles.pojo;

public class Profession {
    long id;
    String pro_name;
    //头像
    String icon;
    //职业方向
    String career_direction;
    //职业介绍
    String pro_introduction;
    //门槛难度
    byte pro_threshold;
    //职业难度
    byte pro_difficulty;
    //成长周期
    String growth_cycle;
    //公司
    String pro_company;
    //最低工资
    String pro_salary_min;
    //正常工资
    String pro_salary_normal;
    //最高工资
    String pro_salary_max;
    //在学人数
    long study_number;
    //提示
    String hint;
    long create_at;
    long update_at;

    @Override
    public String toString() {
        return "Profession{" +
                "id=" + id +
                ", pro_name='" + pro_name + '\'' +
                ", icon='" + icon + '\'' +
                ", career_direction='" + career_direction + '\'' +
                ", pro_introduction='" + pro_introduction + '\'' +
                ", pro_threshold=" + pro_threshold +
                ", pro_difficulty=" + pro_difficulty +
                ", growth_cycle='" + growth_cycle + '\'' +
                ", pro_company='" + pro_company + '\'' +
                ", pro_salary_min='" + pro_salary_min + '\'' +
                ", pro_salary_normal='" + pro_salary_normal + '\'' +
                ", pro_salary_max='" + pro_salary_max + '\'' +
                ", study_number=" + study_number +
                ", hint='" + hint + '\'' +
                ", create_at=" + create_at +
                ", update_at=" + update_at +
                '}';
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPro_name() {
        return pro_name;
    }

    public void setPro_Name(String pro_name) {
        this.pro_name = pro_name;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getCareer_direction() {
        return career_direction;
    }

    public void setCareer_direction(String career_direction) {
        this.career_direction = career_direction;
    }

    public String getPro_introduction() {
        return pro_introduction;
    }

    public void setPro_introduction(String pro_introduction) {
        this.pro_introduction = pro_introduction;
    }

    public byte getPro_threshold() {
        return pro_threshold;
    }

    public void setPro_threshold(byte pro_threshold) {
        this.pro_threshold = pro_threshold;
    }

    public byte getPro_difficulty() {
        return pro_difficulty;
    }

    public void setPro_difficulty(byte pro_difficulty) {
        this.pro_difficulty = pro_difficulty;
    }

    public String getGrowth_cycle() {
        return growth_cycle;
    }

    public void setGrowth_cycle(String growth_cycle) {
        this.growth_cycle = growth_cycle;
    }

    public String getPro_company() {
        return pro_company;
    }

    public void setPro_company(String pro_company) {
        this.pro_company = pro_company;
    }

    public String getPro_salary_min() {
        return pro_salary_min;
    }

    public void setPro_salary_min(String pro_salary_min) {
        this.pro_salary_min = pro_salary_min;
    }

    public String getPro_salary_normal() {
        return pro_salary_normal;
    }

    public void setPro_salary_normal(String pro_salary_normal) {
        this.pro_salary_normal = pro_salary_normal;
    }

    public String getPro_salary_max() {
        return pro_salary_max;
    }

    public void setPro_salary_max(String pro_salary_max) {
        this.pro_salary_max = pro_salary_max;
    }

    public long getStudy_number() {
        return study_number;
    }

    public void setStudy_number(long study_number) {
        this.study_number = study_number;
    }

    public String getHint() {
        return hint;
    }

    public void setHint(String hint) {
        this.hint = hint;
    }

    public long getCreate_at() {
        return create_at;
    }

    public void setCreate_at(long create_at) {
        this.create_at = create_at;
    }

    public long getUpdate_at() {
        return update_at;
    }

    public void setUpdate_at(long update_at) {
        this.update_at = update_at;
    }
}
