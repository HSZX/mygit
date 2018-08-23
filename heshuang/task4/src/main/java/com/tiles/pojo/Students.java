package com.tiles.pojo;

public class Students {
    int id;
    String name;
    String stu_introduction;
    String is_study;
    String is_work;
    long create_at;
    long update_at;

    @Override
    public String toString() {
        return "Students{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", stu_introduction='" + stu_introduction + '\'' +
                ", is_study='" + is_study + '\'' +
                ", is_work='" + is_work + '\'' +
                ", create_at=" + create_at +
                ", update_at=" + update_at +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStu_introduction() {
        return stu_introduction;
    }

    public void setStu_introduction(String stu_introduction) {
        this.stu_introduction = stu_introduction;
    }

    public String getIs_study() {
        return is_study;
    }

    public void setIs_study(String is_study) {
        this.is_study = is_study;
    }

    public String getIs_work() {
        return is_work;
    }

    public void setIs_work(String is_work) {
        this.is_work = is_work;
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
