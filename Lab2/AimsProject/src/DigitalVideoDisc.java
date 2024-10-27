
public class DigitalVideoDisc {
	private String title;
	private String category;
	private String directory;
	private int length;
	private float cost;
	
	public DigitalVideoDisc() {
		
	}
	public DigitalVideoDisc(String title) {
		this.title = title;
	}
	public DigitalVideoDisc(String category, String title, float cost) {
		this.title = title;
		this.category = category;
		this.cost = cost;
	}
	public DigitalVideoDisc(String title, String category, String directory, float cost) {
		this.title = title;
		this.category = category;
		this.directory = directory;
		this.cost = cost;
	}
	public DigitalVideoDisc(String title, String category, String directory, float cost, int length) {
		this.title = title;
		this.length = length;
		this.directory = directory;
		this.cost = cost;
		this.category = category;
	}
	
	public String getTitle() {
		return title;
	}
	public String getCategory() {
		return category;
	}
	public String getDirectory() {
		return directory;
	}
	public int getLength() {
		return length;
	}
	public float getCost() {
		return cost;
	}
	
    // Ghi đè phương thức equals
    @Override
    public boolean equals(Object obj) {
        // Kiểm tra nếu đối tượng so sánh chính là đối tượng hiện tại
        if (this == obj) return true;
        
        // Kiểm tra nếu obj là null hoặc không cùng kiểu
        if (obj == null || getClass() != obj.getClass()) return false;
        
        // Ép kiểu obj thành DigitalVideoDisc
        DigitalVideoDisc disc = (DigitalVideoDisc) obj;
        
        // So sánh các thuộc tính
        return title.equals(disc.title) && 
               category.equals(disc.category) && 
               directory.equals(disc.directory) && 
               cost == disc.cost &&
               length == disc.length;
    }
	
}