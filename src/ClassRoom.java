import java.util.Arrays;
import java.util.Scanner;

/*
You are building an application for a teacher (user) to create a roster for a new college class.
The teacher should be prompted to:

1. Input the number of students that are in his/her class (use Scanner class)
2. After number of students are specified, the teacher should be prompted to
    enter each students name, ID number, major and educational department.
3. Each student should be saved into an array of students
4. Once the teacher is finished inputting the students' information, print the roster with all the students entered.
  Be sure to include methods in your application.
 */
public class ClassRoom {
     static String sName, sId, sMaj,sDpt;
     static int sz=0;
     static String student[][];
     static String sortedStudent[][];

     // get user input about studenr
     public static void getStudentInfo () {
          Scanner kybrd = new Scanner(System.in);
          System.out.println("Enter Student Name: ");
          sName = kybrd.nextLine();
          System.out.println("Enter Student Number: ");
          sId = kybrd.nextLine();
          System.out.println("Enter Student Major: ");
          sMaj = kybrd.nextLine();
          System.out.println("Enter Student Department: ");
          sDpt = kybrd.nextLine();
     }

     public static void printStudent () {
          System.out.printf("%15s %15s %15s %15s\n","Student Name","ID", "Major","Department");
          for (int k = 0; k < sz; k++) {
               String tdInfo[] = student[k][1].split(",");  // get id, major, department stored in 2nd col
               System.out.printf("%15s %15s %15s %15s \n", student[k][0],  tdInfo[0], tdInfo[1], tdInfo[2]);
          }
     }

     public static void main (String[] args) {
          Scanner kybrd = new Scanner (System.in);
          System.out.println ("Enter the number of students in your class: ");
          sz = kybrd.nextInt();

          student = new String [sz][3];   // 1st block for name, 2nd block for major, dept, studentId

          for (int k=0; k < sz; k++) {
               getStudentInfo();   // read student info

               student[k][0] = sName;
               student[k][1] =  sMaj + "," + sDpt + "," + sId;
          }

          printStudent();   // print unsorted Student's info
     }
}
