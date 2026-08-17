/**
 * 
 */
package q4;

/**
 * 
 */
public class complexno {
        int real;
        int img;

        void add(complexno x) {
            complexno r = new complexno();
            r.real = this.real + x.real;
            r.img = this.img + x.img;
            System.out.println("Result is " + r.real + " + " + r.img + "i");
        }

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		complexno c1 = new complexno();
        c1.real = 5;
        c1.img = 2;
        complexno c2 = new complexno();
        c2.real = 3;
        c2.img = 4;
        c1.add(c2);
	}
	
    
}

