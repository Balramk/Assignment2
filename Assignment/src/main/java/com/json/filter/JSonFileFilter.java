package com.json.filter;

import java.io.File;

import org.apache.commons.io.FilenameUtils;
import org.springframework.messaging.Message;

public class JSonFileFilter {
	public boolean isValidFile(Message<File> file) {
		String fileExtension = FilenameUtils.getExtension(file.getPayload().getName());
		if(fileExtension.equals("json")) {
			return true;
		}
		return false;
	}
}
