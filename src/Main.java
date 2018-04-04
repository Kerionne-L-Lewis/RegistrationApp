

public class Main {

    public static void main(String[] args) {
        System.out.println("\n\nHello, RegistrationApp!\n");

        Curriculum curriculum = new Curriculum( "curriculum.dat" );
        System.out.println( "Curriculum:" + curriculum );

        int totalHours=curriculum.totalHrsCurriculum();
        System.out.println("\n||Total hours in Curriculum " + totalHours + "||");

       int counter = curriculum.countNumDept("CPSC");
        System.out.println("How many CPSC courses are in the Curriculum? " + counter);

        boolean isCourseInCurriculum=curriculum.checkForCourse("MATH 1070");
        System.out.println("Is MATH 1070 in the Curriculum?" + isCourseInCurriculum);

        Transcript transcript = new Transcript("Transcript.txt");
        System.out.println("\nMary's Transcript " + transcript);

    }


}


