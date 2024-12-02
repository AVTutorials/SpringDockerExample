package com.example.SpringDockerExample.service;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
@Service
public class FileStorageService {
	  private final String directoryPath = "C:\\Users\\Aniket Vaishampayan\\OneDrive - Avisys Services\\Documents\\Demo UI Application for Kubernate\\Demo-Employee Application"; // Specify the directory path here

	    public void storeFile(MultipartFile file) throws IOException {
	        // Check if the directory exists, if not, create it
	        File directory = new File(directoryPath);
	        if (!directory.exists()) {
	            directory.mkdirs();
	        }

	        // Get the file path and store the file
	        Path filePath = Paths.get(directoryPath, file.getOriginalFilename());
	        Files.write(filePath, file.getBytes());
	    }
}
