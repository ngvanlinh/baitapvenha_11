package Bai1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Student {
    private Map<String, List<String>> diemStudentMap = new HashMap<String, List<String>>();
    public String xepLoaiDiem(int score){
        if(score >85 && score <=100){
            return "A";
        }
        else if(score >75 && score <=85){
            return "B";
        }
        else if(score >65 && score <=75){
            return "C";
        }
        else if(score >50 && score <=65){
            return "D";
        }
        else if(score >0 && score <=50){
            return "E";
        }
        return "";
    }
    public void aadStudent(String name , int score){
        String grade = xepLoaiDiem(score);
        diemStudentMap.computeIfAbsent(grade, k -> new ArrayList<>()).add(name);

    }
    public void getStudentsByGrade(String grade){
        System.out.println(diemStudentMap.get(grade));
    }


    public void displayAllGrades(){
        for (Map.Entry<String, List<String>> entry : diemStudentMap.entrySet()) {
            System.out.println("Loại "+entry.getKey() + " : " + entry.getValue());
        }
    }
}
