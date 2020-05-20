package com.company;

public class Main {

    public static void main(String[] args) {

        Subject sbjcts0[] = new Subject[8];
        Subject sbjcts1[] = new Subject[8];
        Subject sbjcts2[] = new Subject[8];
        Subject sbjcts3[] = new Subject[8];
        Subject sbjcts4[] = new Subject[8];
        Subject sbjcts5[] = new Subject[8];
        Subject sbjcts6[] = new Subject[8];
        Subject sbjcts7[] = new Subject[8];
        Subject sbjcts8[] = new Subject[8];
        Subject sbjcts9[] = new Subject[8];

        for (int i = 0; i < 8; i++) {
            sbjcts0[i] = new Subject(i);
            sbjcts1[i] = new Subject(i);
            sbjcts2[i] = new Subject(i);
            sbjcts3[i] = new Subject(i);
            sbjcts4[i] = new Subject(i);
            sbjcts5[i] = new Subject(i);
            sbjcts6[i] = new Subject(i);
            sbjcts7[i] = new Subject(i);
            sbjcts8[i] = new Subject(i);
            sbjcts9[i] = new Subject(i);
        }
        Student students[] = new Student[10];
        students[0] = new Student(1, "Garry", "Potter", "Grif-91", sbjcts0);
        students[1] = new Student(2, "Ronald", "Weasley", "Grif-91", sbjcts1);
        students[2] = new Student(3, "Hermione", "Granger", "Grif-91", sbjcts2);
        students[3] = new Student(4, "Neville", "Longbottom", "Grif-91", sbjcts3);
        students[4] = new Student(5, "Percy", "Weasley", "Grif-91", sbjcts4);
        students[5] = new Student(6, "Jeanie", "Weasley", "Grif-91", sbjcts5);
        students[6] = new Student(7, "George", "Weasley", "Grif-91", sbjcts6);
        students[7] = new Student(8, "Fred", "Weasley", "Grif-91", sbjcts7);
        students[8] = new Student(9, "Oliver", "Wood", "Grif-91", sbjcts8);
        students[9] = new Student(10, "Katie", "Bell", "Grif-91", sbjcts9);

        P.rintln(Utils.getTheBestStudent(students));
        P.rintln(Utils.getTheBestSubject(students));

        for(int i=0;i < students.length;i++){
            P.rintln("Student " + students[i].surname + " avgMark: " + students[i].avgMark());
            if(students[i].avgMark() == 5f)
                P.rintln("10 points to Gryffindor");
            else if(students[i].avgMark() >= 4f)
                P.rintln("5 points to Gryffindor");
            else if(students[i].avgMark() <= 4f && (students[i].getSurname()=="Bell" || students[i].getSurname()=="Granger" || students[i].getName()=="Jeanie") )
                P.rintln("Very bad Miss " + students[i].getSurname());
            else
                P.rintln("Very bad Mister " + students[i].getSurname());

        }

        for(int i = 0 ; i< students.length;i++){
            P.rintln(students[i].getName() + ' ' + students[i].getSurname() + ':');
            students[i].passedSub();
        }
    }
}

