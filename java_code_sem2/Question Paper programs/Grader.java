public class Grader {
    static String getGrade(int mark) {
        String grade = "";
        if (mark >= 91){
            grade = "AA";
        } else if (mark >= 81) {
            grade = "AB";
        } else if (mark >= 71) {
            grade = "BB";
        } else if (mark >= 61) {
            grade = "BC";
        } else if (mark >= 51) {
            grade = "CD";
        } else if (mark >= 41) {
            grade = "DD";
        } else {
            grade = "FF";
        }

        return grade;
    }

    public static void main(String[] args) {
        int[] subs = {56, 77, 33};
        for (int i = 0; i < subs.length ; i++) {
            System.out.println("Grade for subject "+ (i+1) +" of marks " +
                    subs[i] + " - " + getGrade(subs[i]));
        }
    }
}
