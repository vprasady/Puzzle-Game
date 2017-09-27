                                /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be;

/**
 *
 * @author PrasadYeole
 */


/* JigsawImage.java
 * @author: Madan Chaudhary
 * @blog: javaxp.com
 * */

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import fe.optiopics;
import javax.imageio.ImageIO;

public class imagematirx {

	public imagematirx() {
            
            
            try {
			
		//Provide number of rows and column
		int row = 4;
		int col = 4;
		//String path="D:/temp/tg.jpg";
		//BufferedImage originalImgage = ImageIO.read(new File("D:/cutimage/sm.jpg"));
		BufferedImage originalImgage = ImageIO.read(new File("C:\\Users\\Atharva\\Documents\\pajero - Copy.jpg"));
                
                
		//total width and total height of an image
		int tWidth = originalImgage.getWidth();
		int tHeight = originalImgage.getHeight();

		System.out.println("Image Dimension: " + tWidth + "x" + tHeight);
		
		//width and height of each piece
		int eWidth = tWidth / col;
		int eHeight = tHeight / row;

		int x = 0;
		int y = 0;

		for (int i = 0; i < row; i++) {
			y = 0;
			for (int j = 0; j < col; j++) {
				try {
					System.out.println("creating piece: "+i+" "+j);
					
					BufferedImage SubImgage = originalImgage.getSubimage(y, x, eWidth, eHeight);
					//File outputfile = new File("D:/temp/cuth"+i+j+".jpg");
                                        File outputfile = new File("D:/mediumcuth"+i+j+".jpg");
					ImageIO.write(SubImgage, "jpg", outputfile);
					
					y += eWidth;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}

			x += eHeight;
		}

	} catch (IOException e) {
		e.printStackTrace();
	}
	
	}
        public static void main(String[] args){
           
           
            new  imagematirx(); 
        }

 /**   private imagematirx() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }**/
}