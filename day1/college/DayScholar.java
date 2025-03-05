package day1.college;

public class DayScholar extends Student {
    private int busNumber;
    private float distance;

    public DayScholar(int studentId, String studentName, String department, String gender, String category, double collegeFee, int busNumber, float distance) {
        super(studentId, studentName, department, gender, category, collegeFee);
        this.busNumber = busNumber;
        this.distance = distance;
    }

    public float getDistance() {
        return distance;
    }

    public void setDistance(float distance) {
        this.distance = distance;
    }

    public int getBusNumber() {
        return busNumber;
    }

    public void setBusNumber(int busNumber) {
        this.busNumber = busNumber;
    }

    @Override
    public double calculateTotalFee() {
        double busFee=0;
        if(this.distance>30 && this.distance<=40){
            busFee=28000;
        }
        else if(this.distance>20 && this.distance<=30){
            busFee=20000;
        }
        else if(this.distance>10 && this.distance<=20){
            busFee=12000;
        }
        else if(this.distance>0 && this.distance<=10){
            busFee=6000;
        }
        return this.getCollegeFee()+busFee;
    }
}
