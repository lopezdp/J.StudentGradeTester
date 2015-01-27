/*
 * David P. Lopez
 * COP2800
 * Student Quiz Grading Application
 */

/**
 *
 * @author david.lopez016@mymdc.net
 */
package studenttester;

public class Student {
        
    private String name;
    private double totalQuizScore;
    private int quizCount;
    
    public Student(String n)
    {
        name = n;
        totalQuizScore = 0;
        quizCount = 0;
    }
    
    public String getName()
    {
        return name;
    }
    
    public void addQuiz(int score)
    {
        totalQuizScore += score;
        quizCount += 1;
    }
    
    public double getTotalScore()
    {
        return totalQuizScore;
    }
    
    public double getAverageScore()
    {
        return totalQuizScore/quizCount;
    } 
}
