package com.gm.utils;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.imageio.ImageIO;

import net.coobird.thumbnailator.Thumbnails;
import net.coobird.thumbnailator.geometry.Positions;

/**
 * Unit test for simple App.
 */
public class AppTest {
	public static void main(String[] args) throws IOException {
		// Thumbnails.of("E:\\t\\b.jpg").scale(0.5f).outputQuality(0.5f).toFile("E:\\t\\b2.jpg");

		/*
		 * Thumbnails.of("E:\\t\\b.jpg").scale(0.5f) .watermark(Positions.BOTTOM_RIGHT,
		 * ImageIO.read(new File("E:\\t\\m.png")), 0.5f).outputQuality(0.8f)
		 * .toFile("E:\\t\\b_w.jpg");
		 */

		Path path = Paths.get("E:\\t\\a.jpg");
		File file = path.toFile();
		if (file.length() > 1000000) {
			Thumbnails.of(file).size(720, 1280)
					.watermark(Positions.BOTTOM_RIGHT, ImageIO.read(new File("E:\\t\\m.png")), 1f).outputQuality(0.8f)
					.toFile("E:\\t\\a_w.jpg");
		}

	}

}
