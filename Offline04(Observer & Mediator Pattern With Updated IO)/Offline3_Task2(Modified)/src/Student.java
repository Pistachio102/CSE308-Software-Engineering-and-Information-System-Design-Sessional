public class Student {
    public String studentName;
    public int studentID;
    public int marks;

    public Student(String studentName, int studentID)
    {
        this.studentName = studentName;
        this.studentID = studentID;
        ExamController.addExaminees(this);

    }

    public void reexamine(int id)
    {
        System.out.println("Re-examine request sent.");
        System.out.println();
        System.out.println();
        ExamController.reexamineRequest(id);
    }
}
