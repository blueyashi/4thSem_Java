public class ComplexM {
    public static void main(String args[]){
        Complex n1 = new Complex(2,3);
        Complex n2 = new Complex(3,4);
        Complex n3 = new Complex();
        Complex n4 = new Complex();
        Complex n5 = new Complex();
        n5.display(n1.real,n1.img,n2.real,n2.img);
        n3.add(n1.real,n1.img,n2.real,n2.img);
        n4.subtract(n1.real,n1.img,n2.real,n2.img);
        n3.display(n3.real,n3.img);
        n4.display(n4.real,n4.img);
        n4.display(n5.real,n5.img);
    }
}
