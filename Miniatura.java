/*
 * Takes code from the following websites:
 * https://alej.alisma.cz/prog1/pg09/
 * https://alej.alisma.cz/prog1/pg05/nahled.html
 */

public class Miniatura {
  public static void main(String[] args) {
    String inputFile;
    int width = 300;
    int height = 150;
    String outputFile;
    boolean squish = false;

    if (args.length == 2) {
      inputFile = args[0];
      outputFile = args[1];
    }
    else if (args.length == 3) {
      inputFile = args[0];
      outputFile = args[2];
      String[] dimensions = args[1].split("x");
      if (dimensions.length != 2) {
        awh.Sys.die("Spatne zadane rozmery (%s)", args[1]);
      }
      String[] fixedDimensions = dimensions[1].split("!", -1);
      if (fixedDimensions.length == 2) {
        squish = true;
        dimensions[1] = fixedDimensions[0];
      }
      width = Integer.parseInt(dimensions[0]);
      height = Integer.parseInt(dimensions[1]);
    }
    else {
      awh.Sys.die("Pouziti: vstup.jpg [VxS] vystup.jpg");
      return;
    }

    awh.Image image = awh.Image.loadFromFile(inputFile);
    if (squish) {
      image.rescale(width, height);
      image.saveToFile(outputFile);
    }
    else {
      double widthScale = (double) image.getWidth() / width;
      double heightScale = (double) image.getHeight() / height;
      double coef;
      if (widthScale > heightScale) {
        coef = widthScale;
      }
      else {
        coef = heightScale;
      }
      int newWidth = (int)(image.getWidth() / coef);
      int newHeight = (int)(image.getHeight() / coef);
      image.rescale(newWidth, newHeight);
      awh.Image outputImage = awh.Image.createEmpty(
        width, height, awh.Color.GRAY
        );
      int x = width - newWidth;
      int y = height - newHeight;
      outputImage.pasteFrom(image, x / 2, y / 2);
      outputImage.saveToFile(outputFile);
    }
  }
}
