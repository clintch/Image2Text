import org.bytedeco.javacpp.BytePointer;
import org.bytedeco.javacpp.lept;
import org.bytedeco.javacpp.lept.PIX;
import org.bytedeco.javacpp.tesseract.TessBaseAPI;

/**
 * Hello world!
 *
 */
public class Main
{
    public static void main( String[] args )
    {

    	TessBaseAPI instance = new TessBaseAPI();
 
    	//Load the trained data for eng in path \\tesseract\\tessdata must
    	instance.Init("D:\\Java_Projects\\ImageText\\src\\tesseract\\tessdata", "eng");
    	
    	instance.SetImage(lept.pixRead("D:\\Java_Projects\\ImageText\\src\\ECL8R.png"));
		
		//String output will contain the text
    	String output = instance.GetUTF8Text().getString();
    	System.out.println("Output : \n" + output);
    	
    	
    }
}