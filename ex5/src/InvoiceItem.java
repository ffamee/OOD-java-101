public class InvoiceItem {

	private String id;
	private String desc;
	private int qty;
	private double unitPrice;
	
	public InvoiceItem(String i, String d, int q, double u) {
		this.id = i;
		this.desc = d;
		this.qty = q;
		this.unitPrice = u;
	}
	
	public String getId() {
		return this.id;
	}
	
	public String getDesc() {
		return this.desc;
	}
	
	public int getQty() {
		return this.qty;
	}
	
	public void setQty(int q) {
		this.qty = q;
	}
	
	public double getUnitPrice() {
		return this.unitPrice;
	}
	
	public void setUnitPrice(double u) {
		this.unitPrice = u;
	}
	
	public double getTotal() {
		return this.unitPrice * this.qty;
	}
	
	public String toString() {
		return "InvoiceItem[id=" + this.id + ",desc=" + this.desc + ",qty=" + this.qty + ",unitPrice=" + this.unitPrice + "]";
	}

}
