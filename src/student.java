import java.util.Arrays;

public class student {
    
    private String studentID;
    private String studentName;
    private String[] extraActivities;

    public student (String studentID, String studentName, int numExtraActivities) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.extraActivities = new String[numExtraActivities];
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String[] getExtraActivities() {
        return extraActivities;
    }

    public void setExtraActivities(String[] extraActivities) {
        this.extraActivities = extraActivities;
    }

    public void addExtraActivity(int index, String activity) {
        if (index >=0 && index < extraActivities.length){
            extraActivities[index]= activity;
        } else {
            System.out.println("Invalid index");
        }
    }

    public String toString() {
        return "student ID: " + studentID + "\nStudent Name: " + studentName + "\nExtra Activities: " + Arrays.toString(extraActivities);
    }
}