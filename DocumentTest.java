package assignment11;

abstract class Document{
	protected String name;
	protected double sizeInMB; 
	
	public Document(String name,double sizeInMB) {
		this.name=name;
		this.sizeInMB=sizeInMB;
	}
	
	public abstract void open();
	public abstract void save();
	
	public void printDetails() {
		System.out.println("Document Name: "+name);
		System.out.println("Size: "+sizeInMB+"MB");
	}
}

class PDFDocument extends Document{
	public PDFDocument(String name,double sizeInMB) {
		super(name,sizeInMB);
	}
	public void open() {
		System.out.println("Opening PDF Document: "+name);
	}
	public void save() {
		System.out.println("Saving PDF Document: "+name);
	}
}

class TextDocument extends Document{
	public TextDocument(String name,double sizeInMB) {
		super(name,sizeInMB);
	}
	public void open() {
		System.out.println("Opening Text Document: "+name);
	}
	public void save() {
		System.out.println("Saving Text Document: "+name);
	}
}

class ImageDocument extends Document{
	public ImageDocument(String name,double sizeInMB) {
		super(name,sizeInMB);
	}
	public void open() {
		System.out.println("Opening Image Document: "+name);
	}
	public void save() {
		System.out.println("Saving Image Document: "+name);
	}
}

public class DocumentTest {

	public static void main(String[] args) {
		Document pdf=new PDFDocument("Resume.pdf",1.2);
		Document text=new TextDocument("Notes.txt",0.5);
		Document image=new ImageDocument("Photo.jpg",2.4);
		
		pdf.open();
		pdf.save();
		pdf.printDetails();
		
		System.out.println("----------------------------");
		
		text.open();
		text.save();
		text.printDetails();
		
		System.out.println("----------------------------");
		
		image.open();
		image.save();
		image.printDetails();
	}

}
