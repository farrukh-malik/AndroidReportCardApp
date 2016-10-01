package com.example.farrukhmalik.report_card;

/**
 * Created by Farrukh Malik on 10/1/2016.
 */
public class StudentsRecord {

    String name, rank, attendence, grade;
    int pic;

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getAttendence() {
        return attendence;
    }

    public void setAttendence(String attendence) {
        this.attendence = attendence;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPic() {
        return pic;
    }

    public void setPic(int pic) {
        this.pic = pic;
    }

    public StudentsRecord(String name, String rank, String attendence, String grade, int pic) {
        this.name = name;
        this.rank = rank;
        this.attendence = attendence;
        this.grade = grade;
        this.pic = pic;
    }
}
