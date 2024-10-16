/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;
import java.util.Scanner;


public class Gradinglogic 
{

    public static boolean isEligibleForITAndCS(String selectedItem5, String selectedItem2, 
                                               String selectedItem3, String selectedItem4,
                                               String[] optionsSubjects, String[] optionsGrades) {
        boolean foundSubject1 = false;
        boolean foundSubject2 = false;
        boolean foundGrade1 = false;
        boolean foundGrade2 = false;
        boolean foundSubject3  =false;
          boolean foundSubject4  =false;
        boolean foundGrade3 = false;
        boolean foundGrade4 = false;

        for (String subject : optionsSubjects) {
            if (selectedItem2.equals(subject)) {
                foundSubject1 = true;
            }
            if (selectedItem3.equals(subject)) {
                foundSubject2 = true;
            }
        }

        for (String grade : optionsGrades) {
            if (selectedItem4.equals(grade)) {
                foundGrade1 = true;
            }
            if (selectedItem5.equals(grade)) {
                foundGrade2 = true;
            }
        }

        return foundSubject1 && foundSubject2 && foundGrade1 && foundGrade2;
    }


    
   public static boolean spmChecker(String selectedItem6, String selectedItem7, String selectedItem8, String selectedItem9, String[] spmSubjects, String[] spmGrades)
{
    boolean foundSubject3 = false;
    boolean foundSubject4 = false;
    boolean foundGrade3 = false;
    boolean foundGrade4 = false;

    for(String spm : spmSubjects)
    {
        if (selectedItem6.equals(spm))
        {
            foundSubject3 = true;
        }

        if(selectedItem7.equals(spm))
        {
            foundSubject4 = true;
        }
    }

    for (String grade : spmGrades)
    {
        if(selectedItem8.equals(grade))
        {
            foundGrade3 = true;
        }

        if(selectedItem9.equals(grade))
        {
            foundGrade4 = true;
        }
    }

    boolean allConditionsMet = foundSubject3 && foundSubject4 && foundGrade3 && foundGrade4;
    return allConditionsMet;
}
}



