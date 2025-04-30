public class circle {
    private double r;
    public circle(){
        this.r=1;
    }
    public circle(double r){
        setR(r);
    }
    public double getR(){
        return r;
    }

    public void setR(double r) {
        if(r>0){
        this.r = r;}
        else{
            this.r=1;
        }
    }

    public double alanhesapla(){
        return Math.PI*r*r;

    }
    public double cevrehesapla(){
        return Math.PI*2*r;
    }

    @Override
    public String toString(){
        return "çember yarıçapı: " + r +
                " çember alanı: " + alanhesapla() +
                " çember çevresi: " + cevrehesapla();
    }


}
