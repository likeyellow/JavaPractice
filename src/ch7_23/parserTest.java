package ch7_23;
interface Parseable{
	// ���� �м��۾��� �����Ѵ�
	public abstract void parse(String fileName);
}
class ParserManager{
	
	public static Parseable getParser(String type) { // ����Ÿ���� Parseable �������̽��̴�
		if(type.equals("XML")) {
			return new XMLParser();
		}else {
			Parseable p = new HTMLParser();
			return p;  // return new HTMLParser();
		}
	}
}
class XMLParser implements Parseable{
	public void parse(String fileName) {
		// ���� �м��۾��� �����ϴ� �ڵ带 ���´�
		System.out.println(fileName + "- XML parsing completed.");
	}
}
class HTMLParser implements Parseable{
	public void parse(String fileName) {
		// ���� �м��۾��� �����ϴ� �ڵ带 ���´�
		System.out.println(fileName + "- HTML parsing completed.");
	}
}
public class parserTest {

	public static void main(String[] args) {
		Parseable parser = ParserManager.getParser("XML");
		parser.parse("documnet.xml");
		parser = ParserManager.getParser("HTML");
		parser.parse("document2.html");

	}
}
