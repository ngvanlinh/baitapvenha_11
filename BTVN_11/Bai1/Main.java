package Bai1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student st = new Student();
        st.aadStudent("Nguyen Van A",80);
        st.aadStudent("Nguyen Van B",75);
        st.aadStudent("Nguyen Van C",40);
        st.aadStudent("Nguyen Van D",90);
        st.aadStudent("Nguyen Van E",66);
        st.aadStudent("Nguyen Van F",85);
        st.aadStudent("Nguyen Van G",55);
        System.out.println("1:  Lấy danh sách sinh viên thuộc một loại cụ thể.");
        System.out.println("2: Hiển thị tất cả sinh viên phân theo loại. ");
        System.out.println("nhập chức năng muốn thực hiện: ");
        int n = sc.nextInt();
        if(n==1){
            System.out.println("Nhâp loại sv muốn hiển thị: ");
            String grade = sc.nextLine();
            st.getStudentsByGrade(grade);
        }else if(n==2){
            st.displayAllGrades();
        }


    }


}
