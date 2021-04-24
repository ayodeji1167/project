public class GradingTest {

    public static void main(String... args) {
        Grading student1 = new Grading("paul", 66);
        Grading student2 = new Grading("brown", 100);


        System.out.printf("grade is %s%n: ", student1.getName(), student1.getAverage());
        System.out.printf("grade is %s%n: ", student2.getName(), student2.getAverage());



    }
}
