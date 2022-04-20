package baseTest.mytest;

public class Student extends Person  {
    int id;
    double mathScore;
    double englishScore;
    double chineseScore;

    public Student(String name, int mathScore, int englishScore, int chineseScore) {
        super.name = name;
        this.mathScore = mathScore;
        this.englishScore = englishScore;
        this.chineseScore = chineseScore;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getMathScore() {
        return mathScore;
    }

    public void setMathScore(int mathScore) {
        this.mathScore = mathScore;
    }

    public double getEnglishScore() {
        return englishScore;
    }

    public void setEnglishScore(int englishScore) {
        this.englishScore = englishScore;
    }

    public double getChineseScore() {
        return chineseScore;
    }

    public void setChineseScore(int chineseScore) {
        this.chineseScore = chineseScore;
    }

    public double getAvgScore() {
        return (this.mathScore + this.englishScore + this.chineseScore) / 3;
    }

    public String getname() {
        return this.name;
    }
}
