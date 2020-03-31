package com.example.integration.util;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.springframework.stereotype.Component;

@Component
public class Transformer {

	public String transform(String filePath) throws IOException {

		String contant = new String(Files.readAllBytes(Paths.get(filePath)));
		return "Transformed :" + contant;
	}
}
