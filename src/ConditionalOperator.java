
public class ConditionalOperator{

    private String name;
   private double average;

   public ConditionalOperator(String name, double average){
       this.name=name;
       if(average>0.0)
           if(average<=100.0)
               this.average=average;

   }
   public void setName(String name){
       this.name=name;
   }
   public void setAverage(double average) {
       if (average > 0.0 && average <= 100.0) {
           this.average = average;
       }
   }
       public String getName(){
           return name;
       }
           public double getAverage(){
           return average;
       }
       public String getScoreRecord(double scoreRecord1){
           String ScoreRecord = " ";
       if(average>=90.0)
       ScoreRecord="A";
       else if(average>=80.0)
           ScoreRecord="B";
       else if(average>=70)
           ScoreRecord="C";
       else if(average>=60)
            ScoreRecord="D";
       else if(average>=50)
           ScoreRecord="E";
       else if(average>=40)
               ScoreRecord="Failed";
       else
               ScoreRecord="You can try next year!!";
           return ScoreRecord;
   }

   }
