
public class Cart {
	public static final int MAX_NUMBERS_ORDERED = 20;	
	private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
	private int qtyOrdered = 0;
	
	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		if(qtyOrdered <= 20) {
			
			itemsOrdered[qtyOrdered] = disc;
			qtyOrdered++;
			System.out.println("Da them DVD vao gio hang.");
		}else {
			System.out.println("Gio hang da day.");
		}
	}
	
	public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
		
		int index = -1;
		for(int i=0; i<qtyOrdered; i++) {
			if(itemsOrdered[i].equals(disc)) {
				index = i;
				break;
			}
		}
		
		if(index >= 0) {
			for(int i=index; i<qtyOrdered; i++) {
				itemsOrdered[i] = itemsOrdered[i+1];
			}
			
			itemsOrdered[qtyOrdered-1] = null;
			qtyOrdered--;
			System.out.println("Da xoa DVD.");
		}else {
			System.out.println("Khong tim thay DVD.");
		}
	}
	
	public float totalCost() {
		float sum = 0f;
		for(int i=0; i<qtyOrdered; i++) {
			sum = sum + itemsOrdered[i].getCost();
		}
		return sum;
	}
}
