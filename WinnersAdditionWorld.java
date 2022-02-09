import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class WinnersAdditionWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WinnersAdditionWorld extends World
{

    /**
     * Constructor for objects of class WinnersAdditionWorld.
     * 
     */
    int[] arrOrdered;
    
    int firstOperand[];
    int secondOperand[];
    int thirdOperand[];
    
    int firstOperandNew[] = new int[100];
    int secondOperandNew[] = new int[100];
    int thirdOperandNew[] = new int[100];
    int k = 0;
    
    int index;
    int score;
    int wrongAnswers;
    
    public WinnersAdditionWorld(int[] arrOrdered, int score, int wrongAnswers, int firstOperand[], int secondOperand[], int thirdOperand[], int index)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1100, 600, 1);
        this.arrOrdered = arrOrdered;
        this.score = score;
        this.wrongAnswers = wrongAnswers;
        this.index = index;
        
        this.firstOperand = firstOperand;
        this.secondOperand = secondOperand;
        this.thirdOperand = thirdOperand;
        
        prepare();
    }
    
    public void verifyIdenticalOperand() {
        for (int i = 1; i < index; i++) {
            if (firstOperand[i] == firstOperand[i - 1] && secondOperand[i] == secondOperand[i - 1] && thirdOperand[i] == thirdOperand[i - 1])
                ;
            else {
                firstOperandNew[k] = firstOperand[i - 1];
                secondOperandNew[k] = secondOperand[i - 1];
                thirdOperandNew[k] = thirdOperand[i - 1];
                k++;
            }
        }
        
    }
    
    public void prepare() {
        WinnersTrophies winnersTrophies = new WinnersTrophies();
        addObject(winnersTrophies, 350, getHeight() / 2 + 30);
        
        
        String imageNames[] = {"fish3.png", "seahorse.png" , "dolphin.png", "fish1.png"};
        String imageNames1[] = {"fish1.png", "dolphin.png","seahorse.png" ,  "fish3.png"};
        
        int xValues[] = {150, 350, 550, 150};
        int yValues[] = {200, 200, 200, 520};
        for (int i = 0; i < 4; i++) {
            CharacterWinnersAdditionWorld characterWinnersAdditionWorld = new CharacterWinnersAdditionWorld(i + 1, imageNames1[arrOrdered[i]]);
            addObject(characterWinnersAdditionWorld, xValues[i], yValues[i]);   
        }
        

      
        verifyIdenticalOperand();
        
        if (k > 8)
            k = 10;
            
        int prev = 250;
        
        for (int i = 0;  i < k; i++) {
            OtherText equationText = new OtherText( firstOperandNew[i] + " + " + secondOperandNew[i] + " = " + thirdOperandNew[i], 30, Color.BLACK, new Color(0, 0, 0, 0 ), Color.BLACK);
            addObject(equationText, 870, prev + 40 * i);  
        }
        
        OtherText otherText1 = new OtherText("1st:", 60, Color.WHITE, new Color(0,0,0, 0 ), Color.BLACK);
        OtherText otherText2 = new OtherText("2nd:", 60, Color.WHITE, new Color(0,0,0, 0 ), Color.BLACK);
        OtherText otherText3= new OtherText("3rd:", 60, Color.WHITE, new Color(0,0,0, 0 ), Color.BLACK);
        OtherText otherText4 = new OtherText("4th:", 60, Color.WHITE, new Color(0,0,0, 0 ), Color.BLACK);
        
        addObject(otherText1, 150, 140);
        addObject(otherText2, 350, 140);
        addObject(otherText3, 550, 140);
        addObject(otherText4, 150, 440);
        
        
        int accuracy = 100 * (score - wrongAnswers) / score;
        if (accuracy < 0)
            accuracy = 0;
        OtherText otherTextAccuracy = new OtherText("ACCURACY :  " + accuracy + " %", 40, Color.WHITE, new Color(0,0,0, 0 ), Color.BLACK);
        OtherText otherTextMissedQuestions = new OtherText("MISSED QUESTIONS : ", 40, Color.WHITE, new Color(0,0,0, 0 ), Color.BLACK);
        
        addObject(otherTextAccuracy, 840, 140);
        addObject(otherTextMissedQuestions, 870, 200);
        
        
        InstructionsSelectPlayer1 instructionsSelectPlayer1 = new InstructionsSelectPlayer1("RESULTS");
        addObject(instructionsSelectPlayer1, getWidth() / 2, 80);
        
        
        WinntersTrophies4thPlace winntersTrophies4thPlace = new WinntersTrophies4thPlace();
        addObject(winntersTrophies4thPlace, 280, 520);
    }
}
