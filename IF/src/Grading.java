public class Grading{

    private String name;
    private double score;

    public Grading(String name, double score){
        this.name = name;
        if( score > 0.0 && score <= 100)
                this.score = score;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setScore(double score) {
        if( score > 0.0 && score <= 100)
                this.score = score;
}

    public double getScore() {
        return score;
    }

    public String getAverage(){
        String average = " ";

        if (score >= 90.0)
            System.out.println("A");
        else
            if(score >= 80.0)
                System.out.println("B");
        else
            if (score>= 70.0)
                System.out.println("C");
        else
            if(score >= 60.0)
                System.out.println("D");
        else
                System.out.println("FAILED");

        return average;
    }
}