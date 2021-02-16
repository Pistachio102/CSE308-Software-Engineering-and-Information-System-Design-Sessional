public interface MediatorPatternDemo {
    public static void main(String[] args)
    {
        Examiner examiner = new Examiner();
        Student nisa = new Student("Nisa",1);
        Student adiba = new Student("Adiba",2);
        Student nazifa = new Student("Nazifa",3);
        Student mafruha = new Student("Mafruha",4);
        Student rhitu = new Student("Rhitu",5);

        ExamController.sendExamPapers(examiner);
        examiner.sendExaminedpapers();
        ExamController.publishResult();

        nisa.reexamine(1);
       // System.out.println(nisa.marks);
        System.out.println();
        adiba.reexamine(2);
        //System.out.println(adiba.marks);
        System.out.println();
        nazifa.reexamine(3);
        //System.out.println(nazifa.marks);
        System.out.println();
        mafruha.reexamine(4);
        //System.out.println(mafruha.marks);
        System.out.println();
        rhitu.reexamine(5);
        //System.out.println(rhitu.marks);

        ExamController.publishResult();

    }
}
