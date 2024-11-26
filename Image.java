/**
 * 
 */

/**
 * Excercise1.4
 * This is a class implemented an Image and this class contain 4 attribute: 
  height, weight, source, quality

 */
public class Image {
    private int height;
    private int weight;
    private String source;
    private String quality;
    /**
     * 
     * Constructor for the Image class.
     *
     * @param height The height of the image (in pixels).
     * @param weight The width of the image (in pixels).
     * @param source The file name or path to the image source (e.g., "image.gif").
     * @param quality The quality of the image. Can be either "low" or "high".
     * 
     * Ex: 
       + new Image(5, 10, "small.gif", "low");
       + new Image(120, 200, "med.gif", "low");
       + new Image(1200, 1000, "large.gif", "high");

     */
	public Image(int height, int weight, String source, String quality) {
		this.height = height;
		this.weight = weight;
		this.source = source;
		this.quality = quality;
	}
    
}
