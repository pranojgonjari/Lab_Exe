package Lab8.pack2;

public class Batch {

	    String batchName; // default access
        int batchCode;
        
	    public Batch(String batchName,int batchCode) {
	        this.batchName = batchName;
	        this.batchCode=batchCode;
	    }

	    public void displayInfo() {
	        System.out.println("Batch Name: " + batchName +" Batch Code "+batchCode);
	    }
}
