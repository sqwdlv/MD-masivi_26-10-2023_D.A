class Main {
    public static void main(String[] args) {

        int[] courseGrades = {3, 9, 5, 4, 3, 1}; // definets int arrays ar mainiga nosaukumu - atzimes.


        for (int courseGrade: courseGrades) {
            System.out.println(courseGrade);
        }// beidzas for each loops

        System.out.println("<---------------------FOR un FOR EACH ATDALISANA--------------------------->"); //atdala for un for each loopu izdotot vertibas konsole (prieks sevis, lai nesaiet viss kopa).

        for (int i=0; i<courseGrades.length; i++)
        {
            System.out.println(courseGrades[i]);
        }   //beidzas for loops



        System.out.println("<-----------------------NAKAMAIS STRING MASIVS----------------------->"); //atdala divus masivus (prieks sevis, lai nesaiet viss kopa)

        String[] courseNames = {"Dagnis", "Madars", "Santa", "Daniels", "Arturs", "Janis" };

        for (String name: courseNames) {
            System.out.println(name);
        }// beidzas for each loops

        System.out.println("<------------------------FOR un FOR EACH ATDALISANA------------------------>"); //atdala for un for each loopu izdotot vertibas konsole (prieks sevis, lai nesaiet viss kopa).

        for (int i=0; i<courseNames.length; i++)
        {
            System.out.println(courseNames[i]);
        }   //beidzas for loops





    }
}