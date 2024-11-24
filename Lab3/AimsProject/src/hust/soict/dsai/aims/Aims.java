package hust.soict.dsai.aims;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class Aims {
	public static void main(String[] args) {
		
		int x = 10;
		double y = x;
		
		Cart anOrder = new Cart();
		
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", 
				"Animation", "Roger Allers", 19.95f, 87);
		anOrder.addDigitalVideoDisc(dvd1);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", 
        		"George Lucas", 24.95f, 124);
        anOrder.addDigitalVideoDisc(dvd2);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 
        		29.95f);
        anOrder.addDigitalVideoDisc(dvd3);
        
        System.out.println("Total Cost is: ");
        System.out.println(anOrder.totalCost());
        
        // xoa dvd1
        anOrder.removeDigitalVideoDisc(dvd1);
        
        // tao mot dvd khac dvd1, dvd2, dvd3 va thu xoa.
        DigitalVideoDisc dvd4 = new DigitalVideoDisc("Doraemon", "Animation", 
        		29.95f);
        
        anOrder.removeDigitalVideoDisc(dvd4);
	}
}
