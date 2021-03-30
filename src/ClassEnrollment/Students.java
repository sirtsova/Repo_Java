package ClassEnrollment;

import java.util.Arrays;

public class Students {

    /**
     * Variable which will store values like:
     * school name
     * student name
     * student id
     * student enrolled course name
     * courses offered by school
     * total number of students
     * student fee-balance
     * student address
     */
    static String schoolName = "ABC School";
    static String[] offeredCourses = {"QA", "Web", "PM","Database"};
    static double[] feesCourses = {1000, 2000, 3000};
    static int totalStudents = 0;

    String studentName = "N/A";
    String studentEnrolledCourse;
    int studentId;
    String studentAddress;
    double studentFeeBalance;

    public void enrollStudent(String name, String addr, String course) {
        /*
            if course is available in school, we should inform student the fees-balance
            increase the total number of students
            we should student the studentId
         */
        boolean isCourseAvailable = false;
        for (int i=0 ; i<offeredCourses.length ; i++) {
            if (offeredCourses[i].equalsIgnoreCase(course)) {
                totalStudents++;
                studentId = totalStudents;
                isCourseAvailable = true;
                studentName = name;
                studentEnrolledCourse = offeredCourses[i];
                studentFeeBalance = feesCourses[i];
                studentAddress = addr;
                break;
            }
        }
        if (isCourseAvailable) {
            System.out.println("Enrollment done successfully. Student id -> " + studentId);
        } else {
            System.out.println("Requested course " + course + " is not available in the school");
        }

    }

    /**
     * Method to display student profile
     * Id
     * Name
     * Course
     *
     *
     * name: displayStudentProfile
     * Input: N/A
     * Return Type: String/void
     *
     */
    public void  displayStudentProfile() {
        System.out.println("Student profile " +
                "\nStudent id: " + studentId +
                "\nStudent name: " + studentName +
                "\nStudent course: " + studentEnrolledCourse + "\n\n");
            }


    /**
     * Method to fee deposit
     *
     * name: feeDeposit
     * Input: double
     * return: double
     */
    public void depositFee (double paymentAmount) {
        if (paymentAmount <=studentFeeBalance && paymentAmount>0) {
            studentFeeBalance = studentFeeBalance - paymentAmount;
            System.out.println("Thank you for your payment: " +paymentAmount + ". Your current balance is: " +studentFeeBalance);
        } else {
            System.out.println("You have entered invalid data :" +paymentAmount);
        }

    }


    /**
     * Student to change course
     * Req:
     * 1. earlier deposited fees should be subtracted from new course fees
     * 2. Show error (saying, Same course entered) if student enter enrolled course as new course
     * 3. Show error (saying, Invalid course entered) if student enter a course not offered by school
     */

    public double getFeesForCourse (String studentEnrolledCourse) {
        double feesForCourse =0;
         for (int i=0; i<offeredCourses.length; i++) {
              if (offeredCourses[i].equalsIgnoreCase(studentEnrolledCourse)) {
                 feesForCourse = feesCourses[i];
              }
          }
          return feesForCourse;
        }


        public void toChangeCourse (String newCourseName) {
        newCourseName=newCourseName.trim();
        int count = 0;
        for (int i=0; i<offeredCourses.length; i++) {
                if(newCourseName.equalsIgnoreCase(studentEnrolledCourse)) {
                    System.out.println("Same course entered");
                    break;
                } if (offeredCourses[i].equalsIgnoreCase(newCourseName) && !(newCourseName.equalsIgnoreCase(studentEnrolledCourse))) {
                    double previouseFee = getFeesForCourse(studentEnrolledCourse);
                    studentFeeBalance = feesCourses[i] - previouseFee;
                    System.out.println("Your course has been changed to "+newCourseName + ". Your current balance is " +studentFeeBalance);
                    break;
                } if (!(offeredCourses[i].equalsIgnoreCase(newCourseName))) {
                     count++;
                       if (count==offeredCourses.length) {
                           System.out.println("Invalid course entered");
                           break;
                       }
                         }
            }
            }












    /**
     * static Method to display school summary:
     * School Name
     * Courses Offered
     * Total number of student
     */
public static void displaySchoolSummary () {
    System.out.println("School Name: " + schoolName + "\n" +
            "Offered courses: " +Arrays.toString(offeredCourses) + "\n" +
            "Total number of students: "+totalStudents);
}

}
