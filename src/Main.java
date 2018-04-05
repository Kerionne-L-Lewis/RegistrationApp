

public class Main {

    public static void main(String[] args) {
        System.out.println("\n\nHello, RegistrationApp!\n");

        Curriculum curriculum = new Curriculum( "curriculum.dat" );
        System.out.println( "Curriculum:" + curriculum );

        int totalHours=curriculum.totalHrsCurriculum();
        System.out.println("\n||Total hours in Curriculum " + totalHours + "||");

       int counter = curriculum.countNumDept("CPSC");
        System.out.println("How many CPSC courses are in the Curriculum? " + counter);

        boolean isCourseInCurriculum=curriculum.checkForCourse("MATH", "1030", 4);
        System.out.println("Is MATH 1030 4 in the Curriculum?" + isCourseInCurriculum);

        Transcript transcript = new Transcript("Transcript.txt");
        System.out.println("\nMary's Transcript " + transcript);

        int transcriptTotalHrs= transcript.totalHrsTranscript();
        System.out.println("\n||Total hours in Transcript " + transcriptTotalHrs+ "||");

        boolean isTranscriptCourseInCurriculum=curriculum.checkForCourse("CHEM", "2000", 3);
        System.out.println("Is CHEM 2000 3 in the Curriculum? " + isTranscriptCourseInCurriculum);

        boolean isCourseInTranscript = transcript.checkForCourse("Art", "1010", 3);
        System.out.println("Is ART 1010 3 in the Transcript" + isCourseInTranscript);


        boolean didYouAllCompleteCourse = transcript.checkTranscript(curriculum.curriculum);
        System.out.println("Can you graduate ? " + didYouAllCompleteCourse);

       Registrar registrar = new Registrar("registrar.txt");


    }


}


