package wrap;

public class Gift {
private   Object contents;
protected Object getContents() {
return contents;
}
protected void setContents(Object contents) {
this.contents = contents;
}
public void showPresent() {
System.out.print("Your gift: "+contents);
}
public static void main(String[] treats) {
Gift gift = new Gift();
gift.setContents(gift);
gift.showPresent();
}
}