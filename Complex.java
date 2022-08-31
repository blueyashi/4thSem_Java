public class Complex{
    int real, img;
    Complex(){
        real=1;
        img=1;
    }
    Complex(int real, int img){
        this.real=real;
        this.img=img;
    }
    public void add(int r1, int i1, int r2, int i2){
        this.real = r1+r2;
        this.img = i1+i2;
    }
    public void subtract(int r1, int i1, int r2, int i2){
        this.real = r1-r2;
        this.img = i1-i2;
    }
    public void display(int r1, int i1){
        System.out.println("The result is: "+r1+" +"+i1+"i");
    }
    public void display(int r1, int i1, int r2, int i2)
    {
        System.out.println("The numbers are: "+r1+" +i"+i1+" and "+r2+" +i"+i2);
    }
}

